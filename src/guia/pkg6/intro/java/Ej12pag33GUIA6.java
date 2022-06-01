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
public class Ej12pag33GUIA6 {
    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        System.out.println("ingrese dos numeros enteros");
       int num1=leer.nextInt();
        int num2=leer.nextInt();
        esMultiplo(num1, num2);
    }
    
    public static void esMultiplo (int num1, int num2){
        if (num1%num2==0){
            System.out.println("el primer numero es multiplo del segundo");
        }else {
            System.out.println("el primer numero NO es multiplo del segundo");
       
    }
    }
    
}

