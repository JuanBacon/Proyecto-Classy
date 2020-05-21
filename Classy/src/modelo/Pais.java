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
public class Pais {
    private int id_pais;
    private String nombre_Categoria;

    public Pais() {
    }

    
    public Pais(int id_pais, String nombre_Categoria) {
        this.id_pais = id_pais;
        this.nombre_Categoria = nombre_Categoria;
    }

    public Pais(String nombre_Categoria) {
        this.nombre_Categoria = nombre_Categoria;
    }
    

    public int getId_pais() {
        return id_pais;
    }

    public void setId_pais(int id_pais) {
        this.id_pais = id_pais;
    }

    public String getNombre_Categoria() {
        return nombre_Categoria;
    }

    public void setNombre_Categoria(String nombre_Categoria) {
        this.nombre_Categoria = nombre_Categoria;
    }

    @Override
    public String toString() {
        return "Pais{" + "id_pais=" + id_pais + ", nombre_Categoria=" + nombre_Categoria + '}';
    }
    
    
}
