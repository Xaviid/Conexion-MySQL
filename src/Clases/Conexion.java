/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class Conexion {

    public static Connection conexion = null;//ATRIBUTO DE TIPO CONNECTION
    public static Statement sentencia; // ATRIBUTO DE TIPO STATEMENT
    static ResultSet resultado;// ATRIBUTO DE TIPO RESULSET

    public  Connection Conectar() { // METODO PARA ESTABLECER LA CONEXION CON LA BASE DE DATOS
        try {
            Class.forName("com.mysql.jdbc.Driver"); // DIRECCION DEL DRIVER QUE UTILIZAREMOS
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/intsistema?zeroDateTimeBehavior=convertToNull", "root","37911");
            sentencia = conexion.createStatement();// INDICAMOS QUE LA SENTENCIA SE LE ASIGEN LO DE LA CONEXION
            JOptionPane.showMessageDialog(null,"Se ha establecido la conexion");
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "No se ha establecido la conexion" + e.getMessage());//MENSAJE DE ERROR 
        }
        return null;
    }

}