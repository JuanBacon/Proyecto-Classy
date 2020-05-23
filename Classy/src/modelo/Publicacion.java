/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import control.BaseDatos;
import java.io.FileInputStream;
import java.sql.PreparedStatement;
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
    
        public boolean insertarPublicacion(Publicacion objp, String sql) {
        boolean t = false;
        BaseDatos objb = new BaseDatos();
        FileInputStream fis = null;
        PreparedStatement ps = null;
        try {
            if (objb.crearConexion()) {
//                objb.getConexion().setAutoCommit(false);
//                File file = new File(objp.get);
//                fis = new FileInputStream(file);
//                ps = objb.getConexion().prepareStatement(sql);
//                ps.setString(1, objp.getNombrePelicula());
//                ps.setString(2, objp.getDuracionp());
//                ps.setString(3, objp.getFechaEstrenop());
//                ps.setBinaryStream(4, fis, (int) file.length());
//                ps.setInt(5, objp.getIdPaisf());
//                ps.setInt(6, objp.getIdClasificacionf());
//
//                ps.executeUpdate();
//                objb.getConexion().commit();
//                t = true;
            }
        } catch (Exception ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            t = false;
        }

        return t;
    }
    


}
