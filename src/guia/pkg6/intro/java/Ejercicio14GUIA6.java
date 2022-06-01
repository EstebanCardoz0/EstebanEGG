/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg6.intro.java;

import java.util.Scanner;

/**
 *Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
* 
 * @author Esteban
 */
public class Ejercicio14GUIA6 {
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        System.out.println("escriba el monto en pesos argentinos");
        double monto= leer.nextInt();
        //int monto= 24;
        System.out.println("¿A qué moneda desea convertirlo? (libras, dolares, yenes)");
        String moneda;
        moneda= leer.nextLine();
         double montos;
         //double conver=conversion;
         //System.out.println(conver);
         
         
         
   switch (moneda) {
            case "libras":
                montos=monto*0.86;
                System.out.println(monto+" pesos arg equivalen a "+montos+" libras");
                break;
                  case "dolares":
                montos =monto*1.28611;
                 System.out.println(monto+" pesos arg equivalen a "+montos+" dólares");
                break;
                  case "yenes":
                montos=monto*129.852;
                 System.out.println(monto+" pesos arg equivalen a "+montos+" yenes");
                break;
            
         
    }
    
   
    
  
                                       }
   
   
    
     
}
    
    

