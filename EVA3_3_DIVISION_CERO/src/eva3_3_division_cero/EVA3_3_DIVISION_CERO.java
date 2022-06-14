/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_3_divicion_cero;

import java.util.Scanner;

/**
 *
 * @author carlitroos
 */
public class EVA3_3_DIVICION_CERO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un numero entero");
        int entero = input.nextInt();
        
        System.out.println("Introduce un numero entero");
        int entero2 = input.nextInt();
        
        System.out.println("Division: " + (entero/entero2));
    }
    
}
