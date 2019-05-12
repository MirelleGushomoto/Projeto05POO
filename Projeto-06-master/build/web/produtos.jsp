<%-- 
    Document   : produtos
    Created on : 11/05/2019, 20:40:54
    Author     : gabri
--%>

<%@page import="br.com.fatecpg.jdbc.Produtos"%>
<%@page import="br.com.fatecpg.jdbc.Fabricantes"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="WEB-INF/jspf/menu.jspf" %>
        
        <%try{%>
        
        
            
            
            <%
                int id = Integer.parseInt(request.getParameter("id"));
                Fabricantes a = Fabricantes.getFabricantes(id);
                
            %>
            <% if (a !=null){%>
            <div class="alert alert-primary" role="alert" >  <center> Compra dos Clientes
    <%=a.getNome()%></div>
            </hr>
            </hr>
            
            <div class="container">
            <div class="row">
                <div class="col-sm">
                  <table class="table table-hover table-dark">
  <thead>
    <tr>
                            <td class="bg-primary">ID do Fabricante</td>  
             <td class="bg-primary">ID do Produto</td>
             <td class="bg-primary">Preço</td>
             <td class="bg-primary">Quantidade Disponível</td>
             <td class="bg-primary">Lucro</td>
             <td class="bg-primary">Descrição</td>
            
            
            </tr>
            
            <%for (Produtos x: Produtos.getList(id)){%>
            <tr>
                <td><%=x.getFabricanteid()%></td>
                <td><%=x.getProdutoid() %></td>
                <td><%=x.getPreco() %></td>
                <td><%=x.getDisponivel() %></td>
                <td><%=x.getLucro() %></td>
                <td><%=x.getDescricao() %></td>
            
            </tr>
           
            <%}%>
         
            <%}else{%>
            <h3>Fabricante não <%= id %> encontrado!</h3>
            <%}%>
            
            
            
        </table>
        
        <%}catch(Exception e){%>
        <h3 style="color:red">ERRO: <%= e.getMessage() %> </h3>
        <%}%>

        
    </body>
</html>
