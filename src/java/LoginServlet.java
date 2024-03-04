/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;


/**
 *
 * @author Acer
 */
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;


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
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            String password = request.getParameter("password");
             String username = request.getParameter("username");

            // Perform your authentication logic here (e.g., check credentials against a database)
            if (isValidUser(username, password)) {
              HttpSession session = request.getSession();
              session.setAttribute("username", username);

                // Redirect to a welcome page after successful login
                response.sendRedirect("AfterLogin.jsp");
            } else {
                out.println("Invalid login credentials. Please try again.");
            }

            out.close();
    
        }
    }
    
     private boolean isValidUser(String username, String password) {
        // Add your authentication logic here (e.g., check against a database)
        // For simplicity, a basic check is implemented in this example
        return "user123".equals(username) && "pass123".equals(password);
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
