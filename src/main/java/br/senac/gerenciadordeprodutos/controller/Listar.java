/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.gerenciadordeprodutos.controller;

import br.senac.gerenciadordeprodutos.model.Produto;
import br.senac.gerenciadordeprodutos.service.ProdutoService;
import java.io.IOException;
import java.util.List;
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
@WebServlet(name = "Listar", urlPatterns = {"/listar"})
public class Listar extends HttpServlet {

   

 
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
        List<Produto> lista = ProdutoService.listar();
        int size = lista.size();
        request.setAttribute("size", size);//se size = 0 a lista está vazia.
        request.setAttribute("lista", lista);
        RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/lista.jsp");
        rd.forward(request, response);
    }

   

   

}
