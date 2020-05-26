/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import control.BaseDatos;
import java.io.FileInputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wedin
 */
public class Publicacion {

    private int id_publicacion;
    private String fecha_publicacion;
    private String titulo_publicacion;
    private String descripcion_publicacion;
    private int id_cursoF;

    public Publicacion() {
    }

    public Publicacion(int id_publicacion, String fecha_publicacion, String titulo_publicacion, String descripcion_publicacion, int id_cursoF) {
        this.id_publicacion = id_publicacion;
        this.fecha_publicacion = fecha_publicacion;
        this.titulo_publicacion = titulo_publicacion;
        this.descripcion_publicacion = descripcion_publicacion;
        this.id_cursoF = id_cursoF;
    }

    public Publicacion(String fecha_publicacion, String titulo_publicacion, String descripcion_publicacion, int id_cursoF) {
        this.fecha_publicacion = fecha_publicacion;
        this.titulo_publicacion = titulo_publicacion;
        this.descripcion_publicacion = descripcion_publicacion;
        this.id_cursoF = id_cursoF;
    }

    public int getId_publicacion() {
        return id_publicacion;
    }

    public void setId_publicacion(int id_publicacion) {
        this.id_publicacion = id_publicacion;
    }

    public String getFecha_publicacion() {
        return fecha_publicacion;
    }

    public void setFecha_publicacion(String fecha_publicacion) {
        this.fecha_publicacion = fecha_publicacion;
    }

    public String getTitulo_publicacion() {
        return titulo_publicacion;
    }

    public void setTitulo_publicacion(String titulo_publicacion) {
        this.titulo_publicacion = titulo_publicacion;
    }

    public String getDescripcion_publicacion() {
        return descripcion_publicacion;
    }

    public void setDescripcion_publicacion(String descripcion_publicacion) {
        this.descripcion_publicacion = descripcion_publicacion;
    }

    public int getId_cursoF() {
        return id_cursoF;
    }

    public void setId_cursoF(int id_cursoF) {
        this.id_cursoF = id_cursoF;
    }

    @Override
    public String toString() {
        return "Publicacion{" + "id_publicacion=" + id_publicacion + ", fecha_publicacion=" + fecha_publicacion + ", titulo_publicacion=" + titulo_publicacion + ", descripcion_publicacion=" + descripcion_publicacion + ", id_cursoF=" + id_cursoF + '}';
    }

    public boolean insertPublicacion(String sql) {
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

    public LinkedList<Publicacion> consultPublicaciones(String sql) {
        
        LinkedList<Publicacion> lp = new LinkedList<>();
        BaseDatos objb = new BaseDatos();
        
        int idPublicacion1 = 0;
        String fecha1 = "";
        String titulo1 = "";
        String descripcion1 = "";
        int idCurso1 = 0;

        ResultSet rs = null; //lo que nos devuelve de la consulta que le enviamos
        if (objb.crearConexion()) {
            try {
                rs = objb.getSt().executeQuery(sql);
                while (rs.next()) {
                    
                    idPublicacion1 = rs.getInt("id_publicacion");
                    fecha1 = rs.getString("fecha_publicacion");
                    titulo1 = rs.getString("titulo_publicacion");
                    descripcion1 = rs.getString("descripcion_publicacion");
                    idCurso1 = rs.getInt("id_cursoF");

                    lp.add(new Publicacion(idPublicacion1, fecha1, titulo1, descripcion1, idCurso1));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Categoria.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lp;
    }

}
