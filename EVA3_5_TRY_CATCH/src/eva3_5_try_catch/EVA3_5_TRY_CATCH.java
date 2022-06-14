/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_5_try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author carlitroos
 */
public class EVA3_5_TRY_CATCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =new Scanner (System.in);
        System.out.println("Introduce tu edad (numero entero)");
        int edad=0;
        try{
            edad=input.nextInt();
        }catch(InputMismatchException e){
            //e.printStackTrace();
            System.out.println("Falla la captura");
        }
        System.out.println("Tu edad es: "+edad);
    }
    
}
