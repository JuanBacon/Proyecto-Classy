package control;

import java.sql.*;


public class BaseDatos {

    Connection conexion;
    Statement st;

    public BaseDatos() {
        //conexion
    }

    public Connection getConexion() {
        return conexion;
    }

    public Statement getSt() {
        return st;
    }

    /**
     * Método utilizado para establecer la conexión con la base de datos
     *
     * @return estado regresa el estado de la conexión, true si se estableció la
     * conexión, falso en caso contrario
     */
    public boolean crearConexion() {
        boolean t = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");                                      //user  //pass
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/classy", "root", "root");
            st = conexion.createStatement();

            t = true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            t = false;
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            t = false;
        } 
        

        return t;
    }

    // Hola Mundo!
}
