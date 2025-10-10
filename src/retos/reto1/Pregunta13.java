/*
 metodo recursivo que imprime el numero que pidas en forma desendente 
Hector Alejandro Hernandez Velasco 10/10/2025
 */
package retos.reto1;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Pregunta13 {
    public static void main(String[] args) {
        // TODO code application logic here
        
       Scanner sc = new Scanner (System.in);
       int a;
        System.out.println("ingrese numero ");
       metodoR( a = sc.nextInt());//llama metodo
         } 
    static int metodoR(int a){ // caso base
        if (a==0){
            System.out.println(a);
            return a;
        }
        else {
            System.out.println(a);// caso recursivo
            return metodoR(a-1);
        }
    }
    
}
