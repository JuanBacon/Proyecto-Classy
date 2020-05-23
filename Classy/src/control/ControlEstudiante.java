
package control;

import modelo.Estudiante;


public class ControlEstudiante {
    
        public boolean insertarEstudiante(Estudiante obje) {
        boolean t=false;
        Estudiante objEstudiate = new Estudiante();
        String sql = "INSERT INTO estudiantes( nombre1_estudiante, "
                + "nombre2_estudiante, apellido1_estudiante, apellido2_estudiante, "
                + "correo_estudiante, fecha_nacimiento, contrasenia_estudiante) "
                + "VALUES ('"+ obje.getNombre1_estudiante()+"', "
                + "'"+ obje.getNombre2_estudiante() +"', '"+ obje.getApellido1_estudiante() +"', "
                + "'"+ obje.getApellido2_estudiante() +"', '"+ obje.getCorreo_estudiante() +"', "
                + "'"+ obje.getFecha_nacimiento() +"', '"+ obje.getContrasenia_estudiante() +"');";
        
        t = objEstudiate.insertEstudiate(sql);
        
        return t;       
        
    }
   
}
