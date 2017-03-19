<%-- 
    Document   : Registro
    Created on : 18/03/2017, 07:28:58 PM
    Author     : oscar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar usuario</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <style>
  .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 100%;
      height: 350px;
      margin:auto;
      margin-top: 0px;
  }
  .container{
      margin-top: -20px;
  }
        </style>
    </head>
    <body>
        <%@include file="carousel.jsp"%>
        <div class="container">
            <div class="jumbotron">
            <form class="form-group">
                
                    <h3>Nombre:</h3>  
                    <input type="text" name="nombre" class="form-control"> 
                
                
                    <h3>Genero:</h3>
                    <select class="form-control" name="genero">
                        <option>Accion</option>
                        <option>Terror</option>
                        <option>Comedia</option>
                        <option>Drama</option>
                        <option>Ficcion</option>
                        <option>Caricatura</option>
                    </select>
                    
                    <h3>Duracion</h3>  
                    <input type="text" name="duracion" class="form-control"> 
                    
                    <h3>Calificacion</h3>  
                    <select class="form-control" name="calificacion">
                        <option>1</option>
                        <option>2</option>
                        <option>3</option>
                        <option>4</option>
                        <option>5</option>
                    </select> 
                    
                    <h3>disponibilidad</h3>
                    <label class="text-center">
                        <p>disponible</p>
                        <input type="radio" value="disponible" name="dispo" class="form-control">
                    </label>
                    
                    <label class="text-center">
                    <p>no disponible</p>
                    <input type="radio" value="no_disponible" name="dispo" class="form-control">
                    </label>
                    
                    <h3>Estado</h3>  
                    <select class="form-control" name="estado">
                        <option>en stock</option>
                        <option>alquilada</option>
                        <option>en mantenimiento</option>
                        <option>sin ejemplares</option>
                    </select> 
                    
                    <h3>Ejemplares</h3>  
                    <input type="text" name="ejemplares" class="form-control"> 
                    
                    <h3>Quien registra?</h3>  
                    <select class="form-control" name="empleado_registra">
                        <option>juan</option>
                        <option>oscar</option>
                        <option>vanesa</option>
                        <option>daniela</option>
                    </select> 
                    <br>
                    <br>
                    <input type="submit" value="enviar" class="pull-right btn btn-success">
                
            </form>
                </div>
        </div>
    </body>
</html>
