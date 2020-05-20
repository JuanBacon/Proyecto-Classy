
package Classy;

import control.BaseDatos;


public class ClassyMain {

   
    public static void main(String[] args) {
        
        BaseDatos objb=new BaseDatos();
        boolean t=objb.crearConexion();
        if(t==true){
            System.out.println("Conexión exitosa");
        }else{
          System.out.println("Conexión no exitosa");  
        }
        
    }
    
}
