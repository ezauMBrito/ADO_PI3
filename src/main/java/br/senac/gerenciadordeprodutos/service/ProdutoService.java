/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.senac.gerenciadordeprodutos.service;

import br.senac.gerenciadordeprodutos.dao.ProdutoDAO;
import br.senac.gerenciadordeprodutos.model.Produto;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author: Ezaú de Matos Brito  <ezau.mbrito@gmail.com>
 * @version:
 * Main Class File:
 * File: ProdutoService.java
 * Date: Oct 13, 2018
 */
public class ProdutoService {
    private static ProdutoDAO dao;
    
    public static void add(Produto p) {
        dao = new ProdutoDAO();
        try {
            dao.add(p);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ProdutoService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static List<Produto> listar(){
        dao = new ProdutoDAO();
        try {
            return dao.listar();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ProdutoService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}