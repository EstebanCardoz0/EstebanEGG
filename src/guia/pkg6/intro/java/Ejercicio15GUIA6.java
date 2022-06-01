/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg6.intro.java;

import java.util.Scanner;

/**
 *Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 * @author Esteban
 */
public class Ejercicio15GUIA6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       int [] vector= new int [100];
       llenarvector (vector);
       
       mostrarvector (vector); 
          
        
    }
    
    public static void llenarvector (int [] vector){
      for (int i = 0; i < 100; i++) {
            vector [i]=i;
        }
    
    }
    
    public static void mostrarvector (int [] vector){
        int var=99;
      for (int i = 0; i < 100; i++) {
            System.out.println("el vector "+var+" vale "+vector [var]);
            var=var-1;
        }
    
    }
    
}
