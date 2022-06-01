/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg6.intro.java;

import java.util.Random;
import java.util.Scanner;

/**
 *Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 * @author Esteban
 */
public class Ejercicio17GUIA6 {
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        Random azar=new Random();
        int [] vector= new int [20];
        llenarvector (vector, azar);
        System.out.println("Valores del vector");
        System.out.println("");
        mostrarvector (vector);
        System.out.println("");
        evaluarvector (vector);
    } //class
    
    
    
     public static void llenarvector (int [] vector, Random azar){
      for (int i = 0; i < 20; i++) {
            vector [i]=azar.nextInt(22222);
        }
    }
    public static void mostrarvector (int [] vector){
        
      for (int i = 0; i < 20; i++) {
            System.out.println("el indice "+i+" vale "+vector [i]);
           
        }
    
    }
    public static void evaluarvector (int [] vector){
        int uno=0;
        int dos=0;
        int tres=0;
        int cuatro=0;
        int cinco=0;
        for (int i = 0; i < 20; i++) {
            if (vector[i]<10) {
                uno=uno+1;
            }
            if (vector[i]<100&&vector[i]>9) {
               dos=dos+1;
            }
            if (vector[i]<1000&&vector[i]>99) {
                tres=tres+1;
            }
            if (vector[i]<10000&&vector[i]>999) {
                cuatro=cuatro+1;
            }
            if (vector[i]<100000&&vector[i]>9999){
                cinco=cinco+1;
            }
        }//finalfor
        System.out.println("hay "+uno+" numeros de un digito");
        System.out.println("hay "+dos+" numeros de dos digitos");
        System.out.println("hay "+tres+" numeros de tres digitos");
        System.out.println("hay "+cuatro+" numeros de cuatro digitos");
        System.out.println("hay "+cinco+" numeros de cinco digitos");
    
    }
} //final
