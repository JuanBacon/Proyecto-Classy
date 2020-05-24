
package control;

import modelo.Profesor;


public class ControlProfesor {
    
    public boolean insertarProfesor(Profesor objp) {
        boolean t=false;
        Profesor objprofesor = new Profesor();
        String sql="INSERT INTO profesores (nombre1_profesor, nombre2_profesor, "
                + "apellido1_profesor, apellido2_profesor, correo_profesor, direccion_profesor, "
                + "contrasenia_profesor, fecha_creacion_p, id_paisF) "
                + "VALUES ('"+ objp.getNombre1_profesor()+"', "
                + "'"+ objp.getNombre2_profesor()+"', '"+ objp.getApellido1_profesor()+"', "
                + "'"+ objp.getApellido2_profesor()+"', '"+ objp.getCorreo_profesor()+"', "
                + "'"+ objp.getDireccion_profesor()+"', '"+ objp.getContrasenia_profesor()+"', "
                + "'"+ objp.getFecha_creacion_p()+"', '"+ objp.getId_paisF()+"');";
        t = objprofesor.insertProfesor(sql);
        
        return t;       
        
    }
}
