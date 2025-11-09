/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploColas;

import java.util.Arrays;

/**
 *metodo para probar el funcionamiento de una fila
 * @author LENOVO
 */
public class SimulacionFila {
    public static void main(String[] args) {
        var fila = new MiFila(5);
        fila.offer("pepe");
        fila.offer("janeth");
        fila.offer("pedro");
        System.out.println("valores hasta el momento "+Arrays.toString(fila.aArreglo()));
        fila.poll();
        System.out.println("Valores "+Arrays.toString(fila.aArreglo()));
        
    }
    
}
