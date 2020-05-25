package control;

import java.util.LinkedList;
import modelo.Categoria;

public class ControlCategoria {

    public boolean insertarCategoria(Categoria objca) {
        boolean t = false;
        String sql = "INSERT INTO categorias (nombre_categoria) VALUES ('" + objca.getNombre_categoria() + "');";
        t = objca.insertCategoria(sql);
        return t;
    }

    public LinkedList<Categoria> consultarClasificaciones() {
        LinkedList<Categoria> listac = new LinkedList<>();
        Categoria objcategoria = new Categoria();
        String sql = "select * from categorias;";
        listac = objcategoria.consultCategoria(sql);
        return listac;
    }

}
