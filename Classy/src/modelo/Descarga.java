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
public class Descarga {
    private int id_descarga;
    private String fecha_descarga;
    private int id_materialF;
    private int id_estudianteF;

    public Descarga() {
    }

    public Descarga(int id_descarga, String fecha_descarga, int id_materialF, int id_estudianteF) {
        this.id_descarga = id_descarga;
        this.fecha_descarga = fecha_descarga;
        this.id_materialF = id_materialF;
        this.id_estudianteF = id_estudianteF;
    }

    public Descarga(String fecha_descarga, int id_materialF, int id_estudianteF) {
        this.fecha_descarga = fecha_descarga;
        this.id_materialF = id_materialF;
        this.id_estudianteF = id_estudianteF;
    }

    public int getId_descarga() {
        return id_descarga;
    }

    public void setId_descarga(int id_descarga) {
        this.id_descarga = id_descarga;
    }

    public String getFecha_descarga() {
        return fecha_descarga;
    }

    public void setFecha_descarga(String fecha_descarga) {
        this.fecha_descarga = fecha_descarga;
    }

    public int getId_materialF() {
        return id_materialF;
    }

    public void setId_materialF(int id_materialF) {
        this.id_materialF = id_materialF;
    }

    public int getId_estudianteF() {
        return id_estudianteF;
    }

    public void setId_estudianteF(int id_estudianteF) {
        this.id_estudianteF = id_estudianteF;
    }

    @Override
    public String toString() {
        return "Descarga{" + "id_descarga=" + id_descarga + ", fecha_descarga=" + fecha_descarga + ", id_materialF=" + id_materialF + ", id_estudianteF=" + id_estudianteF + '}';
    }
    
    
}
