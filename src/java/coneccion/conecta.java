/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coneccion;

import java.sql.*;
import java.sql.DriverManager;

/**
 *
 * @author oscar
 */
public class conecta {

    Connection conec = null;

    public Connection conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conec = DriverManager.getConnection("jdbc:mysql://localhost/jtablas", "root", "");
            System.out.println("se conecto");
        } catch (Exception es) {
            es.printStackTrace();
        }

        return conec;
    }

}
