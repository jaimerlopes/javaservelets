/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package model;

import dao.RatoDAO;
import jakarta.servlet.http.HttpServlet;
import java.util.ArrayList;
/**
 *
 * @author pm3df
 */
public class Rato extends HttpServlet {
    
    // atributos
    private int id;
    private String descricao, fornecedor;
    private int quantidade;
    private double preco;
    private boolean online;
    
    // métodos
    // construtor modelo
    public Rato()
    {
        
    }
    
    // outro para usar os atributos
    public Rato(int id, String descricao, int quantidade, String fornecedor, double preco, boolean online)
    {
        this.id = id;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.fornecedor = fornecedor;
        this.preco = preco;
        this.online = online;
    }
    
    // outro sem o id, porque não estamos a usá-lo
    public Rato(String descricao, int quantidade, String fornecedor, double preco, boolean online)
    {
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.fornecedor = fornecedor;
        this.preco = preco;
        this.online = online;
    }
    
    // getters e setters

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }
    
    public String getFornecedor() {
        return fornecedor;
    }

    public double getPreco() {
        return preco;
    }

    public boolean getOnline() {
        return online;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public void setFornecedor (String fornecedor) {
        this.fornecedor = fornecedor;
    }
            

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }
    
    public void guardar()
    {
        RatoDAO r = new RatoDAO();
       
       r.RegistarRato(this);    
    }
    
    
    public static ArrayList<Rato> consultar(String descricao)
    {
        RatoDAO r = new RatoDAO();
       return  r.BuscarRatosPorDescricao(descricao);
        
    }
    
    @Override
    public String toString(){
        return "rato Id="+ id+" Desc="+ descricao+" Fornecedor="+ fornecedor+" Quantidade="+quantidade+" Preco="+preco+" online="+online;
    }
    
}    