/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_20_escribir;

import java.io.*;
import java.nio.file.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author invitado
 */
public class EVA3_20_ESCRIBIR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Path ruta=Paths.get("C:\\Users\\invitado\\Documents\\prac20\\practica20.txt");
        OutputStream abrirArch;
        OutputStreamWriter escribirArch;
        BufferedWriter escribirTexto;
        try {
            abrirArch=Files.newOutputStream(ruta);
            escribirArch=new OutputStreamWriter(abrirArch);
            escribirTexto=new BufferedWriter(escribirArch);
            escribirTexto.write("MI NOMBRE ES ALEX");
            escribirTexto.newLine();
            escribirTexto.write("Modificar el archivo");
            escribirTexto.flush();//HACE PERMANENTE LOS CAMBIOS
            escribirTexto.close();//SIEMPRE HAY QUE CERRAR EL STREAM
        } catch (IOException ex) {
            Logger.getLogger(EVA3_20_ESCRIBIR.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
