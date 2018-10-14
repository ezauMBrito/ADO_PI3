/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.senac.gerenciadordeprodutos.dao;

import br.senac.gerenciadordeprodutos.model.Produto;
import br.senac.gerenciadordeprodutos.util.ConnectionUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: Ezaú de Matos Brito  <ezau.mbrito@gmail.com>
 * @version:
 * Main Class File:
 * File: ProdutoDAO.java
 * Date: Oct 13, 2018
 */
public class ProdutoDAO {
    private static Connection connection;
    
    public List<Produto> listar() throws ClassNotFoundException, SQLException {
        List<Produto> lista = new ArrayList<>();
        connection = ConnectionUtils.getConnection();
        String sql = "SELECT * FROM PRODUTO";
        PreparedStatement pst = connection.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            Produto p = new Produto();
            p.setId(rs.getInt("ID"));
            p.setNome(rs.getString("NOME"));
            p.setDescricao(rs.getString("DESCRICAO"));
            p.setQuantidade(rs.getInt("QUANTIDADE"));
            p.setPrecoCompra(rs.getBigDecimal("PRECO_COMPRA"));
            p.setPrecoVenda(rs.getBigDecimal("PRECO_VENDA"));
            p.setCategorias(getCategoria(p));
            lista.add(p);
        }
        return lista;
    }
    
    public void add(Produto p) throws ClassNotFoundException, SQLException{
        
       connection = ConnectionUtils.getConnection();

        String sql = "INSERT INTO PRODUTO(nome, descricao, preco_compra, preco_venda, quantidade, dt_cadastro) "
                + "VALUES (?,?,?,?,?,now())";
        

        PreparedStatement pst = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        pst.setString(1, p.getNome());
        pst.setString(2, p.getDescricao());
        pst.setBigDecimal(3, p.getPrecoCompra());
        pst.setBigDecimal(4, p.getPrecoVenda());
        pst.setInt(5, p.getQuantidade());
        pst.execute();

        addProCat(pst,  p);
    }

    private void addProCat(PreparedStatement pst,  Produto p) throws SQLException {
        String sql = "INSERT INTO PRODUTO_CATEGORIA(ID_PRODUTO, ID_CATEGORIA) VALUES(?,?)";
        try (ResultSet rs = pst.getGeneratedKeys()) {
            
            if (rs.next()) {
                int idProd = rs.getInt(1);
                try (PreparedStatement pst2 = connection.prepareStatement(sql)) {
                    for (int i = 0; i < p.getCategorias().length; i++) {
                        pst2.setInt(1, idProd);
                        pst2.setInt(2, p.getCategorias()[i]);
                        pst2.executeUpdate();
                    }

                }
            }
        }
    }

    private int[] getCategoria(Produto p) throws SQLException {
        List<Integer> lista = new ArrayList<>();
        String sql = "SELECT * FROM PRODUTO_CATEGORIA WHERE ID_PRODUTO=?";
        PreparedStatement pst = connection.prepareStatement(sql);
        pst.setInt(1, p.getId());
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            lista.add(rs.getInt(2));
        }
        int[]categorias = new int[lista.size()];
        for (int i = 0; i < categorias.length; i++) {
            categorias[i] = lista.get(i);
            
        }
        return categorias;
    }

    
    
    
}