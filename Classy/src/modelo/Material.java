package modelo;

import control.BaseDatos;
import java.io.File;
import java.io.FileInputStream;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Material {

    private int id_material;
    private String nombre_material;
    private String archivo_material;
    private int id_publicacionF;

    public Material() {
    }

    public Material(int id_material, String nombre_material, String archivo_material, int id_publicacionF) {
        this.id_material = id_material;
        this.nombre_material = nombre_material;
        this.archivo_material = archivo_material;
        this.id_publicacionF = id_publicacionF;
    }

    public Material(String nombre_material, String archivo_material, int id_publicacionF) {
        this.nombre_material = nombre_material;
        this.archivo_material = archivo_material;
        this.id_publicacionF = id_publicacionF;
    }

    public int getId_publicacionF() {
        return id_publicacionF;
    }

    public void setId_publicacionF(int id_publicacionF) {
        this.id_publicacionF = id_publicacionF;
    }

    

    public String getArchivo_material() {
        return archivo_material;
    }

    public void setArchivo_material(String archivo_material) {
        this.archivo_material = archivo_material;
    }

    public String getNombre_material() {
        return nombre_material;
    }

    public void setNombre_material(String nombre_material) {
        this.nombre_material = nombre_material;
    }

    public int getId_material() {
        return id_material;
    }

    void setId_material(int id_material) {
        this.id_material = id_material;
    }
    
        public boolean insertMaterial(Material objcm, String sql) {
               boolean t = false;
        BaseDatos objb = new BaseDatos();
        FileInputStream fis = null; //toma la ruta de la foto
        PreparedStatement ps = null;
        try {
            if (objb.crearConexion()) {
                objb.getConexion().setAutoCommit(false);
                File file = new File(objcm.getArchivo_material());
                fis = new FileInputStream(file);
                ps = objb.getConexion().prepareStatement(sql);
                ps.setString(1, objcm.getNombre_material());
                ps.setBinaryStream(2, fis, (int) file.length());
                ps.setInt(3, objcm.getId_publicacionF());

                ps.executeUpdate();
                objb.getConexion().commit();
                t = true;
            }
        } catch (Exception ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            t = false;
        }

        return t;
    }



}
