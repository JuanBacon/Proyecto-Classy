
package control;

import modelo.Profesor;


public class ControlProfesor {
    
    public boolean insertarProfesor(Profesor objp) {
        boolean t=false;
        Profesor objprofesor = new Profesor();
        String sql="INSERT INTO profesores (id_profesor, nombre1_profesor, nombre2_profesor, "
                + "apellido1_profesor, apellido2_profesor, correo_profesor, direccion_profesor, "
                + "contrasenia_profesor, fecha_creacion_p, id_paisF) "
                + "VALUES ('"+ objprofesor.getId_profesor() +"', '"+ objprofesor.getNombre1_profesor()+"', "
                + "'"+ objprofesor.getNombre2_profesor()+"', '"+ objprofesor.getApellido1_profesor()+"', "
                + "'"+ objprofesor.getApellido2_profesor()+"', '"+ objprofesor.getCorreo_profesor()+"', "
                + "'"+ objprofesor.getDireccion_profesor()+"', '"+ objprofesor.getContrasenia_profesor()+"', "
                + "'"+ objprofesor.getFecha_creacion_p()+"', '"+ objprofesor.getId_paisF()+"');";
        t = objprofesor.insertProfesor(sql);
        
        return t;       
        
    }
}
