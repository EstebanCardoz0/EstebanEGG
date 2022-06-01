/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg6.intro.java;

import static guia.pkg6.intro.java.Ejercicio15GUIA6.llenarvector;
import java.util.Random;
import java.util.Scanner;

/**
 *Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 * @author Esteban
 */
public class Ejercicio16GUIA6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random azar=new Random();
        int [] vector= new int [20];
        
        System.out.println("ingrese un número a buscar (0 a 10)");
        int num=leer.nextInt();
        llenarvector (vector, azar, num);
        
        
    }
    
    public static void llenarvector (int [] vector, Random azar, int num){
      int contador=0;
        for (int i = 0; i < 20; i++) {
            vector [i]=azar.nextInt(10);
            if (vector [i]==num) {
                System.out.println("el numero "+num+" se encuentra en el indice "+i+" del vector");
          }else {
               contador=contador+1;
                //System.out.println("el número "+num+" no se encuentra en el vector");
            }
        }
    if (contador==20) {
            System.out.println("el número "+num+" no se encuentra en el vector");
        }
    }
        
    }
    

