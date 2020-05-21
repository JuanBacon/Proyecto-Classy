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
public class Categoria {
    
    private int id_categoria;
    private String nombre_categoria;

    public Categoria() {
    }    
    
    public Categoria(int id_categoria, String nombre_categoria) {
        this.id_categoria = id_categoria;
        this.nombre_categoria = nombre_categoria;
    }

    public Categoria(String nombre_categoria) {
        this.nombre_categoria = nombre_categoria;
    }
    

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNombre_categoria() {
        return nombre_categoria;
    }

    public void setNombre_categoria(String nombre_categoria) {
        this.nombre_categoria = nombre_categoria;
    }

    @Override
    public String toString() {
        return "Categoria{" + "id_categoria=" + id_categoria + ", nombre_categoria=" + nombre_categoria + '}';
    }

    public boolean insertCategoria(String sql) {
        
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

    public LinkedList<Categoria> consultCategoria(String sql) {
        
        LinkedList<Categoria> lc = new LinkedList<>();
        BaseDatos objb = new BaseDatos();
        
        int idCategoria1 = 0;
        String categoria1 = "";

        ResultSet rs = null;
        if (objb.crearConexion()) {
            try {
                rs = objb.getSt().executeQuery(sql);
                while (rs.next()) {
                    
                    idCategoria1 = rs.getInt("id_categoria");
                    categoria1 = rs.getString("nombre_categoria");

                    lc.add(new Categoria(idCategoria1, categoria1));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Categoria.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lc;

    }
    
}
