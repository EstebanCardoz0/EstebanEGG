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
public class Ej7pag23GUIA6 {
   
   public static void main(String[] args) {
   Scanner leer= new Scanner (System.in);
   System.out.println("ingrese el nivel del motor");
   int motor=leer.nextInt();

   switch (motor)   {
       case 1:
       System.out.println("la bomba es una bomba de agua");
       break;
       case 2:
       System.out.println("la bomba es una bomba de gasolina");
       break;
       case 3:
       System.out.println("la bomba es una bomba de hormigón");
       break;
       case 4:
       System.out.println("la bomba es una bomba de pasta de alimenticia");
       break;
       default:
       System.out.println("No existe un valor válido para tipo de bomba");
       } 
        
        
        
        
        
        
        
}
}