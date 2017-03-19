/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coneccion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author oscar
 */
public class conecta {

    Connection conec = null;

    public Connection conexion() {
        try {
            conec = DriverManager.getConnection("jdbc:mysql:/localhost/jtablas", "root", "");
            System.out.println("se conecto");
        } catch (Exception es) {
            es.printStackTrace();
        }

        return conec;
    }

}
