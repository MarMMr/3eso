/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conectarbbdd;

import java.sql.*;
 
/**
 *
 * @author Usuario
 */
public class Conectar {
 
    /* Declaramos 5 variables con el driver, la bbdd, usuario y contraseña
    y una para almacenar el error en caso de suceder*/
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String bbdd="jdbc:mysql://localhost:3306/gestion";
    private static final String usuario ="root";
    private static final String clave="";
    private static Connection conex = null;
    private static String error="";
     
    /**
     * 
     * @return Devuelve la conexion a una base de datos
     */
    public static Connection getConexion(){
         
        //Controlar la exscepciones que puedan surgir al conectarnos a la BBDD
        try {
            //Registrar el driver
            Class.forName(driver);
            //crear una conexion a la Base de Datos
            conex = DriverManager.getConnection(bbdd, usuario, clave);
        // Si hay errores informamos al usuario. 
        } catch (Exception e) {
            error = e.getMessage();
            return null;
        }
        // Devolvemos la conexion.
        return conex;
    }
     
    /**
     * 
     * @param conex Parametro que contiene la conexion que se quiere cerrar
     */
    public static void getCerrarConexion(Connection conex){
        try{
            // Cerrar la conexion    
            conex.close(); 
        }catch(SQLException e){
            error = e.getMessage();
        }
    }
    
    /**
     * 
     * @return Devuelve el error en caso de no poder conectar o desconectar
     * de la base de datos.
     */
    public String getError(){
        return error;
    }
    
    private Statement miStatement=null;
    public boolean insertarActualizarRegistros(String consultaSQL) {
        try {
            // Creamos el objeto Statement.
            miStatement=conex.createStatement();
            // Ejecutamos el objeto pasandole la consulta
            // que se le está pasando por parámetro.
            miStatement.executeUpdate(consultaSQL);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
        return true;
    }
    private ResultSet miResultSet = null;
    public ResultSet consultarDatos(String consultaSQL){     
        try {
            // Creamos el objeto Statement.
            miStatement=conex.createStatement();
            // Asignamos la ejecución de la consulta al objeto ResultSet
            miResultSet=miStatement.executeQuery(consultaSQL);
        } catch (Exception e) {
            // Si hay errores no devolvemos nada
            System.out.println(e.getMessage());
            return null;
        }
        //Si todo va bien devolvemos el resultset
        return miResultSet;
    }
}