<%-- 
    Document   : Modal
    Created on : 21/03/2017, 01:23:48 AM
    Author     : oscar
--%>

<%@page import="coneccion.conecta"%>
<%@page import="java.sql.*"%>
<!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog modal-lg">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">INFORMACION COMPLETA</h4>
        </div>
        <div class="modal-body">
            <h1>hola</h1>
            <div class="container">
            <table class="table-hover">
                <thead>
                    <tr>
                        <th>Id</th>&nbsp
                        <th>Nombre</th>&nbsp
                        <th>Genero</th>&nbsp
                        <th>Duracion</th>&nbsp
                        <th>Calificacion</th>&nbsp
                        <th>Disponibilidad</th>&nbsp
                        <th>Estado</th>&nbsp
                        <th>Ejemplares</th>&nbsp
                        <th>Emplado que registra</th>
                    </tr>
                </thead>
                <tbody>   
                    <%
                        try {
                        ResultSet rs = (ResultSet) request.getAttribute("lista");
                        while (rs.next()) {
                    
                    %>
                    <tr>
                        <td><%= rs.getString(1) %></td>
                        <td><%= rs.getString(2) %></td>
                        <td><%= rs.getString(3) %></td>
                        <td><%= rs.getString(4) %></td>
                        <td><%= rs.getString(5) %></td>
                        <td><%= rs.getString(6) %></td>
                        <td><%= rs.getString(7) %></td>
                        <td><%= rs.getString(8) %></td>
                        <td><%= rs.getString(9) %></td>
                    </tr>
                    
                    <%
                        }
}catch(Exception e){
e.printStackTrace();
}
                    %>
                </tbody>
            </table>                      
            
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
      
    </div>
  </div>
