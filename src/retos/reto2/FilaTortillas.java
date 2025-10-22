/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retos.reto2;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class FilaTortillas {
static Scanner sc = new Scanner (System.in);
static String [] fila = new String [4];
    public static void main(String[] args) {
        int i =0;
      int b;
        do{
            System.out.println("1. agregar cliente ");
            System.out.println("2. atender cliente");
            System.out.println("3 cliente sale de la fila ");
            System.out.println("4 terminar servicion ");
            System.out.println("ingrese opcion ");
           b =sc.nextInt();
           switch (b){
               case 1:
                   agregar(b);
                   b++;
                   break;
               case 2:
                   
           }
         
            
        }
        while(b!=4);
    }
    static void agregar(int a){
        fila[a]=sc.nextLine();
        
    }
   static int atender (String sig){
       for (int i=0;i>fila.length;i++){
           if (sig.equals(fila[i])) return i;
           else return -1;
       }
   }
   
   
}

