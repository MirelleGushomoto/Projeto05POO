/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecpg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author gabri
 */
public class Compras {
    private String idcliente;
    private int idproduto;
    private String quantidade;
    private String valor;
    private String dtcompra;
    private String dtenvio;
    private String companhia;
    

    public static ArrayList<Compras> getList(int comprasid) throws Exception{
        
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        String url = "jdbc:derby://localhost:1527/sample";
        Connection con = DriverManager.getConnection(url, "app", "app");
        String SQL = "SELECT * FROM PURCHASE_ORDER WHERE CUSTOMER_ID = ?";
        PreparedStatement st = con.prepareStatement(SQL);
        st.setInt(1,comprasid);
        ResultSet rs = st.executeQuery();
        
        ArrayList<Compras> list = new ArrayList<>();  
        while (rs.next()){
            Compras y = new Compras(
            
            rs.getString("CUSTOMER_ID"),
            rs.getInt("PRODUCT_ID"),
            rs.getString("QUANTITY"),
            rs.getString("SHIPPING_COST"),
            rs.getString("SALES_DATE"),
            rs.getString("SHIPPING_DATE"),
            rs.getString("FREIGHT_COMPANY")
            
            );
            list.add(y);    
        }
    rs.close();st.close();con.close();
    return list;
    }

    public Compras() {
    }
    
    
    
    public Compras(String idcliente,int idproduto, String quantidade, String valor, String dtcompra, String dtenvio, String companhia) {
        this.idcliente = idcliente;
        this.idproduto = idproduto;
        this.quantidade = quantidade;
        this.valor = valor;
        this.dtcompra = dtcompra;
        this.dtenvio = dtenvio;
        this.companhia = companhia;
        
    }

     public String getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(String idcliente) {
        this.idcliente = idcliente;
    }

    public int getIdproduto() {
        return idproduto;
    }

    public void setIdproduto(int idproduto) {
        this.idproduto = idproduto;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getDtcompra() {
        return dtcompra;
    }

    public void setDtcompra(String dtcompra) {
        this.dtcompra = dtcompra;
    }

    public String getDtenvio() {
        return dtenvio;
    }

    public void setDtenvio(String dtenvio) {
        this.dtenvio = dtenvio;
    }

    
    public String getCompanhia() {
        return companhia;
    }

    public void setCompanhia(String companhia) {
        this.companhia = companhia;
    }
}

