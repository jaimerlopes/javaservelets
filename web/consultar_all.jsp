<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>

        <meta charset="ISO-8859-1">
        <title>Consulta_ratos</title>
        <style>
            body
            {
                font-family:'sans-serif';
                text-decoration: none;
                color: black;
                background-color: ghostwhite;
            }
            .center 
            {
                margin-left: auto;
                 margin-right: auto;
            }
                
        </style>
    </head>
    <body>
       
            <form action="/ConsultarALLRatos.java" method="post" class="bananaForm">
                <div>
                    <label>Busca pela Descrição: </label><input type="text" name="descricao">
                </div>
                <br>
                <div>
                    <input type="submit" name="Submeter"
                           value="Consultar Produto">
                </div>
            </form>
     
    </body>
</html>
