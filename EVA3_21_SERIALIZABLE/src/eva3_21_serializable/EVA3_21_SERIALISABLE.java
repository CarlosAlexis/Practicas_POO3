/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_21_serialisable;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author invitado
 */
public class EVA3_21_SERIALISABLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //BINARIOS  Y DE TEXTO
        //ESPECIFICAR QUE OBJETO (CLASES)SON SERIALISABLES
        //DEBEMOS HACER QUE LA CLASE IMPLEMENTE LA INTERFAZ SERIALIZABLE
        Persona persona =new Persona("alex","urquidi");
        escribirObj(persona);
    }
    
    //Guardar objetos
    public static void escribirObj(Object obj){
        try {
            FileOutputStream abrirArch=new FileOutputStream("C:\\Users\\invitado\\Documents\\practcasArchivos\\practica21.obj");
            ObjectOutputStream guardarObj=new ObjectOutputStream(abrirArch);
            guardarObj.writeObject(obj);
            guardarObj.flush();
            guardarObj.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EVA3_21_SERIALISABLE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EVA3_21_SERIALISABLE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //Leer objetos
    public static void leerObj(Object obj){
        try {
            FileInputStream abrirArch=new FileInputStream("C:\\Users\\invitado\\Documents\\practicasArchivos\\practica21.obj");
            ObjectInputStream leerObj=new ObjectInputStream(abrirArch);
            Persona persona=(Persona) leerObj.readObject();
            System.out.println("Nombre: "+persona.getNombre()+" Apellido: "+persona.getApellido());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EVA3_21_SERIALISABLE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EVA3_21_SERIALISABLE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EVA3_21_SERIALISABLE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

class Persona implements Serializable{
    private String nombre;
    private String apellido;

    public Persona() {
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
}
