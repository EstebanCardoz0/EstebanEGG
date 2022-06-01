/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg6.intro.java;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Ejercicio19GUIA6 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        Random azar=new Random();
        int [][] matriz= new int [3][3];
         llenarMatriz (matriz, azar);
        mostrarMatriz (matriz);
        System.out.println("");
        System.out.println("TRANSPUESTA");
        System.out.println("");
        mostrarMatrizTrans (matriz);
        System.out.println("");
        ComprobarAntisimetría (matriz);
        
    }//class
    public static void llenarMatriz (int [][] matriz, Random azar){
      for (int i = 0; i < 3; i++) {
          for (int j = 0; j < 3; j++) {
             matriz [i][j]=azar.nextInt(15); 
          }
            
        }
    } 
      public static void mostrarMatriz (int [][] matriz){
        
      for (int i = 0; i < 3; i++) {
          for (int j = 0; j < 3; j++) {
              System.out.print(matriz [i][j]+" ");
          }
            
           System.out.println("");
        }
    
    }
     public static void mostrarMatrizTrans (int [][] matriz){
        
      for (int i = 0; i < 3; i++) {
          for (int j = 0; j < 3; j++) {
              System.out.print(matriz [j][i]+" ");
          }
            
           System.out.println("");
        }
    
    }
    public static void ComprobarAntisimetría (int [][] matriz){
    boolean simetria=false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] != -matriz [j][i]) {
                    simetria=true; 
                }
 
            }
        }
        if (simetria=true) {
            System.out.println("la matriz NO es antisimétrica");
        }else {
            System.out.println("la matriz es antisimétrica");
        }
    
    }
    
}//final
