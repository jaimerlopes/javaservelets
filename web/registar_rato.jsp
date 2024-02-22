<%-- 
    Document   : regista_rato
    Created on : 22/02/2024, 19:01:32
    Author     : Acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Regista Rato</title>
    </head>
    <body style ="background-color: ghostwhite">
        <form action="RegistarRatoController.java"name="RegistaRato" method="POST">
            <table class ="center"; border="0" width="500" cellpading="1">
                <thead>
                    <tr>
                        <th colspan="2">Registo de rato</th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td><label>Descrição</label></td>
                        <td><input type="text" name="descricao" value="" size="100"/></td>
                    </tr>
                    <tr>
                        <td><label>Quantidade</label></td>
                        <td><input type="text" name="qtd" value="" size="4" /></td>
                    </tr>
                    <tr>
                        <td><label>Fornecedor</label></td>
                        <td><select name="fornecedor">
                                <option>Mickey LDA. </option>
                                <option>Stuart Little </option>
                                <option>Miami Mice </option>
                                <option>Rizzo </option>
                            </select></td>
                    </tr>
                    <tr>
                        <td><label>Preço(€):</label></td>
                        <td><input type="number" name="preco" value="" size="4"/></td>
                    </tr>
                     <tr>
                        <td><label>Vendido online</label></td>
                        <td><input type="radio" name="vendas" value="sim" <label>Sim</label>
                        <input type="radio" name="vendas" value="Não" <label>Não</label>
                        </td>
                    </tr>
                     <tr>
                         <td colspan="2" style="text-align: center">
                         <input type="reset" value="Limpar"/>
                         <input type="submit" value="Guardar"/>
                         </td>
                    </tr>
                </tbody>
            </table>

        </form>
    </body>
</html>
