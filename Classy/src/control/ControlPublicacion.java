package control;

import java.util.LinkedList;
import modelo.Categoria;
import modelo.Publicacion;

public class ControlPublicacion {

    //aqui necesitamos insertar la publicacion pero la publicacion viene con el material de estudio
    public boolean insertarPublicacion(Publicacion objp) {
        boolean t = false;
        Publicacion objp2 = new Publicacion();
        String sql = "";
        sql = "insert into publicaciones (fecha_publicacion, titulo_publicacion, descripcion_publicacion, id_cursoF )VALUES (?,?,?,?);";
        t = objp2.insertarPublicacion(objp, sql);
        return t;
    }
    
    public boolean insertPublicacion(Publicacion objp) {
        boolean t = false;
        Publicacion objp2 = new Publicacion();
        String sql = "";
        sql = "insert into publicaciones (fecha_publicacion, titulo_publicacion, descripcion_publicacion, id_cursoF )VALUES ('"+objp.getFecha_publicacion()+"',"
                + "'"+objp.getTitulo_publicacion()+"','"+objp.getDescripcion_publicacion()+"','"+objp.getId_cursoF()+"');";
        t = objp2.insertPublicacion(sql);
        return t;
    }

    public LinkedList<Publicacion> consultarPublicaciones() {
        LinkedList<Publicacion> listap = new LinkedList<>();
        Publicacion objPublicacion = new Publicacion();
        String sql = "select * from Publicaciones;";
        listap = objPublicacion.consultPublicaciones(sql);
        return listap;
    }

    public LinkedList<Publicacion> consultarPublicacionesCurso(int id_curso) {
        LinkedList<Publicacion> listap = new LinkedList<>();
        Publicacion objPublicacion = new Publicacion();
        String sql = "SELECT * FROM publicaciones where id_cursoF = " + id_curso +";";
        listap = objPublicacion.consultPublicacionesCE(sql);
        return listap;
    }
    
    

}
