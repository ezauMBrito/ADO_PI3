<%-- 
    Document   : formulario
    Created on : Oct 13, 2018, 8:14:50 PM
    Author     : Ezaú de Matos Brito  <ezau.mbrito@gmail.com>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inserir Produtos</title>
    </head>
    <body>
        <h1>Inserir Produtos</h1><hr><br>
        <form action="inserir" method="post">
            Nome:<input type="text" name="nome"><br>
            Preço de compra:<input type="text" name="compra"><br>
            Preço de venda:<input type="text" name="venda"><br>
            Quantidade:<input type="text" name="quantidade"><br>
            Descrição:<br><textarea name="descricao" rows="5" cols="30" ></textarea>
            <br>Categorias:<br>
            <input type="checkbox" name="categorias" value="1">Categoria 1<br>
            <input type="checkbox" name="categorias" value="2">Categoria 2<br>
            <input type="checkbox" name="categorias" value="3">Categoria 3<br>
            <input type="checkbox" name="categorias" value="4">Categoria 4<br>
            <input type="checkbox" name="categorias" value="5">Categoria 5 <br>
            <input type="submit" value="Salvar">
        </form><br>
        <a href="listar"> Listar</a>
        <a href="index.html"> Home</a>
        
    </body>
</html>
