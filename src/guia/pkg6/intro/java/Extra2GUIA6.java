/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg6.intro.java;

/**
 *Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 * @author Esteban
 */
public class Extra2GUIA6 {
    public static void main(String[] args) {
       int a=5; 
       int b=10; 
       int c=15; 
       int d=20;
       
        System.out.println("A= "+a);
        System.out.println("B= "+b);
        System.out.println("C= "+c);
        System.out.println("D= "+d);
        
        System.out.println("");
        System.out.println("");
        int a2=a;
        int b2=b;
        a=d;
        b=c;
        c=a2;
        d=b;
        
        System.out.println("A= "+a);
        System.out.println("B= "+b);
        System.out.println("C= "+c);
        System.out.println("D= "+d);
       // System.out.println("A="+(a+1));
        
        
        
        
        
        
    }//class
}//final
