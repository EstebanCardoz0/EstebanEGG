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
public class Ejercicio12GUIA6 {
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         String codigo;
         int correcto= 0;
             int incorrecto= 0;
             
         do {
             System.out.println("ingrese el código");
             codigo=leer.nextLine();
             
             //System.out.println(codigo.length());
             //System.out.println(codigo.substring(0,1));
               //      System.out.println(codigo.substring(4,5));
             
             if (codigo.length()==5) {
                 if ("x".equals(codigo.substring(0,1)) && "o".equals(codigo.substring(4,5))) {
                     correcto= correcto+1;}
                     //System.out.println(codigo.substring(0,0));
                     //System.out.println(codigo.substring(5,5));
                 }else { 
             incorrecto= incorrecto+1;
                 }
             
             if (5!=codigo.length()) { 
             incorrecto= incorrecto+1;
             }
                 
                   } while (!"&&&&&".equals(codigo));
        
         System.out.println("lecturas correctas: "+ correcto);
         System.out.println("lecturas incorrectas: "+ incorrecto);
         
         
             
    
         
}
}