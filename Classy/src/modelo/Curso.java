/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import control.BaseDatos;
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

    public Curso(String nombre_curso, String descripcion_curso, int id_profesorF, int id_categoriaF) {
        this.nombre_curso = nombre_curso;
        this.descripcion_curso = descripcion_curso;
        this.id_profesorF = id_profesorF;
        this.id_categoriaF = id_categoriaF;
    }

    public Curso() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public boolean insertCurso(String sql) {

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

    public LinkedList<Curso> consultAllCurso(String sql) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        LinkedList<Curso> listacurso = new LinkedList<>();
        BaseDatos objb = new BaseDatos();
          int id_curso1;
          String nombre_curso1;
          String  fecha_creacion_curso1;
          String  descripcion_curso1;
          int id_profesorF1;
          int id_categoriaF1;
          
          ResultSet rs= null; //resultado de la consulta que le enviamos
          if(objb.crearConexion())
          {
              try {
                  rs = objb.getSt().executeQuery(sql); //lo de consultallcurso lo guardamos en este resulset
                  while(rs.next())//usamos el while que recorra el resulset para saber cuantas filas hay
                  {
                   id_curso1 = rs.getInt("id_curso");
                   nombre_curso1 = rs.getString("nombre_curso");
                   fecha_creacion_curso1 = rs.getString("fecha_creacion_curso");
                   descripcion_curso1 = rs.getString("descripcion_curso");
                   id_profesorF1 = rs.getInt("id_profesorF");
                   id_categoriaF1 = rs.getInt("id_categoriaF");
                   listacurso.add(new Curso(id_curso1, nombre_curso1, fecha_creacion_curso1, descripcion_curso1, id_profesorF1, id_categoriaF1 ));//a;ade todo a una lista de curso
                  }
              } catch (SQLException ex) {
                  Logger.getLogger(Curso.class.getName()).log(Level.SEVERE, null, ex);
              }
          }
          return listacurso;
    }

    

    
}
