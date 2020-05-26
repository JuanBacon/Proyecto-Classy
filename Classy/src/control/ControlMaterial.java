
package control;

import modelo.Material;

public class ControlMaterial {
    
    public boolean insertarMaterial(Material objcm){
        boolean t= false;
        Material objm = new Material();   
        String sql = "INSERT INTO materiales (nombre_material, archivo_material, id_publicacionF) VALUES (?,?,?);";
        t = objm.insertMaterial(objcm, sql);

        return t;
    }
    
}