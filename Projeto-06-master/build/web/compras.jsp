<%-- 
    Document   : compras
    Created on : 03/05/2019, 18:09:26
    Author     : gabri
--%>

<%@page import="br.com.fatecpg.jdbc.Customer"%>
<%@page import="br.com.fatecpg.jdbc.Compras"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Compras</title>
    </head>
    <body>
        <%@include file="WEB-INF/jspf/menu.jspf" %>        
        <%try{%>
        
        
            
            
            <%
                int id = Integer.parseInt(request.getParameter("id"));
                Customer c = Customer.getCustomer(id);
                
            %>
            <% if (c !=null){%>
               <div class="alert alert-primary" role="alert" >  <center> Compra dos Clientes
    </div>
            </hr>
            </hr>
            
          <div class="container">
            <div class="row">
                <div class="col-sm">
                  <table class="table table-hover table-dark">
  <thead>
    <tr>
        <td class="bg-primary">ID do Cliente</td>  
            <td class="bg-primary">ID do Produto</td>
            <td class="bg-primary">Quantidade</td>
            <td class="bg-primary">Valor</td>
            <td class="bg-primary">Data da Compra</td>
            <td class="bg-primary">Data de Envio</td>
            <td class="bg-primary">Companhia</td>
            
            </tr>
            
            <%for (Compras y: Compras.getList(id)){%>
            <tr>
                
                <td><%=y.getIdcliente() %></td>
                <td><%=y.getIdproduto() %></td>
                <td><%=y.getQuantidade() %></td>
                <td><%=y.getValor() %></td>
                <td><%=y.getDtcompra() %></td>
                <td><%=y.getDtenvio() %></td>
                <td><%=y.getCompanhia() %></td>
            </tr>
           
            <%}%>
         
            <%}else{%>
            <h3>Cliente não <%= id %> encontrado!</h3>
            <%}%>
            
            
            
        </table>
        
        <%}catch(Exception e){%>
        <h3 style="color:red">ERRO: <%= e.getMessage() %> </h3>
        <%}%>

        
    </body>
</html>
