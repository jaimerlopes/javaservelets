/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

/**
 *
 * @author Acer
 */
public class AuthenticationFilter implements  Filter {


   public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        HttpSession session = httpRequest.getSession(false);

        // Check if the user is logged in
        boolean isLoggedIn = (session != null && session.getAttribute("username") != null);

        // Allow access to login and logout pages
        String requestURI = httpRequest.getRequestURI();
        boolean isLoginPage =  requestURI.endsWith("LoginServlet")|| requestURI.endsWith("index.jsp")||requestURI.endsWith("LogoutServlet");

        if (isLoggedIn || isLoginPage) {
            // User is logged in or accessing the login/logout page
            chain.doFilter(request, response); // Pass the request and response to the next filter or servlet
        } else {
            // Redirect to the login page if the user is not logged in
            httpResponse.sendRedirect("index.jsp");
        }
    }

}
