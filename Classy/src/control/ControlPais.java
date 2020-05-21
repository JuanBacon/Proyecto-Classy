package control;

import java.util.LinkedList;
import modelo.Categoria;
import modelo.Pais;

public class ControlPais {

    public boolean insertarPais(Pais objpa) {

        boolean t = false;
        String sql = "INSERT INTO paises (nombre_pais) VALUES ('" + objpa.getNombre_pais() + "');";
        t = objpa.insertPais(sql);
        return t;

    }

    public LinkedList<Pais> consultarPaises() {
        LinkedList<Pais> listac = new LinkedList<>();
        Pais objPais = new Pais();
        String sql = "select * from clasificaciones;";
        listac = objPais.consultPaises(sql);
        return listac;
    }

}
