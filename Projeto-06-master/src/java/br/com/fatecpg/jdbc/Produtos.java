
package br.com.fatecpg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author gabri
 */
public class Produtos {
    
    private int produtoid;
    private String fabricanteid;
    private String preco;
    private String disponivel;
    private String lucro;
    private String descricao;

    
    public static ArrayList<Produtos> getList(int produtoid) throws Exception{
        
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        String url = "jdbc:derby://localhost:1527/sample";
        Connection con = DriverManager.getConnection(url, "app", "app");
        String SQL = "SELECT * FROM PRODUCT WHERE MANUFACTURER_ID = ?";
        PreparedStatement st = con.prepareStatement(SQL);
        st.setInt(1,produtoid);
        ResultSet rs = st.executeQuery();
        
        ArrayList<Produtos> list = new ArrayList<>();  
        while (rs.next()){
            Produtos x = new Produtos(
                    
            rs.getString("MANUFACTURER_ID"),
            rs.getInt("PRODUCT_ID"),
            rs.getString("PURCHASE_COST"),
            rs.getString("QUANTITY_ON_HAND"),
            rs.getString("MARKUP"),
            rs.getString("DESCRIPTION")
            
            
            );
            list.add(x);    
        }
    rs.close();st.close();con.close();
    return list;
    }
    
    
    public Produtos() {
    }

    public Produtos( String fabricanteid, int produtoid, String preco, String disponivel, String lucro, String descricao) {
        this.fabricanteid = fabricanteid;
        this.produtoid = produtoid;
        this.preco = preco;
        this.disponivel = disponivel;
        this.lucro = lucro;
        this.descricao = descricao;
    }

    public int getProdutoid() {
        return produtoid;
    }

    public void setProdutoid(int produtoid) {
        this.produtoid = produtoid;
    }

    public String getFabricanteid() {
        return fabricanteid;
    }

    public void setFabricanteid(String fabricanteid) {
        this.fabricanteid = fabricanteid;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(String disponivel) {
        this.disponivel = disponivel;
    }

    public String getLucro() {
        return lucro;
    }

    public void setLucro(String lucro) {
        this.lucro = lucro;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
           
    
}
