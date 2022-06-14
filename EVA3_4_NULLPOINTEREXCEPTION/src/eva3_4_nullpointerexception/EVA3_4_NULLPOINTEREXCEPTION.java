/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_4_nullpointerexception;

/**
 *
 * @author carlitroos
 */
public class EVA3_4_NULLPOINTEREXCEPTION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona persona = null;
        imprimir(persona);
        System.out.println("Fin de main");
       
    }
    public static void imprimir(Persona perso){
        masCompicado(perso);
        System.out.println("fin de imprimir");
    }
    public static void masCompicado(Persona perso){
    System.out.println("Nombre: " + perso.getNombre());
    System.out.println("Fin de mas compicado");
    }
}

class Persona {
    private String nombre;

    public Persona() {
    }
    

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
