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
 * @author wedin
 */
public class Inscripcion {

    private int id_inscripcion;
    private String fecha_inscripcion;
    private int id_estudianteF;
    private int id_cursoF;

    public Inscripcion() {
    }

    public Inscripcion(int id_inscripcion, String fecha_inscripcion, int id_estudianteF, int id_cursoF) {
        this.id_inscripcion = id_inscripcion;
        this.fecha_inscripcion = fecha_inscripcion;
        this.id_estudianteF = id_estudianteF;
        this.id_cursoF = id_cursoF;
    }

    /* public Inscripcion(String fecha_inscripcion, int id_estudianteF, int id_cursoF) {
        this.fecha_inscripcion = fecha_inscripcion;
        this.id_estudianteF = id_estudianteF;
        this.id_cursoF = id_cursoF;
    }*/
    public Inscripcion(int id_estudianteF, int id_cursoF) {
        this.id_estudianteF = id_estudianteF;
        this.id_cursoF = id_cursoF;
    }

    public int getId_inscripcion() {
        return id_inscripcion;
    }

    public void setId_inscripcion(int id_inscripcion) {
        this.id_inscripcion = id_inscripcion;
    }

    public String getFecha_inscripcion() {
        return fecha_inscripcion;
    }

    public void setFecha_inscripcion(String fecha_inscripcion) {
        this.fecha_inscripcion = fecha_inscripcion;
    }

    public int getId_estudianteF() {
        return id_estudianteF;
    }

    public void setId_estudianteF(int id_estudianteF) {
        this.id_estudianteF = id_estudianteF;
    }

    public int getId_cursoF() {
        return id_cursoF;
    }

    public void setId_cursoF(int id_cursoF) {
        this.id_cursoF = id_cursoF;
    }

    @Override
    public String toString() {
        return "Inscripcion{" + "id_inscripcion=" + id_inscripcion + ", fecha_inscripcion=" + fecha_inscripcion + ", id_estudianteF=" + id_estudianteF + ", id_cursoF=" + id_cursoF + '}';
    }

    public boolean insertInscripcion(String sql) {

        boolean t = false;
        BaseDatos objCon = new BaseDatos();

        if (objCon.crearConexion()) {
            try {
                Statement sentencia = objCon.getConexion().createStatement();
                sentencia.executeUpdate(sql);
                t = true;
            } catch (SQLException ex) {
                ex.printStackTrace();
                t = false;
            }
        }
        return t;

    }
}
