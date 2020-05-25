package control;

import java.util.LinkedList;
import modelo.Curso;

public class ControlCurso {

    public boolean insertarCurso(Curso objcu) {
        boolean t = false;
        String sql = "INSERT INTO cursos(nombre_curso, descripcion_curso, id_profesorF, id_categoriaF) "
                + "VALUES ('" + objcu.getNombre_curso() + "','" + objcu.getDescripcion_curso() + "', "
                + "'" + objcu.getId_profesorF() + "','" + objcu.getId_categoriaF() + "');";
        t = objcu.insertCurso(sql);

        return t;
    }
//esto permite la conexion con las publicaciones

    public LinkedList<Curso> consultarTodoCurso() {
        LinkedList<Curso> listacurso = new LinkedList<>();
        Curso objcurso = new Curso();
        //String sql = "SELECT * FROM cursos;";  
        String sql = "SELECT a.id_curso, a.nombre_curso, a.fecha_creacion_curso, a.descripcion_curso, a.id_profesorF, a.id_categoriaF, b.nombre1_profesor, b.apellido1_profesor, c.nombre_categoria \n"
                + "FROM cursos a INNER JOIN profesores b iNNER JOIN categorias c WHERE a.id_profesorF = b.id_profesor AND a.id_categoriaF = c.id_categoria;";
        listacurso = objcurso.consultAllCurso(sql);
        return listacurso;
    }

}
