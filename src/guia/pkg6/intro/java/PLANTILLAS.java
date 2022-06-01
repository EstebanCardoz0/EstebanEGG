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
public class PLANTILLAS {
    public static void main(String[] args) {
        
  
    }
    
     public static void llenarMatriz (int [][] matriz, Random azar){
      for (int i = 0; i < 3; i++) {
          for (int j = 0; j < 3; j++) {
             matriz [i][j]=azar.nextInt(15); 
          }
            
        }
    } 
    
    ///////////////////////////////////////////////////////////////////
    
      public static void mostrarMatriz (int [][] matriz){
        
      for (int i = 0; i < 3; i++) {
          for (int j = 0; j < 3; j++) {
              System.out.println("el indice "+i+","+j+" vale "+matriz [i][j]);
          }
            
           
        }
    
    }
      ////////////////////////////////////////////////////////////////
      
       public static void mostrarMatrizTrans (int [][] matriz){
        
      for (int i = 0; i < 3; i++) {
          for (int j = 0; j < 3; j++) {
              System.out.println("el indice "+i+","+j+" vale "+matriz [j][i]);
          }
            
           
        }
    
    }
    /////////////////////////////////////////////////////////
    
        public static void MatrizManual (int[][] matriz){
     Scanner leer=new Scanner (System.in);
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("escriba el valor del índice "+i+","+j);
            matriz [i][j]= leer.nextInt();
                if (matriz[i][j]>9||matriz[i][j]<1) {
                    
                
                do {
                     System.out.println("número invalido, ingreselo de nuevo");
                     matriz [i][j]= leer.nextInt();
                } while (matriz[i][j]>9||matriz[i][j]<1);
                
            }
            }
        }
    
    }
    
    /////////////////////////////////////////////////////////////////////////////
    
    public static void mostrarmatrizSola (int[][] matriz){
        System.out.println("---MATRIZ---");
    for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz [i][j]+" ");
            
            
            }
            System.out.println("");
        }
    
    }
    
    
    
    
    
    
    
    
}//FINAL
