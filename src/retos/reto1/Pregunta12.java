/*
 * Pregunta 12 que imprime el menor de 3 numeros
Hector ALejandro Hernandez Velasco 10/10/2025
 */
package retos.reto1;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Pregunta12 {
      static int []nume = new int [3]; // arreglo para ingresar los numeros 
    public static void main(String[] args) {
        // TODO code application logic here
        
       Scanner sc = new Scanner (System.in);
      
        for (int i=0;i<nume.length;i++) { // siclo para leer numeros
            System.out.println("ingrese numero ");
            nume[i]=sc.nextInt(); 
            
        }
        
        
        System.out.println("menor es "+regresaV(nume[0],nume[1],nume[2]));//aqui llamamos al metodo que retorna
    }
    static int regresaV(int a, int b, int c){// metodo que retorna el valor menor
        if (a<b&&a<c){
            
                return a;
            
        }
       else if (b<c){
            return b;
        }
        else return c;
        
    } 
    
}
