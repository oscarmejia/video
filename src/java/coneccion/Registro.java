/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coneccion;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author oscar
 */
public class Registro extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
      
        conecta c = new conecta();
        Connection con=c.conexion();
        
        String Nombre=request.getParameter("nombre");
        String Genero=request.getParameter("genero");
        String Duracion=request.getParameter("duracion");
        String Calificaion=request.getParameter("calificacion");
        String Disponibilidad=request.getParameter("dispo");
        String Estado=request.getParameter("estado");
        String Ejemplares=request.getParameter("ejemplares");
        String EmpleadoRegistra=request.getParameter("empleado_registra");
        String insercion="INSERT INTO videoclub (nombre, genero, duracion, calificacion, disponibilidad, estado, ejemplares, empleado_registro) VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement stm=con.prepareStatement(insercion);
            stm.setString(1, Nombre);
            stm.setString(2, Genero);
            stm.setString(3, Duracion);
            stm.setString(4, Calificaion);
            stm.setString(5, Disponibilidad);
            stm.setString(6, Estado);
            stm.setString(7, Ejemplares);
            stm.setString(8, EmpleadoRegistra);
            stm.executeUpdate();
            stm.close();
            con.close();
            
            response.sendRedirect("Ingreso.jsp");
        }catch(Exception ese){
            ese.printStackTrace();
            response.sendRedirect("error.jsp");
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.sql.SQLException
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
