/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author JP
 */
public class ConexionBaseDeDatos {
     private final String url="jdbc:mysql://localhost:3306/transportes_ultrarrapidos_sa";//url de MySQL
    private final String usuario="root";// usuario de mysql local
    private final String clave="root"; 
    private Connection conexion=null;  
    
    public Connection conectar(){   
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexion=DriverManager.getConnection( url, usuario,clave);
        }  catch (SQLException | ClassNotFoundException ex) {
        }         
        return conexion;        
    }
    
}
