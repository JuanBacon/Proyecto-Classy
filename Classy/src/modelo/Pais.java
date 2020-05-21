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
public class Pais {

    private int id_pais;
    private String nombre_pais;

    public Pais() {
    }

    public Pais(int id_pais, String nombre_pais) {
        this.id_pais = id_pais;
        this.nombre_pais = nombre_pais;
    }

    public Pais(String nombre_pais) {
        this.nombre_pais = nombre_pais;
    }

    public int getId_pais() {
        return id_pais;
    }

    public void setId_pais(int id_pais) {
        this.id_pais = id_pais;
    }

    public String getNombre_pais() {
        return nombre_pais;
    }

    public void setNombre_pais(String nombre_pais) {
        this.nombre_pais = nombre_pais;
    }

    @Override
    public String toString() {
        return "Pais{" + "id_pais=" + id_pais + ", nombre_pais=" + nombre_pais + '}';
    }

    public boolean insertPais(String sql) {

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

    public LinkedList<Pais> consultPaises(String sql) {
        LinkedList<Pais> lc = new LinkedList<>();
        BaseDatos objb = new BaseDatos();

        int idPais1 = 0;
        String Pais1 = "";

        ResultSet rs = null;
        if (objb.crearConexion()) {
            try {
                rs = objb.getSt().executeQuery(sql);
                while (rs.next()) {

                    idPais1 = rs.getInt("id_pais");
                    Pais1 = rs.getString("nombre_pais");

                    lc.add(new Pais(idPais1, Pais1));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Pais.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lc;
    }

}
