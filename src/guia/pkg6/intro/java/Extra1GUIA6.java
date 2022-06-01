/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg6.intro.java;

import java.util.Scanner;

/**
 *Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 * @author Esteban
 */
public class Extra1GUIA6 {
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in); 
        System.out.println("ingrese un tiempo en minutos");
        int minutos=leer.nextInt();
        int minutos1=minutos;
        int dias=minutos1/1440;
        minutos1%=1440;
        int horas=minutos1/60;
        minutos1&=60;
        
        System.out.println(minutos+" minutos equivalen a "+dias+" dias, "+horas+" horas, "+minutos1+" minutos.");
        
    }
}
