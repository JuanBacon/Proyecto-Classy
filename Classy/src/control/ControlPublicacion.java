
package control;

import modelo.Publicacion;

public class ControlPublicacion {
    
    //aqui necesitamos insertar la publicacion pero la publicacion viene con el material de estudio
  public boolean insertarPublicacion(Publicacion objp)
  {
    boolean t = false;
    Publicacion objp2 = new  Publicacion();
    String sql ="";
    sql= "insert into publicaciones (fecha_publicacion, titulo_publicacion, descripcion_publicacion, id_cursoF ) values ('2020-04-11 07:35:00', 'Valiendo monda','Aprenderemos a valer monda','1');";
    t = objp2.insertarPublicacion(objp, sql);
    return t;  
  }
    
}
