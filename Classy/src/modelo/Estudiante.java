/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import control.BaseDatos;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Usuario
 */
public class Estudiante {

    private String id_estudiante;
    private String nombre1_estudiante;
    private String nombre2_estudiante;
    private String apellido1_estudiante;
    private String apellido2_estudiante;
    private String correo_estudiante;
    private Date fecha_nacimiento;
    private String contrasenia_estudiante;

    public Estudiante() {
    }
    
    /*
    public Estudiante(String id_estudiante, String nombre1_estudiante, String nombre2_estudiante, String apellido1_estudiante, String apellido2_estudiante, String correo_estudiante, Date fecha_nacimiento, String contrasenia_estudiante) {
        this.id_estudiante = id_estudiante;
        this.nombre1_estudiante = nombre1_estudiante;
        this.nombre2_estudiante = nombre2_estudiante;
        this.apellido1_estudiante = apellido1_estudiante;
        this.apellido2_estudiante = apellido2_estudiante;
        this.correo_estudiante = correo_estudiante;
        this.fecha_nacimiento = fecha_nacimiento;
        this.contrasenia_estudiante = contrasenia_estudiante;
    }*/

    public Estudiante(String nombre1_estudiante, String nombre2_estudiante, String apellido1_estudiante, String apellido2_estudiante, String correo_estudiante, Date fecha_nacimiento, String contrasenia_estudiante) {
        this.nombre1_estudiante = nombre1_estudiante;
        this.nombre2_estudiante = nombre2_estudiante;
        this.apellido1_estudiante = apellido1_estudiante;
        this.apellido2_estudiante = apellido2_estudiante;
        this.correo_estudiante = correo_estudiante;
        this.fecha_nacimiento = fecha_nacimiento;
        this.contrasenia_estudiante = contrasenia_estudiante;
    }

    
    public String getContrasenia_estudiante() {
        return contrasenia_estudiante;
    }

    public void setContrasenia_estudiante(String contrasenia_estudiante) {
        this.contrasenia_estudiante = contrasenia_estudiante;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

   

    public String getCorreo_estudiante() {
        return correo_estudiante;
    }

    public void setCorreo_estudiante(String correo_estudiante) {
        this.correo_estudiante = correo_estudiante;
    }

    public String getApellido1_estudiante() {
        return apellido1_estudiante;
    }

    public void setApellido1_estudiante(String apellido1_estudiante) {
        this.apellido1_estudiante = apellido1_estudiante;
    }

    public String getApellido2_estudiante() {
        return apellido2_estudiante;
    }

    public void setApellido2_estudiante(String apellido2_estudiante) {
        this.apellido2_estudiante = apellido2_estudiante;
    }

    public String getNombre2_estudiante() {
        return nombre2_estudiante;
    }
    
    public void setNombre2_estudiante(String nombre2_estudiante) {
        this.nombre2_estudiante = nombre2_estudiante;
    }

    public String getId_estudiante() {
        return id_estudiante;
    }

    public void setId_estudiante(String id_estudiante) {
        this.id_estudiante = id_estudiante;
    }

    public String getNombre1_estudiante() {
        return nombre1_estudiante;
    }

    public void setNombre1_estudiante(String nombre1_estudiante) {
        this.nombre1_estudiante = nombre1_estudiante;
    }

    public boolean insertEstudiate(String sql) {
        
        boolean t=false;
        BaseDatos objCon = new BaseDatos();

        if (objCon.crearConexion()) {
            try {
                Statement sentencia = objCon.getConexion().createStatement();
                sentencia.executeUpdate(sql);
                t=true;
            } catch (SQLException ex) {
                ex.printStackTrace();
                t= false;
            }
        }
        
        return t;
        
    }

}
