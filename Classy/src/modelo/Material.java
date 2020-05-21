/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author wedin
 */
public class Material {
    private int id_publicacion;
    private String fecha_publicacion;
    private String titulo_publicacion;
    private String descripcion_publicacion;
    private int id_cursoF;

    public Material() {
    }

    public Material(int id_publicacion, String fecha_publicacion, String titulo_publicacion, String descripcion_publicacion, int id_cursoF) {
        this.id_publicacion = id_publicacion;
        this.fecha_publicacion = fecha_publicacion;
        this.titulo_publicacion = titulo_publicacion;
        this.descripcion_publicacion = descripcion_publicacion;
        this.id_cursoF = id_cursoF;
    }

    public Material(String fecha_publicacion, String titulo_publicacion, String descripcion_publicacion, int id_cursoF) {
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
        return "Material{" + "id_publicacion=" + id_publicacion + ", fecha_publicacion=" + fecha_publicacion + ", titulo_publicacion=" + titulo_publicacion + ", descripcion_publicacion=" + descripcion_publicacion + ", id_cursoF=" + id_cursoF + '}';
    }
    
    
}
