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
public class Ej11pag31GUIA6 {
    
    
        public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cadena;
        System.out.println("ingrese una frase");
        cadena=leer.nextLine();
            cadena=cadena.replace("a","@");
            cadena=cadena.replace("e","#");
            cadena=cadena.replace("i","$");
            cadena=cadena.replace("o","%");
            cadena=cadena.replace("u","*");
            System.out.println("La cadena queda: " +cadena);
            
        
       // String frase = leer.nextLine();
       
        //String resultado = reemplazo(frase);
        //System.out.println(resultado);
        
    }
    
    public static String reemplazo(String frase){
          String resultado= "";
        for (int i = 0; i < frase.length(); i++) {
            switch (frase.substring(i,i+1)){
                case "a":
                    resultado = resultado.concat("@");
                    break;
                case "e":
                  resultado = resultado.concat("#");
                    break;  
                case "i":
                    resultado = resultado.concat("$");
                    break;
                case "o":
                    resultado = resultado.concat("%");
                    break;
                case "u":
                    resultado = resultado.concat("*");
                    break;
                default:
                    
                    return resultado;

    
    }
    
}
    
    


