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
public class Curso {
    private int id_curso;
    private String nombre_curso;
    private String  fecha_creacion_curso;
    private String  descripcion_curso;
    private int id_profesorF;
    private int id_categoriaF;

    public Curso(int id_curso, String nombre_curso, String fecha_creacion_curso, String descripcion_curso, int id_profesorF, int id_categoriaF) {
        this.id_curso = id_curso;
        this.nombre_curso = nombre_curso;
        this.fecha_creacion_curso = fecha_creacion_curso;
        this.descripcion_curso = descripcion_curso;
        this.id_profesorF = id_profesorF;
        this.id_categoriaF = id_categoriaF;
    }

    public Curso(String nombre_curso, String fecha_creacion_curso, String descripcion_curso, int id_profesorF, int id_categoriaF) {
        this.nombre_curso = nombre_curso;
        this.fecha_creacion_curso = fecha_creacion_curso;
        this.descripcion_curso = descripcion_curso;
        this.id_profesorF = id_profesorF;
        this.id_categoriaF = id_categoriaF;
    }

    public int getId_curso() {
        return id_curso;
    }

    public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
    }

    public String getNombre_curso() {
        return nombre_curso;
    }

    public void setNombre_curso(String nombre_curso) {
        this.nombre_curso = nombre_curso;
    }

    public String getFecha_creacion_curso() {
        return fecha_creacion_curso;
    }

    public void setFecha_creacion_curso(String fecha_creacion_curso) {
        this.fecha_creacion_curso = fecha_creacion_curso;
    }

    public String getDescripcion_curso() {
        return descripcion_curso;
    }

    public void setDescripcion_curso(String descripcion_curso) {
        this.descripcion_curso = descripcion_curso;
    }

    public int getId_profesorF() {
        return id_profesorF;
    }

    public void setId_profesorF(int id_profesorF) {
        this.id_profesorF = id_profesorF;
    }

    public int getId_categoriaF() {
        return id_categoriaF;
    }

    public void setId_categoriaF(int id_categoriaF) {
        this.id_categoriaF = id_categoriaF;
    }

    @Override
    public String toString() {
        return "Curso{" + "id_curso=" + id_curso + ", nombre_curso=" + nombre_curso + ", fecha_creacion_curso=" + fecha_creacion_curso + ", descripcion_curso=" + descripcion_curso + ", id_profesorF=" + id_profesorF + ", id_categoriaF=" + id_categoriaF + '}';
    }

    

    
}
