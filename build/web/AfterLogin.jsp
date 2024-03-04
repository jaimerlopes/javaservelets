<!DOCTYPE html>
<!--
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Html.html to edit this template
-->
<html>
    <head>
   <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
        <title>Aqui h� rato!</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style>
            body
            {
                font-family:'sans-serif';
                font-size: 35px;
                text-decoration: none;
                color: black;
                background-color: ghostwhite;
            }
            h2
            {
                text-align: center;
                color: black;
            }
            .center
            {
                text-align : center;
            }
            div
            {
                margin-top: 50px;
            }

        </style>
    </head>
    <body>
          
    <%
        // Check if the user is logged in
        //HttpSession session = request.getSession(false);
        if (session != null && session.getAttribute("username") != null) {
            String username = (String) session.getAttribute("username");
    %>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="container-fluid">
                <div class="navbar-collapse justify-content-end">
                    <ul class="navbar-nav">
                        <li class="nav-item">
                            <!-- Replace 'John Doe' with the actual username -->
                            <span class="nav-link  border p-2 " >Welcome back, <%= username %>!</span>
                        </li>
                        <li class="nav-item">
                           <a class="nav-link btn btn-outline-danger" href="javascript:void(0);" onclick="logout()">logout</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>

    <%
        } else {
            // Redirect to the login page if the user is not logged in
            response.sendRedirect("login.jsp");
        }
    %>

    

        <div class = center>

            <a href ="registar_rato.jsp">
            <img src="imagens/carrinho.png" width="35" height="35" alt="carrinho"/> Registar rato </a> 

        <br>
        <br>

            <a href="consultar_ratos.jsp">
            <img src="imagens/carrinho.png" width="35" height="35" alt="carrinho" /> Consultar rato </a>
        <br>
        <br>


            <a href="ConsultarALLRatos">
            <img src="imagens/carrinho.png" width="35" height="35" alt="carrinho" /> Ver todos os produtos </a>
        <br><!-- comment -->
        <br><!-- comment -->
         <!-- Adicione a biblioteca jQuery (JavaScript) -->

    <!-- Adicione o JavaScript para enviar uma solicita��o POST quando o link � clicado -->
<script>
    function chamarServlet() {
        // Crie uma nova inst�ncia de XMLHttpRequest
        var xhr = new XMLHttpRequest();

        // Configure a solicita��o POST para "/seuservlet"
        xhr.open("POST", "ConsultarALLRatos", true);

        // Defina o cabe�alho da solicita��o (opcional)
        xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");

        // Configurar a fun��o de retorno de chamada quando a solicita��o � conclu�da
        xhr.onreadystatechange = function() {
            if (xhr.readyState === 4 && xhr.status === 200) {
                // A resposta est� pronta e a solicita��o foi bem-sucedida
                console.log("Resposta do servidor:", xhr.responseText);
                  document.write( xhr.responseText);
            }
        };

        // Enviar a solicita��o POST (pode incluir dados no corpo da solicita��o)
        xhr.send();
    }
        function logout() {
        // Crie uma nova inst�ncia de XMLHttpRequest
        var xhr = new XMLHttpRequest();

        // Configure a solicita��o POST para "/seuservlet"
        xhr.open("POST", "LogoutServlet", true);

        // Defina o cabe�alho da solicita��o (opcional)
        xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");

        // Configurar a fun��o de retorno de chamada quando a solicita��o � conclu�da
        xhr.onreadystatechange = function() {
            if (xhr.readyState === 4 && xhr.status === 200) {
                // A resposta est� pronta e a solicita��o foi bem-sucedida
                console.log("Resposta do servidor:", xhr.responseText);
                  document.write( xhr.responseText);
            }
        };

        // Enviar a solicita��o POST (pode incluir dados no corpo da solicita��o)
        xhr.send();
    }
</script>

    <!-- Crie o link e chame a fun��o JavaScript quando o link � clicado -->
    <a href="javascript:void(0);" onclick="chamarServlet()">Clique aqui para chamar o Servlet com M�todo POST</a>
    </div>
</body>
</html>
