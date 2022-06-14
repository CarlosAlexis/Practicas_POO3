/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_8_multiples_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author carlitroos
 */
public class EVA3_8_MULTIPLES_CATCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =new Scanner(System.in);
        try{
            System.out.println("Introduce numero entero: ");
            int entero=input.nextInt();
            System.out.println("Introduce otro numero entero: ");
            int entero2=input.nextInt();
            System.out.println("Division; "+(entero/entero2));
        }catch(java.lang.ArithmeticException e){
            e.printStackTrace();
            System.out.println("se produjo una division entre 0");
        }catch(InputMismatchException e){
            System.out.println("El valor ingresado no es valido");
        }
        System.out.println("Fin del programa");
    }
    
}
