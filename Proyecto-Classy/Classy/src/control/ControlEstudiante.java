/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modelo.Estudiante;

/**
 *
 * @author Usuario
 */
public class ControlEstudiante {
    
        public boolean insertarEstudiante(Estudiante obje) {
        boolean t=false;
        Estudiante objEstudiate = new Estudiante();
        String sql = "INSERT INTO estudiantes(id_estudiante, nombre1_estudiante, "
                + "nombre2_estudiante, apellido1_estudiante, apellido2_estudiante, "
                + "correo_estudiante, fecha_nacimiento, contrasenia_estudiante) "
                + "VALUES ('"+ objEstudiate.getId_estudiante() +"', '"+ objEstudiate.getNombre1_estudiante()+"', "
                + "'"+ objEstudiate.getNombre2_estudiante() +"', '"+ objEstudiate.getApellido1_estudiante() +"', "
                + "'"+ objEstudiate.getApellido2_estudiante() +"', '"+ objEstudiate.getCorreo_estudiante() +"', "
                + "'"+ objEstudiate.getFecha_nacimiento() +"', '"+ objEstudiate.getContrasenia_estudiante() +"');";
        
        t = objEstudiate.insertEstudiate(sql);
        
        return t;       
        
    }
   
}
