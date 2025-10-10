/*
 ejercicio para el uso de arrelglos
Hector Alejandro Hernandz 07-10-2025
 */
package arreglos;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Tabla {
    public static void main(String[] args) {
        int arreglo[]= new int [20];
        int [] arreglo2= {4,3,2,1,2};
        int matriz[][]= new int[3][4];
        int [][] matriz2 = {{2,4,2,},{1,2,3}};
        System.out.println("el primer arreglo 1 tiene "+arreglo.length+" posiciones");
          System.out.println("el primer arreglo 2 tiene "+arreglo2.length+" posiciones");
          System.out.println("valor "+matriz2[0].length);
          String[][] misdatos= new String[5][3];   
          Scanner sc =new Scanner(System.in);
          for(int i=0;i<5;i++){
              System.out.println("Dame nombre ");
              var nombre= sc.nextLine();
              System.out.println("Dame carrera ");
              var carrera = sc.nextLine();
              System.out.println("dame edad ");
              var edad = sc.nextLine();
              misdatos[i][0]=nombre;
              misdatos[i][1]=carrera;
              misdatos[i][2]=edad;
;              
        
    }
          // imprimir la matriz
          for (String[] misdato : misdatos) {
              for (String Dato : misdato) {
                  System.out.printf("%-10s ",Dato);
              }
              System.out.println("");
        }
    }
// pedir 3 nombres, 3 carreras
// pedir 3 edades 
// acomodar en una tabla que sea 
//nombre carreras edad
    //silo hace
 //algo
    //ya actualice
    //algo
}

