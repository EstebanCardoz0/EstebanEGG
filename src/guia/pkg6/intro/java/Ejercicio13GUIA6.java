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
public class Ejercicio13GUIA6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("¿De qué tamaño será el cuadrado?");
        int tamaño= leer.nextInt();
        
        if (tamaño>=0 && tamaño<=50) {
            //superior
            for (int i = 0; i < tamaño; i++) {
                System.out.print("*");
            }
            System.out.println("");
            
            //centro
            for (int i = 0; i < (tamaño-2); i++) {
                System.out.print("*");
                for (int j = 0; j < (tamaño-2); j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
            
            
             //inferior
            for (int i = 0; i < tamaño; i++) {
                System.out.print("*");
            }
            
        }
        
        System.out.println("");
        
        
        
        
        
    }
}
