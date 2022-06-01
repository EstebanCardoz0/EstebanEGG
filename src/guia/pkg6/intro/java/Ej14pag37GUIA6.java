/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg6.intro.java;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Ej14pag37GUIA6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String[] vector= new String [5];
        
        for (int i = 0; i < vector.length ; i++) {
            System.out.println("ingrese el compañero de la columna "+i);
          vector[i] = leer.nextLine();
}
        
        
        
    }
}
