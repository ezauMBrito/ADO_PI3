<%-- 
    Document   : lista
    Created on : Oct 13, 2018, 8:15:02 PM
    Author     : Ezaú de Matos Brito  <ezau.mbrito@gmail.com>
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Estoque</title>
    </head>
    <body>
        <c:choose>
        <c:when test="${size == 0}">
            <h1>Estoque vazio!</h1>
            <a href="inserir">Inserir</a>
        </c:when>
        <c:otherwise>
        <h1>Lista de Produtos</h1>
        <hr>

        <table border="1">

            <tr>
                <th>ID</th>
                <th>Nome</th>
                <th>Preço de Compra</th>
                <th>Preço de Venda</th>
                <th>Quantidade</th>
                <th>Categorias</th>
                <th>Descrição</th>
            </tr>

            <c:forEach items="${lista}" var ="p">
                <tr>
                    <td>${p.id}</td>
                    <td>${p.nome}</td>
                    <td>${p.precoCompra}</td>
                    <td>${p.precoVenda}</td>
                    <td>${p.quantidade}</td>
                    <td>
                        <table>
                            <c:forEach items="${p.categorias}" var="cat">
                                <tr><td>Categoria ${cat}</td></tr>
                    </c:forEach>
                        </table>
                        
                    </td>
                    
                    <td>${p.descricao}</td>

                </c:forEach>
            </tr>

        </table>
        </c:otherwise>
        </c:choose>
        <br><a href="inserir">Inserir</a>
    </body>
</html>
