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
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>

    </head>
    <body>

        <div class="container">
            <div class="jumbotron">
                <h1 class="display-3">Cadastrar Produto</h1>
                <hr>
                <div class="col-3">
                    <div class="list-group">
                    <a class="list-group-item" href="listar"> Listar</a>
                <a class="list-group-item" href="index.html"> Home</a>
                </div>
                </div>
            </div>     
            <form action="inserir" method="post">

                <div class="form-group">
                    <label>Nome</label>
                    <input type="text" class="form-control" name="nome" placeholder="Inserir nome..." oninvalid="this.setCustomValidity('Campo obrigatório!')" required>
                </div>


                <div class="form-group">
                    <label>Preço de compra</label>
                    <input type="text" class="form-control" name="compra" placeholder="9.99" oninvalid="this.setCustomValidity('Campo obrigatório!')" required>
                </div>


                <div class="form-group">
                    <label>Preço de venda</label>
                    <input type="text" class="form-control" name="venda" placeholder="9.99" oninvalid="this.setCustomValidity('Campo obrigatório!')" required>
                </div>


                <div class="form-group">
                    <label>Quantidade</label>
                    <input type="text" class="form-control" name="quantidade" placeholder="10" oninvalid="this.setCustomValidity('Campo obrigatório!')" required>
                </div>


                <div class="form-group">
                    <label>Descrição</label>
                    <textarea name="descricao" class="form-control"  placeholder="Descreva o produto..." oninvalid="this.setCustomValidity('Campo obrigatório!')" required></textarea>
                </div>

                <div class="form-group">

                    <label>Categorias</label>
                    <div>
                        <label>
                            <input type="checkbox" name="categorias" value="1">Categoria 1
                        </label>

                        <label>
                            <input type="checkbox" name="categorias" value="2">Categoria 2
                        </label>

                        <label>
                            <input type="checkbox" name="categorias" value="3">Categoria 3
                        </label>

                        <label>
                            <input type="checkbox" name="categorias" value="4">Categoria 4
                        </label>

                        <label>
                            <input type="checkbox" name="categorias" value="5">Categoria 5 
                        </label>

                    </div>

                </div>

                <input type="submit" class="btn-d"value="Salvar">
            </form>
        </div>

        <br>


    </body>
</html>
