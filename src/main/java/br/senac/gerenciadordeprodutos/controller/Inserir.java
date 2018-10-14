/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.gerenciadordeprodutos.controller;

import br.senac.gerenciadordeprodutos.model.Produto;
import br.senac.gerenciadordeprodutos.service.ProdutoService;
import java.io.IOException;
import java.math.BigDecimal;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ezaú de Matos Brito  <ezau.mbrito@gmail.com>
 */
@WebServlet(name = "Inserir", urlPatterns = {"/inserir"})
public class Inserir extends HttpServlet {

   

   
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher =
                request.getRequestDispatcher(
                        "/WEB-INF/view/formulario.jsp");
        dispatcher.forward(request, response);
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Produto p = new Produto();
        String msg;
        try {
            String nome = request.getParameter("nome");
            String descricao = request.getParameter("descricao");
            BigDecimal compra = new BigDecimal(request.getParameter("compra"));
            BigDecimal venda = new BigDecimal(request.getParameter("venda"));
            int quantidade = Integer.parseInt(request.getParameter("quantidade"));
            String[] categoriasStr = request.getParameterValues("categorias");
            int[] categorias = new int[categoriasStr.length];
            for (int i = 0; i < categoriasStr.length; i++) {
                categorias[i] = Integer.parseInt(categoriasStr[i]);
            }
            p.setNome(nome);
            p.setDescricao(descricao);
            p.setPrecoCompra(compra);
            p.setPrecoVenda(venda);
            p.setQuantidade(quantidade);
            p.setCategorias(categorias);
            ProdutoService.add(p);
            msg = "Produto inserido com sucesso!";
        } catch (NumberFormatException e) {
            msg = "Erro ao inserir produto!";
        }
        request.setAttribute("msg", msg);
        RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/resultado.jsp");
        rd.forward(request, response);
    }


}
