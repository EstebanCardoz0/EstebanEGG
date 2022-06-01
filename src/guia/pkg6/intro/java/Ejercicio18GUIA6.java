/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg6.intro.java;

//import static guia.pkg6.intro.java.Ejercicio17GUIA6.llenarvector;
import java.util.Random;
import java.util.Scanner;

/**
 *Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).
 * @author Esteban
 */
public class Ejercicio18GUIA6 {
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
              System.out.println("el indice "+i+","+j+" vale "+matriz [i][j]);
          }
            
           
        }
    
    }
     public static void mostrarMatrizTrans (int [][] matriz){
        
      for (int i = 0; i < 3; i++) {
          for (int j = 0; j < 3; j++) {
              System.out.println("el indice "+i+","+j+" vale "+matriz [j][i]);
          }
            
           
        }
    
    }
    
    
}//final
