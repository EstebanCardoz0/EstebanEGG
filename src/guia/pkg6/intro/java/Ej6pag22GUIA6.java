/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg6.intro.java;

import java.util.Scanner;
import static javafx.beans.binding.Bindings.and;
import static javafx.beans.binding.Bindings.or;

/**
 *
 * @author Esteban
 */
public class Ej6pag22GUIA6 {
    public static void main(String[] args) {
      
    Scanner leer= new Scanner (System.in);    
    System.out.println("ingrese dos numeros enteros");
    int numero1=leer.nextInt();
    int numero2=leer.nextInt();
    if (numero1>25||numero2>25){
    
    System.out.println("al menos uno de los números es mayor a 25");
    }else{
    System.out.println("ambos números son menores a 25");
    }
    
    
    
    
}
}