package control;

import modelo.Inscripcion;

public class ControlInscripcion {

    public boolean insertarInscripcion(Inscripcion objin) {

        boolean t = false;
        String sql = "INSERT INTO inscripciones(fecha_inscripcion, id_estudianteF, id_cursoF) VALUES ('2020-04-10 00:00:00','" + objin.getId_estudianteF() + "', '" + objin.getId_cursoF() + "');";
        t = objin.insertInscripcion(sql);
        return t;

    }

}
