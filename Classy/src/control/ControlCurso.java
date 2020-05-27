package control;

import java.util.LinkedList;
import modelo.Curso;

public class ControlCurso {

    public boolean insertarCurso(Curso objcu) {
        boolean t = false;
        String sql = "INSERT INTO cursos(nombre_curso,fecha_creacion_curso, descripcion_curso, id_profesorF, id_categoriaF) "
                + "VALUES ('" + objcu.getNombre_curso() + "','" + objcu.getFecha_creacion_curso()+ "','" + objcu.getDescripcion_curso() + "', "
                + "'" + objcu.getId_profesorF() + "','" + objcu.getId_categoriaF() + "');";
        t = objcu.insertCurso(sql);

        return t;
    }
//esto permite la conexion con las publicaciones

    public LinkedList<Curso> consultarTodoCurso(int id) {
        LinkedList<Curso> listacurso = new LinkedList<>();
        Curso objcurso = new Curso();
        
        String sql = "call classy.cursosNoInscritosEstudiante('"+ id+"');";
        /*String sql = "SELECT a.id_curso, a.nombre_curso, a.fecha_creacion_curso, a.descripcion_curso, a.id_profesorF, a.id_categoriaF, b.nombre1_profesor, b.apellido1_profesor, c.nombre_categoria \n"
                + "FROM cursos a INNER JOIN profesores b iNNER JOIN categorias c WHERE a.id_profesorF = b.id_profesor AND a.id_categoriaF = c.id_categoria;";*/
        listacurso = objcurso.consultAllCurso(sql);
        return listacurso;
    }
    
    
    public LinkedList<Curso> consultarCursosProfesor(int id) {
        LinkedList<Curso> listacurso = new LinkedList<>();
        Curso objcurso = new Curso();
        //String sql = "SELECT * FROM cursos;";  
        String sql = "SELECT a.id_curso, a.nombre_curso, a.fecha_creacion_curso, a.descripcion_curso, a.id_profesorF, a.id_categoriaF, b.nombre1_profesor, b.apellido1_profesor, c.nombre_categoria \n"
                + "FROM cursos a INNER JOIN profesores b iNNER JOIN categorias c WHERE a.id_profesorF = b.id_profesor AND a.id_categoriaF = c.id_categoria AND b.id_profesor = '"+ id +"';";
        listacurso = objcurso.consultCursosProfesor(sql);
        return listacurso;
    }
    
        // este es el que le llega al jcombobox qu esta dentro de las publicaciones
    public LinkedList<Curso> consultarCurso() {
        LinkedList<Curso> listaCursos= new LinkedList<>();
        Curso objcurCursos = new Curso();
        String sql3= "select* from cursos;";
        listaCursos = objcurCursos.consultarCurso(sql3);
        return  listaCursos;
    }
    
    
        public LinkedList<Curso> consultarCursoEstudiante(int id_usuario) {
        LinkedList<Curso> listaCursos= new LinkedList<>();
        Curso objcurCursos = new Curso();
        String sql4= "SELECT c.id_curso, c.nombre_curso FROM inscripciones a "
                + "inner join estudiantes b on a.id_estudianteF = b.id_estudiante "
                + "inner join cursos c on a.id_cursoF = c.id_curso "
                + "where a.id_estudianteF = "+ id_usuario +";";
        listaCursos = objcurCursos.consultCursoEstudiante(sql4);
        return  listaCursos;
    }
}
