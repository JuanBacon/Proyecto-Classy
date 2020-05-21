package control;

import modelo.Inscripcion;

public class ControlInscripcion {

    public boolean insertarInscripcion(Inscripcion objin) {

        boolean t = false;
        String sql = "INSERT INTO inscripciones(id_estudianteF, id_cursoF) VALUES ('" + objin.getId_estudianteF() + "', '" + objin.getId_cursoF() + "');";
        t = objin.insertInscripcion(sql);
        return t;

    }

}
