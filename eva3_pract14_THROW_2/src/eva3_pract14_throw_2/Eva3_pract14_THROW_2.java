/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_pract14_throw_2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author invitado
 */
public class Eva3_pract14_THROW_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        persona per1 = new persona();
        try {
            per1.setEdad(15);
        } catch (Exception ex) {
           ex.printStackTrace();
        }
        per1.setNombre("Don juan");
        
        try {
            persona per2 = new persona(14,"lupita");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}
class persona{
    private int edad;
    private String nombre;

    public persona(int edad, String nombre) throws Exception {
        
        setEdad(edad);
        this.nombre = nombre;
    }

    public persona() {
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) throws Exception {
        if ((edad<=120) && (edad>=0)) {
        this.edad = edad;
        }else{
        throw new Exception ("Edad no valida");
        }
        
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
