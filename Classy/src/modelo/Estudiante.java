/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

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
    private String fecha_estudiante;
    private String contrasenia_estudiante;

    public String getContrasenia_estudiante() {
        return contrasenia_estudiante;
    }

    public void setContrasenia_estudiante(String contrasenia_estudiante) {
        this.contrasenia_estudiante = contrasenia_estudiante;
    }

    public String getFecha_estudiante() {
        return fecha_estudiante;
    }

    public void setFecha_estudiante(String fecha_estudiante) {
        this.fecha_estudiante = fecha_estudiante;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
