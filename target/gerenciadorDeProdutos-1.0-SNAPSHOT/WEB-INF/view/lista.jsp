<%-- 
    Document   : lista
    Created on : Oct 13, 2018, 8:15:02 PM
    Author     : Ezaú de Matos Brito  <ezau.mbrito@gmail.com>
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Estoque</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    </head>
    <body>
        <c:choose>
            <c:when test="${size == 0}">
                <div class="container">
                    <div class="jumbotron">
                    <h1 class="display-3">Estoque vazio!</h1>
                
                <a class="btn btn-primary"href="inserir">Adicionar Produtos</a>
                </div>
                    </div>
                    
            </c:when>
            <c:otherwise>
                <div class="container">
                    <div class="jumbotron">
                        <h1 class="display-3">Lista de Produtos</h1>
                        <hr>
                         <a class="btn btn-primary"href="inserir">Inserir</a>
                    </div>
                </div>        
                    <div class="container">
                <table class="table-bordered table-condensed">

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
                    </div>
                    </div>
            </c:otherwise>
        </c:choose>
        
    </body>
</html>
