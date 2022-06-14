/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_15_mejora_throw_2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author carlitroos
 */
public class EVA3_15_MEJORA_THROW_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona= new Persona();
        boolean datoErroneo =true; //EL USUARIO SIEMPRE SE EQUIVOCA
        Scanner input=new Scanner(System.in);
        int ed=0;
        do{
            try {
                System.out.println("Ingrese la edad:");
                ed=input.nextInt();
                persona.setEdad(ed);
                datoErroneo=false;
                System.out.println("La edad es: "+persona.getEdad());
            } catch (Exception ex) {
                System.out.println("Rango de edad invalido");
            }
        }while(datoErroneo);
               
    }
    
}

class Persona{
    private String nombre;
    private int edad;

    public Persona() {
        
    }

    public Persona(String nombre, int edad) throws Exception {
        this.nombre = nombre;
        setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception {
        if(edad>=0 && (edad<=130)){
            this.edad = edad;
        }else{
            throw new Exception("Rango de edad incorrecta");
        }
        
    }
    
}