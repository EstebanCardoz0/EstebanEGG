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
public class Ejercicio20GUIA6 {
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        int [][] matriz= new int [3][3];
      
         
       MatrizManual (matriz);
        System.out.println("");
        mostrarmatriz (matriz);
        System.out.println("");
        MAGIC (matriz);
    }//class
    
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
    
    public static void mostrarmatriz (int[][] matriz){
        System.out.println("---MATRIZ---");
    for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz [i][j]+" ");
            
            
            }
            System.out.println("");
        }
    
    }
    
    public static void MAGIC (int [][] matriz){
        if (matriz [0][0]+matriz [0][1]+matriz [0][2]==matriz [1][0]+matriz [1][1]+matriz [1][2]) {
            if (matriz [0][0]+matriz [0][1]+matriz [0][2]==matriz [2][0]+matriz [2][1]+matriz [2][2]) {
                if (matriz [0][0]+matriz [0][1]+matriz [0][2]==matriz [0][0]+matriz [1][0]+matriz [2][0]) {
                    if (matriz [0][0]+matriz [0][1]+matriz [0][2]==matriz [0][1]+matriz [1][1]+matriz [2][1]) {
                        if (matriz [0][0]+matriz [0][1]+matriz [0][2]==matriz [0][2]+matriz [1][2]+matriz [2][2]) {
                            if (matriz [0][0]+matriz [0][1]+matriz [0][2]==matriz [0][0]+matriz [1][1]+matriz [2][2]) {
                                if (matriz [0][0]+matriz [0][1]+matriz [0][2]==matriz [2][0]+matriz [1][1]+matriz [0][2]) {
                                    System.out.println("el cuadrado es MÁGICO");
                                }else {
                                    System.out.println("el cuadrado NO es mágico");
                                }
                            }
                        }
                    }
                }
  
            }
        }
        
    
    }
    
}//final

