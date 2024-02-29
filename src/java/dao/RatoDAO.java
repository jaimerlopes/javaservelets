/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;


import java.sql.*;
import java.util.ArrayList;
import model.Rato;
import dao.LigacaoMySQL;

/**
 *
 * @author pm3df
 */
public class RatoDAO {
    
    public void RegistarRato(Rato rato)
    {
        
        PreparedStatement sta = null, sta_contador = null;
        Connection cnc = null;
        
        try
        {
                        
            cnc = new LigacaoMySQL().getConnection();
            
            String sql_contadora = "SELECT COUNT(*) AS rowcount FROM tratos";
            sta_contador = cnc.prepareStatement(sql_contadora);
            ResultSet rs = sta_contador.executeQuery(sql_contadora);
            rs.next();
            int nratos = rs.getInt("rowcount");
       
            String sql = "INSERT INTO tratos VALUES (?,?,?,?,?,?)";
            
            sta = cnc.prepareStatement(sql);
            
            sta.setInt(1, nratos+1);
            sta.setString(2, rato.getDescricao());
            sta.setInt(3, rato.getQuantidade());
            sta.setString(4, rato.getFornecedor());
            sta.setDouble(5,rato.getPreco());
             System.out.print("online\n: " + rato.getOnline());   
            sta.setBoolean(6,rato.getOnline());
            
            sta.executeUpdate();
        }
        catch (Exception e)
        {
            String erro = e.getMessage();
            System.out.print("Erro: " + erro);   
        }
        finally {
            try{
                if (sta != null)
                    sta.close();
            }
            catch (Exception e2) {
                  String erro2 = e2.getMessage();
                  System.out.print("Erro: " + erro2);
            }
            
            try {
                if (cnc != null)
                    cnc.close();
            }
            catch (Exception e3) {
                String erro3 = e3.getMessage();
                System.out.print("Erro: " + erro3);
            }
                
         }
    }
    
   static  public ArrayList< Rato> BuscarRatosPorDescricao(String descricao)
    {
            String sql = "SELECT * FROM  bdratos.tratos WHERE descricao LIKE '%" + descricao + "%'";
            
            ResultSet rs = null;
            
            Connection cnc = null;
            
            PreparedStatement sta = null;
            
            Rato rato = null;
        
            ArrayList <Rato> ratos = null;
            
            try
            {
                cnc = new LigacaoMySQL().getConnection();
                
                sta = cnc.prepareStatement(sql);
                
                rs = sta.executeQuery();
                
                if (rs != null)
                {
                    ratos = new ArrayList<Rato>();
                    
                    while (rs.next())
                    {
                        rato = new Rato();
                        rato.setId(rs.getInt("id"));
                        rato.setDescricao(rs.getString("descricao"));
                        rato.setQuantidade(rs.getInt("quantidade"));
                        rato.setFornecedor(rs.getString("Fornecedor"));
                        rato.setPreco(rs.getDouble("preco"));
                        rato.setOnline(rs.getBoolean("online"));
                        
                        ratos.add(rato);
                        
                    }
                }
                    
            }
            catch (Exception e)
            {
                String erro = e.getMessage();
                System.out.println("Erro: " + erro);
            }
            finally {
            try{
                if (sta != null)
                    sta.close();
            }
            catch (Exception e2) {
                  String erro2 = e2.getMessage();
                  System.out.print("Erro: " + erro2);
            }
            
            try {
                if (cnc != null)
                    cnc.close();
            }
            catch (Exception e3) {
                String erro3 = e3.getMessage();
                System.out.print("Erro: " + erro3);
            }
         }   
            
            return ratos;
    }
     
static public ArrayList< Rato> BuscarAllRatos()
    {
            String sql = "SELECT * FROM  bdratos.tratos";
            
            ResultSet rs = null;
            
            Connection cnc = null;
            
            PreparedStatement sta = null;
            
            Rato rato = null;
        
            ArrayList <Rato> ratos = null;
            
            try
            {
                cnc = new LigacaoMySQL().getConnection();
                
                sta = cnc.prepareStatement(sql);
                
                rs = sta.executeQuery();
                
                if (rs != null)
                {
                    ratos = new ArrayList<Rato>();
                    
                    while (rs.next())
                    {
                        rato = new Rato();
                        rato.setId(rs.getInt("id"));
                        rato.setDescricao(rs.getString("descricao"));
                        rato.setQuantidade(rs.getInt("quantidade"));
                        rato.setFornecedor(rs.getString("Fornecedor"));
                        rato.setPreco(rs.getDouble("preco"));
                        rato.setOnline(rs.getBoolean("online"));
                        
                        ratos.add(rato);
                        
                    }
                }
                    
            }
            catch (Exception e)
            {
                String erro = e.getMessage();
                System.out.println("Erro: " + erro);
            }
            finally {
            try{
                if (sta != null)
                    sta.close();
            }
            catch (Exception e2) {
                  String erro2 = e2.getMessage();
                  System.out.print("Erro: " + erro2);
            }
            
            try {
                if (cnc != null)
                    cnc.close();
            }
            catch (Exception e3) {
                String erro3 = e3.getMessage();
                System.out.print("Erro: " + erro3);
            }
         }   
            
            return ratos;
    }
}
