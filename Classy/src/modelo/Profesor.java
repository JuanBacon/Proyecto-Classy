/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import control.BaseDatos;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Usuario
 */
public class Profesor {

    private int id_profesor;
    private String nombre1_profesor;
    private String nombre2_profesor;
    private String apellido1_profesor;
    private String apellido2_profesor;
    private String correo_profesor;
    private String direccion_profesor;
    private String contrasenia_profesor;
    private String fecha_creacion_p;
    private String id_paisF;

    public Profesor() {
    }

    public Profesor(int id_profesor, String nombre1_profesor, String nombre2_profesor, String apellido1_profesor, String apellido2_profesor, String correo_profesor, String direccion_profesor, String contrasenia_profesor, String fecha_creacion_p, String id_paisF) {
        this.id_profesor = id_profesor;
        this.nombre1_profesor = nombre1_profesor;
        this.nombre2_profesor = nombre2_profesor;
        this.apellido1_profesor = apellido1_profesor;
        this.apellido2_profesor = apellido2_profesor;
        this.correo_profesor = correo_profesor;
        this.direccion_profesor = direccion_profesor;
        this.contrasenia_profesor = contrasenia_profesor;
        this.fecha_creacion_p = fecha_creacion_p;
        this.id_paisF = id_paisF;
    }

    public Profesor(String nombre1_profesor, String nombre2_profesor, String apellido1_profesor, String apellido2_profesor, String correo_profesor, String direccion_profesor, String contrasenia_profesor, String fecha_creacion_p, String id_paisF) {
        this.nombre1_profesor = nombre1_profesor;
        this.nombre2_profesor = nombre2_profesor;
        this.apellido1_profesor = apellido1_profesor;
        this.apellido2_profesor = apellido2_profesor;
        this.correo_profesor = correo_profesor;
        this.direccion_profesor = direccion_profesor;
        this.contrasenia_profesor = contrasenia_profesor;
        this.fecha_creacion_p = fecha_creacion_p;
        this.id_paisF = id_paisF;
    }
    
    

    public String getId_paisF() {
        return id_paisF;
    }

    public void setId_paisF(String id_paisF) {
        this.id_paisF = id_paisF;
    }

    public String getFecha_creacion_p() {
        return fecha_creacion_p;
    }

    public void setFecha_creacion_p(String fecha_creacion_p) {
        this.fecha_creacion_p = fecha_creacion_p;
    }

    public String getContrasenia_profesor() {
        return contrasenia_profesor;
    }

    public void setContrasenia_profesor(String contrasenia_profesor) {
        this.contrasenia_profesor = contrasenia_profesor;
    }

    public String getDireccion_profesor() {
        return direccion_profesor;
    }

    public void setDireccion_profesor(String direccion_profesor) {
        this.direccion_profesor = direccion_profesor;
    }

    public String getCorreo_profesor() {
        return correo_profesor;
    }

    public void setCorreo_profesor(String correo_profesor) {
        this.correo_profesor = correo_profesor;
    }

    public String getApellido2_profesor() {
        return apellido2_profesor;
    }

    public void setApellido2_profesor(String apellido2_profesor) {
        this.apellido2_profesor = apellido2_profesor;
    }

    public String getApellido1_profesor() {
        return apellido1_profesor;
    }

    public void setApellido1_profesor(String apellido1_profesor) {
        this.apellido1_profesor = apellido1_profesor;
    }

    public String getNombre2_profesor() {
        return nombre2_profesor;
    }

    public void setNombre2_profesor(String nombre2_profesor) {
        this.nombre2_profesor = nombre2_profesor;
    }

    public String getNombre1_profesor() {
        return nombre1_profesor;
    }

    public void setNombre1_profesor(String nombre1_profesor) {
        this.nombre1_profesor = nombre1_profesor;
    }

    public int getId_profesor() {
        return id_profesor;
    }

    public void setId_profesor(int id_profesor) {
        this.id_profesor = id_profesor;
    }

    @Override
    public String toString() {
        return "Profesor{" + "id_profesor=" + id_profesor + ", nombre1_profesor=" + nombre1_profesor + ", nombre2_profesor=" + nombre2_profesor + ", apellido1_profesor=" + apellido1_profesor + ", apellido2_profesor=" + apellido2_profesor + ", correo_profesor=" + correo_profesor + ", direccion_profesor=" + direccion_profesor + ", contrasenia_profesor=" + contrasenia_profesor + ", fecha_creacion_p=" + fecha_creacion_p + ", id_paisF=" + id_paisF + '}';
    }

    public boolean insertProfesor(String sql) {
        
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
