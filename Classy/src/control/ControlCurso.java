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

    public LinkedList<Curso> consultarTodoCurso() {
        LinkedList<Curso> listacurso = new LinkedList<>();
        Curso objcurso = new Curso();
        String sql = "SELECT * FROM categorias;";
        listacurso = objcurso.consultAllCurso(sql);
        return listacurso;
    }

}
