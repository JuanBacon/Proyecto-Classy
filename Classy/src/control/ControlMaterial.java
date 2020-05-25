
package control;

import modelo.Material;

public class ControlMaterial {
    
    public boolean insertarMaterial(Material objma){
        boolean t= false;
        Material obj;   
        String sql = "INSERT INTO materiales (nombre_material, archivo_material, id_publicacionF) VALUES (?,?,?);";
        t = objma.insertMaterial(objma, sql);

        return t;
    }
    
}
