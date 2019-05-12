<%-- 
    Document   : fabricantes
    Created on : 29/04/2019, 16:41:16
    Author     : a
--%>

<%@page import="br.com.fatecpg.jdbc.Fabricantes"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
              <link rel="stylesheet" href="resources/css/styles.css">

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="WEB-INF/jspf/menu.jspf" %>
     <div class="alert alert-primary" role="alert" >  <center> Tabela de Fabricantes
    </div>
        <%try{%>
        <div class="container">
            <div class="row">
                <div class="col-sm">
                  <table class="table table-hover table-dark">
  <thead>
    <tr>
                            <td class="bg-primary">ID</td>
                <td class="bg-primary">Nome</td>
                 <td class="bg-primary">Cidade</td>
                 <td class="bg-primary">Estado</td>
                 <td class="bg-primary">E-mail</td>
                 <td class="bg-primary">Lista de Compras</td>

            </tr>
            <%for(Fabricantes a: Fabricantes.getList()){%>
            <tr>
                <td><%=a.getId() %></td>
                <td><%=a.getNome() %></td>
                <td><%=a.getCidade() %></td>
                <td><%=a.getEstado() %></td>
                <td><%=a.getEmail() %></td>
                <td><a href="produtos.jsp?id=<%=a.getId()%>">Ver</a></td>
            </tr>
            <%}%>
        </table>
        
        <%}catch(Exception e){%>
        <h3 style="color:red">ERRO: <%= e.getMessage() %> </h3>
        <%}%>
    </body>
</html>