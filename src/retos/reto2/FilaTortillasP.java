/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retos.reto2;

import java.util.Scanner;
import static retos.reto2.FilaTortillas.agregar;

/**
 *
 * @author LENOVO
 */
public class FilaTortillasP {
    static Scanner sc = new Scanner (System.in);
static String [] fila = new String [4];
    public static void main(String[] args) {
        int i =0;
      int b;
      Persona inicioFila= null;
        do{
            System.out.println("1. agregar cliente ");
            System.out.println("2. atender cliente");
            System.out.println("3 cliente sale de la fila ");
            System.out.println("4 terminar servicion ");
            System.out.println("ingrese opcion ");
           b =sc.nextInt();
           sc.nextLine();
           switch (b){
               case 1:
                   System.out.println("Dame un nombre ");
                   String nombre =sc.nextLine();
                   Persona personaNueva = new Persona();
                   personaNueva.nombre= nombre;
                   if (inicioFila== null)
                       inicioFila=personaNueva;
                   else{
                       Persona siguiente= inicioFila;
                       while (siguiente.vieneAtras!= null){
                           siguiente = siguiente.vieneAtras;
                       }
                       siguiente.vieneAtras=personaNueva;
                   }
                 imprimirLista(inicioFila);      
                   
                   break;
               case 2:
                   if (inicioFila!=null)
                       inicioFila= inicioFila.vieneAtras;
                   imprimirLista(inicioFila);
                   break;
               case 3:
                   System.out.println("A quien quieres eliminar: ");
                   String elimina= sc.nextLine();
                   Persona buscado=inicioFila;
                 Persona atras=null;
                 while(buscado.nombre.endsWith(elimina)&& buscado!=null){
                     atras =buscado;
                     buscado=buscado.vieneAtras;
                 }
                 if (buscado!=null){
                     if (atras== null)inicioFila=inicioFila.vieneAtras;
                     else if (buscado.vieneAtras== null)atras.vieneAtras=null;
                     else atras.vieneAtras=buscado.vieneAtras;
                 }
               case 4:
                   System.out.println("Terminando servicio ");
                   int contador= 0;
                   while(inicioFila!=null){
                       contador++;
                       inicioFila= inicioFila.vieneAtras;
                   }
                   System.out.println("las personas sin atender son "+contador);
                   
           }
               
         
            
        }
        while(b!=4);
}
    public static void imprimirLista(Persona persona){
        if (persona !=null){
            System.out.println(persona.nombre );
            imprimirLista(persona.vieneAtras);
        }
    }
}
    class Persona{
        String nombre;
        Persona vieneAtras;
    }
