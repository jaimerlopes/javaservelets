/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import model.Rato;

/**
 *
 * @author Acer
 */
public class RegistarRatoController extends HttpServlet {

    ArrayList<Rato> listaRato=new ArrayList<>();
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RegistarRatoController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RegistarRatoController at " + request.getContextPath() + "</h1>");
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
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
        processRequest(request, response);
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
       // processRequest(request, response);
        
        String sdescricao = request.getParameter("descricao");
        String sfornecedor = request.getParameter("fornecedor");
        Integer quantidade = Integer.parseInt(request.getParameter("qtd"));
        Double preco = Double.parseDouble(request.getParameter("preco"));
        String svendas = request.getParameter("vendas");
        
        boolean bvendas;
        if (request.getParameter("vendas") != null && request.getParameter("vendas").equals("sim"))
          bvendas = true;
        else
          bvendas = false;
        
         Rato rato=new Rato(sdescricao,quantidade,sfornecedor,preco,bvendas);
        listaRato.add(rato);
        rato.guardar();
        for(Rato prod : listaRato){
            System.out.println(prod);
        }
        
          response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RegistarRatoController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RegistarRatoController at " + request.getContextPath() + "</h1>");
            out.println(listaRato.get(0));
            out.println("</body>");
            out.println("</html>");
            // Use JavaScript to redirect after a delay (for demonstration purposes)
            out.println("<script type=\"text/javascript\">");
            out.println("setTimeout(function() { window.location.href = 'AfterLogin.jsp'; }, 1000);");  // Redirect after 3 seconds
            out.println("</script>");
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
