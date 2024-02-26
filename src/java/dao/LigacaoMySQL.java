/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.*;

/**
 *
 * @author pm3df
 */
public class LigacaoMySQL {
    
    public Connection getConnection()
    {
        Connection cnc = null;
        
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cnc = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdratos", "root", "root");
        }
        catch (Exception e)
        {
            String erro = e.getMessage();
            System.out.println("Erro: " + erro);
        }
                
        return cnc;
    }
    
}
