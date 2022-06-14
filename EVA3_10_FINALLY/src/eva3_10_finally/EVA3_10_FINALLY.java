/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_10_finally;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_10_FINALLY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Scanner input=new Scanner (System.in);
            System.out.println("Introuce un numero entero");
            int valor = input.nextInt();
            System.out.println("El valor es: "+valor);
        }catch(ArithmeticException e){
            e.printStackTrace();
        }finally{// SIEMPRE SE EJECUTA
            System.out.println("ESTA LINEA SIEMPRE SE EJECUTA");
        }
    }
    
}
