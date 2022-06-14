/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_18_archvos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author invitado
 */
public class EVA3_18_ARCHVOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            //RUTA
            //fileInputStream
            FileInputStream archivo=new FileInputStream("C:\\Users\\invitado\\Documents\\ARCHIVOS_PRAC18\\PRACTICA18.txt");
            int caracter=archivo.read();
            while(caracter!=-1){
            System.out.println("Leer: "+caracter);
            caracter=archivo.read();
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
    
}
