/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_6_try_catch_zero;

import java.util.Scanner;

/**
 *
 * @author carlitroos
 */
public class EVA3_6_TRY_CATCH_ZERO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =new Scanner(System.in);
        System.out.println("Introduce numero entero: ");
        int entero=input.nextInt();
        System.out.println("Introduce otro numero entero: ");
        int entero2=input.nextInt();
        try{
        System.out.println("Division; "+(entero/entero2));
        }catch(java.lang.ArithmeticException e){
            e.printStackTrace();
            System.out.println("se produjo una division entre 0");
        }
        
        System.out.println("Fin del programa");
        
    }
    
}
