/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retos.reto2;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class Reto2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] fila = new String[20]; // máximo 20 personas
        int total = 0;
        int opcion;

        do {
            System.out.println("\n--- FILA DE LAS TORTILLAS ---");
            System.out.println("1. Agregar cliente");
            System.out.println("2. Atender cliente");
            System.out.println("3. Cliente sale de la fila");
            System.out.println("4. Terminar servicio");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    if (total < fila.length) {
                        System.out.print("Ingrese el nombre del cliente: ");
                        String nombre = sc.nextLine();
                        fila[total] = nombre;
                        total++;
                        System.out.println(nombre + " se ha agregado a la fila.");
                    } else {
                        System.out.println("La fila está llena, no se pueden agregar más clientes.");
                    }
                    break;

                case 2:
                    if (total > 0) {
                        System.out.println("Se atendió al cliente: " + fila[0]);
                        // recorre la fila hacia adelante
                        for (int i = 0; i < total - 1; i++) {
                            fila[i] = fila[i + 1];
                        }
                        fila[total - 1] = null;
                        total--;
                    } else {
                        System.out.println("No hay clientes en la fila.");
                    }
                    break;

                case 3:
                    if (total > 0) {
                        System.out.print("Ingrese el nombre del cliente que se retira: ");
                        String nombreSalida = sc.nextLine();
                        boolean encontrado = false;

                        for (int i = 0; i < total; i++) {
                            if (fila[i].equalsIgnoreCase(nombreSalida)) {
                                encontrado = true;
                                // mover los demás hacia adelante
                                for (int j = i; j < total - 1; j++) {
                                    fila[j] = fila[j + 1];
                                }
                                fila[total - 1] = null;
                                total--;
                                System.out.println(nombreSalida + " ha salido de la fila.");
                                break;
                            }
                        }

                        if (!encontrado) {
                            System.out.println("No se encontró al cliente en la fila.");
                        }
                    } else {
                        System.out.println("No hay clientes en la fila.");
                    }
                    break;

                case 4:
                    System.out.println("\n--- SERVICIO TERMINADO ---");
                    System.out.println("Quedaron " + total + " clientes en la fila.");
                    if (total > 0) {
                        System.out.println("Clientes restantes:");
                        for (int i = 0; i < total; i++) {
                            System.out.println((i + 1) + ". " + fila[i]);
                        }
                    }
                    System.out.println("Gracias por usar el sistema.");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 4);

      
    }
}