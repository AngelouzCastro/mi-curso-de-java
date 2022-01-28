/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author darka
 */
public class Conectar {

    Connection conectar = null;

    public Connection conexion() {
        try {
            Class.forName("org.gjt.mm.mysql.Driver");//.newInstance();
            conectar =   (Connection) DriverManager.getConnection("jdbc:mysql://localhost/rolas", "root", "DARKAR");
            //conectar=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/conexion","root","");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion de la base de datos");
        } catch (ClassNotFoundException ex) {
        }
        return conectar;
    }
}
