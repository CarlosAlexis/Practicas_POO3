/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_22_serialisable_arreglos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author invitado
 */
public class EVA3_22_SERIALISABLE_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Persona> miListaPersona=new ArrayList();     //<> SON TIPOS DE DATOS GENERICOS
        //java->listas, arreglos, etc: 0->n-1
        miListaPersona.add(new Persona("Alex","Urquidi"));
        miListaPersona.add(new Persona("Crlos","Gonzalez"));
        miListaPersona.add(new Persona("Daniel","Gonzalez"));
        miListaPersona.add(new Persona("Manuel","Urquidi"));
        escribirObj(miListaPersona);
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
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void leerObj(Object obj){
        try {
            FileInputStream abrirArch=new FileInputStream("C:\\Users\\invitado\\Documents\\practicasArchivos\\practica21.obj");
            ObjectInputStream leerObj=new ObjectInputStream(abrirArch);
            ArrayList <Persona> miListaPersona=(ArrayList<Persona>) leerObj.readObject();
            for (int i = 0; i<miListaPersona.size(); i++) {
                Persona persona=miListaPersona.get(i);
                System.out.println("Nombre: "+persona.getNombre()+" Apellido: "+persona.getApellido());
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
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