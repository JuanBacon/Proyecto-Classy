/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import control.BaseDatos;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wedin
 */
public class Curso {

    private int id_curso;
    private String nombre_curso;
    private Timestamp fecha_creacion_curso;
    private String descripcion_curso;
    private int id_profesorF;
    private int id_categoriaF;
    private String nombre_profesor;
    private String Categoria;

    public Curso(int id_curso, String nombre_curso, Timestamp fecha_creacion_curso, String descripcion_curso, int id_profesorF, int id_categoriaF) {
        this.id_curso = id_curso;
        this.nombre_curso = nombre_curso;
        this.fecha_creacion_curso = fecha_creacion_curso;
        this.descripcion_curso = descripcion_curso;
        this.id_profesorF = id_profesorF;
        this.id_categoriaF = id_categoriaF;
    }

    public Curso(String nombre_curso, Timestamp fecha_creacion_curso, String descripcion_curso, int id_profesorF, int id_categoriaF) {
        this.nombre_curso = nombre_curso;
        this.fecha_creacion_curso = fecha_creacion_curso;
        this.descripcion_curso = descripcion_curso;
        this.id_profesorF = id_profesorF;
        this.id_categoriaF = id_categoriaF;
    }

    public Curso(String nombre_curso, String descripcion_curso, int id_profesorF, int id_categoriaF) {
        this.nombre_curso = nombre_curso;
        this.descripcion_curso = descripcion_curso;
        this.id_profesorF = id_profesorF;
        this.id_categoriaF = id_categoriaF;
    }

    public Curso(int id_curso, String nombre_curso) {
        this.id_curso = id_curso;
        this.nombre_curso = nombre_curso;
    }
    
    public Curso(int id_curso, String nombre_curso, String descripcion_curso) {
        this.id_curso = id_curso;
        this.nombre_curso = nombre_curso;
        this.descripcion_curso = descripcion_curso;
    } 
    
    public Curso() {

    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getNombre_profesor() {
        return nombre_profesor;
    }

    public void setNombre_profesor(String nombre_profesor) {
        this.nombre_profesor = nombre_profesor;
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

    public Timestamp getFecha_creacion_curso() {
        return fecha_creacion_curso;
    }

    public void setFecha_creacion_curso(Timestamp fecha_creacion_curso) {
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

    public boolean insertCurso(String sql) {

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

    public LinkedList<Curso> consultAllCurso(String sql) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        LinkedList<Curso> listacurso = new LinkedList<>();

        BaseDatos objb = new BaseDatos();
        int id_curso1;
        String nombre_curso1;
        Timestamp fecha_creacion_curso1;
        String descripcion_curso1;
        int id_profesorF1;
        int id_categoriaF1;
        String NombreP;
        String Categoria;

        ResultSet rs = null; //resultado de la consulta que le enviamos
        if (objb.crearConexion()) {
            try {
                rs = objb.getSt().executeQuery(sql); //lo de consultallcurso lo guardamos en este resulset
                while (rs.next())//usamos el while que recorra el resulset para saber cuantas filas hay
                {
                    id_curso1 = rs.getInt("id_curso");
                    nombre_curso1 = rs.getString("nombre_curso");
                    fecha_creacion_curso1 = rs.getTimestamp("fecha_creacion_curso");
                    descripcion_curso1 = rs.getString("descripcion_curso");
                    id_profesorF1 = rs.getInt("id_profesorF");
                    id_categoriaF1 = rs.getInt("id_categoriaF");
                    Curso cu = new Curso(id_curso1, nombre_curso1, fecha_creacion_curso1, descripcion_curso1, id_profesorF1, id_categoriaF1);
                    cu.setNombre_profesor(rs.getString("nombre1_profesor") + " " + rs.getString(("apellido1_profesor")));
                    cu.setCategoria(rs.getString("nombre_categoria"));
                    listacurso.add(cu);//a;ade todo a una lista de curso
                }
            } catch (SQLException ex) {
                Logger.getLogger(Curso.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return listacurso;
    }
    
    

    public LinkedList<Curso> consultCurso(String sql2) {

        LinkedList<Curso> listacurso = new LinkedList<>();
        LinkedList<Object> obj = new LinkedList<>();
        BaseDatos objb = new BaseDatos();
        int id_curso1;
        String nombre_curso1;
        String fecha_creacion_curso1;
        String descripcion_curso1;
        int id_profesorF1;
        int id_categoriaF1;
        String NombreP;
        String Categoria;

        ResultSet rs = null; //resultado de la consulta que le enviamos
        if (objb.crearConexion()) {
            try {
                rs = objb.getSt().executeQuery(sql2); //lo de consultallcurso lo guardamos en este resulset
                while (rs.next())//usamos el while que recorra el resulset para saber cuantas filas hay
                {
                    id_curso1 = rs.getInt("id_curso");
                    nombre_curso1 = rs.getString("nombre_curso");
                    fecha_creacion_curso1 = rs.getString("fecha_creacion_curso");
                    descripcion_curso1 = rs.getString("descripcion_curso");
                    NombreP = rs.getString("nombre1_profesor" + " apellido1_profesor");
                    Categoria = rs.getString("nombre_categoria");
                    //listacurso.add(new Curso(id_curso1, nombre_curso1, fecha_creacion_curso1, descripcion_curso1, id_profesorF1, id_categoriaF1 ));//a;ade todo a una lista de curso
                    //obj.add(new Object(id_curso1,nombre_curso1,fecha_creacion_curso1,descripcion_curso1,NombreP,Categoria));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Curso.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return listacurso;

    }
    
    
    
    public LinkedList<Curso> consultCursosProfesor(String sql) {
        LinkedList<Curso> listacurso = new LinkedList<>();

        BaseDatos objb = new BaseDatos();
        int id_curso1;
        String nombre_curso1;
        Timestamp fecha_creacion_curso1;
        String descripcion_curso1;
        int id_profesorF1;
        int id_categoriaF1;
        String Categoria;

        ResultSet rs = null; //resultado de la consulta que le enviamos
        if (objb.crearConexion()) {
            try {
                rs = objb.getSt().executeQuery(sql); //lo de consultallcurso lo guardamos en este resulset
                while (rs.next())//usamos el while que recorra el resulset para saber cuantas filas hay
                {
                    id_curso1 = rs.getInt("id_curso");
                    nombre_curso1 = rs.getString("nombre_curso");
                    fecha_creacion_curso1 = rs.getTimestamp("fecha_creacion_curso");
                    descripcion_curso1 = rs.getString("descripcion_curso");
                    id_profesorF1 = rs.getInt("id_profesorF");
                    id_categoriaF1 = rs.getInt("id_categoriaF");
                    Curso cu = new Curso(id_curso1, nombre_curso1, fecha_creacion_curso1, descripcion_curso1, id_profesorF1, id_categoriaF1);
                    //cu.setNombre_profesor(rs.getString("nombre1_profesor") + " " + rs.getString(("apellido1_profesor")));
                    cu.setCategoria(rs.getString("nombre_categoria"));
                    listacurso.add(cu);//a;ade todo a una lista de curso
                }
            } catch (SQLException ex) {
                Logger.getLogger(Curso.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return listacurso;
    }
    //este metodo es el que muestra los cursos en el combobox que esta en en la vista de las publicaciones
    public LinkedList<Curso> consultarCurso(String sql3) {
        LinkedList<Curso> listacurso = new LinkedList<>();
        BaseDatos objb = new BaseDatos();
        int id_curso1;
        String nombre_curso1;
        Timestamp fecha_creacion_curso1;
        String descripcion_curso1;
        int id_profesorF1;
        int id_categoriaF1;
       
        ResultSet rs = null; //resultado de la consulta que le enviamos
        if (objb.crearConexion()) {
            try {
                rs = objb.getSt().executeQuery(sql3); //lo de consultallcurso lo guardamos en este resulset
                while (rs.next())//usamos el while que recorra el resulset para saber cuantas filas hay
                {
                    id_curso1 = rs.getInt("id_curso");
                    nombre_curso1 = rs.getString("nombre_curso");
                    fecha_creacion_curso1 = rs.getTimestamp("fecha_creacion_curso");
                    descripcion_curso1 = rs.getString("descripcion_curso");
                    id_profesorF1 = rs.getInt("id_profesorF");
                   id_categoriaF1 = rs.getInt("id_categoriaF");
                   listacurso.add(new Curso(id_curso1,nombre_curso1,fecha_creacion_curso1,descripcion_curso1,id_profesorF1,id_categoriaF1));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Curso.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return listacurso;
    }

    public LinkedList<Curso> consultCursoEstudiante(String sql4) {
        LinkedList<Curso> listacurso = new LinkedList<>();
        BaseDatos objb = new BaseDatos();
        int id_curso1;
        String nombre_curso1;
        String nombre_profesor;
        String descripcion_curso;
        String categoria_curso;
       
        ResultSet rs = null; //resultado de la consulta que le enviamos
        if (objb.crearConexion()) {
            try {
                rs = objb.getSt().executeQuery(sql4); //lo de consultallcurso lo guardamos en este resulset
                while (rs.next())//usamos el while que recorra el resulset para saber cuantas filas hay
                {
                    id_curso1 = rs.getInt("id_curso");
                    nombre_curso1 = rs.getString("nombre_curso");  
                    descripcion_curso = rs.getString("descripcion_curso");
                    categoria_curso = rs.getString("nombre_categoria");
                    nombre_profesor = rs.getString("nombre1_profesor") +" "+  rs.getString("apellido1_profesor");
                    Curso obcur = new Curso(id_curso1,nombre_curso1,descripcion_curso);
                    obcur.setNombre_profesor(nombre_profesor);
                    obcur.setCategoria(categoria_curso);
                    listacurso.add(obcur);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Curso.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return listacurso;
    }
}