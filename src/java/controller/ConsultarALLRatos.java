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
public class ConsultarALLRatos extends HttpServlet {

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
 
             ArrayList<Rato> listaRato=new ArrayList<>();
             //listaRato=Rato.consultar(sdescricao);
             listaRato=Rato.consultarAll();
             
             
          response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet consultarRatoController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet consultarRatoController at " + request.getContextPath() + "</h1>");
            out.println("<table  border ='1'");
      

                for( Rato x: listaRato){
                    out.println("<tr>");
                    out.println("<th>");
                    out.println(x.getId());
                    out.println("</th>");
                    out.println("<th>");
                    out.println(x.getDescricao());
                    out.println("</th>");
                    out.println("<th>");
                    out.println(x.getQuantidade());
                    out.println("</th>");
                    out.println("<th>");
                    out.println(x.getFornecedor());
                    out.println("</th>");
                    out.println("<th>");
                    out.println(x.getPreco());
                    out.println("</th>");
                    out.println("<th>");
                    out.println(x.getOnline());
                    out.println("</th>");
                    out.println("</tr>");
                }
       
            
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
            
             ArrayList<Rato> listaRato=new ArrayList<>();
             //listaRato=Rato.consultar(sdescricao);
             listaRato=Rato.consultarAll();
             
             
          response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet consultarRatoController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet consultarRatoController at " + request.getContextPath() + "</h1>");
            out.println("<table  border ='1'");
      

                for( Rato x: listaRato){
                    out.println("<tr>");
                    out.println("<th>");
                    out.println(x.getId());
                    out.println("</th>");
                    out.println("<th>");
                    out.println(x.getDescricao());
                    out.println("</th>");
                    out.println("<th>");
                    out.println(x.getQuantidade());
                    out.println("</th>");
                    out.println("<th>");
                    out.println(x.getFornecedor());
                    out.println("</th>");
                    out.println("<th>");
                    out.println(x.getPreco());
                    out.println("</th>");
                    out.println("<th>");
                    out.println(x.getOnline());
                    out.println("</th>");
                    out.println("</tr>");
                }
       
       out.println("<div class = center><a href =\"index.html\"><img src=\"imagens/carrinho.png\" width=\"35\" height=\"35\" alt=\"carrinho\"/> Registar rato </a>    <br>  <br>");
            out.println("</body>");
            out.println("</html>");
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
