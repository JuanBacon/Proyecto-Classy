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
        String sql = "select * from Cursos";
        listacurso = objcurso.consultAllCurso(sql);
        return listacurso;
        
        /*
        String sql = "select c.id_curso as 'Id', c.nombre_curso as 'Cursos', c.descripcion_curso as 'Descripcion', "
                + "a.nombre1_profesor as 'Nombre docente', a.apellido1_profesor as 'Apellido', "
                + "b.nombre_categoria as 'Categoria' from CURSOS as c "
                + "inner join PROFESORES as a on a.id_profesor = c.id_profesorF "
                + "inner join Categorias as b on b.id_categoria = c.id_categoriaF;";
        */
    }

}
