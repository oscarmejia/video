<%-- 
    Document   : listar
    Created on : 20/03/2017, 03:23:12 PM
    Author     : oscar
--%>

<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">

        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="css/estilo.css">
    </head>
    <body>
        <%@include file="carousel.jsp"%>
        <div class="container">
            <div class="jumbotron">
                <table class="table table-hover">
                    <thead>
                        <tr>
                            <th>Id</th>
                            <th>Nombre</th>
                            <th>Disponibilidad</th>
                            <th>Opciones</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            ResultSet rst = (ResultSet) request.getAttribute("lista");

                            while (rst.next()) {
                        %>
                        <tr>
                            <td><%= rst.getString(1)%></td>
                            <td><%= rst.getString(2)%></td>
                            <td><%= rst.getString(3)%></td>
                            <td>
                                <a class="btn btn-success"><span class="glyphicon glyphicon-eye-open"></span></a>
                                <a class="btn btn-primary"><span class="glyphicon glyphicon-edit"></span></a>
                                <a class="btn btn-danger"><span class="glyphicon glyphicon-remove-sign"></span></a>
                            </td>
                        </tr>
                        <%
                            }
                        %>
                    </tbody>
                </table>
            </div>
        </div>
    </body>
</html>
