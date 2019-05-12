
package br.com.fatecpg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class Fabricantes {
    private int id;
    private String nome;
    private String cidade;
    private String email;
    private String estado;

   public static Fabricantes getFabricantes (int id) throws Exception{
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        String url = "jdbc:derby://localhost:1527/sample";
        Connection con = DriverManager.getConnection(url, "app", "app");
        String SQL = "SELECT * FROM MANUFACTURER WHERE MANUFACTURER_ID = ?";
        PreparedStatement st = con.prepareStatement(SQL);
        st.setInt(1,id);
        ResultSet rs = st.executeQuery();
        Fabricantes  a = null;
       
        if (rs.next()){
            
        a = new Fabricantes(
            
        rs.getInt("MANUFACTURER_ID"),
        rs.getString("NAME"),
        rs.getString("CITY"),
        rs.getString("STATE"),
        rs.getString("EMAIL")
            
            );
            
        }
    rs.close();st.close();con.close();
    return a;
    }
    
    
    public static ArrayList<Fabricantes> getList() throws Exception{
    ArrayList<Fabricantes> list = new ArrayList<>();
    Class.forName("org.apache.derby.jdbc.ClientDriver");
    String url = "jdbc:derby://localhost:1527/sample";
    Connection con = DriverManager.getConnection(url, "app", "app");
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("SELECT * FROM MANUFACTURER");
    while(rs.next()){
        Fabricantes a = new Fabricantes();
        a.setId(rs.getInt("MANUFACTURER_ID"));
        a.setNome(rs.getString("NAME"));
        a.setCidade(rs.getString("CITY"));
        a.setEstado(rs.getString("STATE"));
        a.setEmail(rs.getString("EMAIL"));
        list.add(a);
    }
rs.close();st.close();con.close();
return list;
}
    public Fabricantes() {
    }

    public Fabricantes(int id, String nome, String cidade,String estado, String email) {
        this.id = id;
        this.nome = nome;
        this.cidade = cidade;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    

 public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Fabricantes(String estado) {
        this.estado = estado;
    }

}