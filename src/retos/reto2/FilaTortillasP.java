/*
 Programa de tortilleria qye agrega personas a una fila puede sacar en orden o inverso mostrar terminar programa
Hector Alejandro Hernandez Velasco 24/10/2025
 */
package retos.reto2;

import java.util.Scanner;

public class FilaTortillasP {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        Persona inicioFila = null;
        Persona finFila = null;

        do {
            System.out.println("\n--- FILA DE TORTILLAS ---");
            System.out.println("1. Agregar cliente (Regular o Preferencial)");
            System.out.println("2. Atender cliente");
            System.out.println("3. Cliente sale de la fila");
            System.out.println("4. Mostrar fila (normal o inversa)");
            System.out.println("5. Terminar servicio");
            System.out.print("Ingrese opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del cliente: ");
                    String nombre = sc.nextLine();
                    System.out.print("Tipo de cliente (R = Regular / P = Preferencial): ");
                    char tipo = sc.next().toUpperCase().charAt(0);
                    sc.nextLine();

                    Persona nueva = new Persona(nombre);

                    if (inicioFila == null) {
                        inicioFila = finFila = nueva;
                    } else if (tipo == 'P') {
                        // Preferencial: al inicio
                        nueva.vieneAtras = inicioFila;
                        inicioFila.vieneAdelante = nueva;
                        inicioFila = nueva;
                    } else {
                        // Regular: al final
                        finFila.vieneAtras = nueva;
                        nueva.vieneAdelante = finFila;
                        finFila = nueva;
                    }
                    System.out.println("Cliente agregado correctamente.");
                    break;

                case 2:
                    if (inicioFila != null) {
                        System.out.println("Atendiendo a: " + inicioFila.nombre);
                        inicioFila = inicioFila.vieneAtras;
                        if (inicioFila != null)
                            inicioFila.vieneAdelante = null;
                        else
                            finFila = null;
                    } else {
                        System.out.println("No hay clientes en la fila.");
                    }
                    break;

                case 3:
                    if (inicioFila == null) {
                        System.out.println("La fila esta vacia.");
                        break;
                    }

                    System.out.print("Nombre del cliente a eliminar: ");
                    String eliminar = sc.nextLine();

                    Persona actual = inicioFila;
                    boolean encontrado = false;

                    while (actual != null) {
                        if (actual.nombre.equalsIgnoreCase(eliminar)) {
                            encontrado = true;
                            if (actual == inicioFila) {
                                inicioFila = actual.vieneAtras;
                                if (inicioFila != null)
                                    inicioFila.vieneAdelante = null;
                                else
                                    finFila = null;
                            } else if (actual == finFila) {
                                finFila = actual.vieneAdelante;
                                if (finFila != null)
                                    finFila.vieneAtras = null;
                                else
                                    inicioFila = null;
                            } else {
                                actual.vieneAdelante.vieneAtras = actual.vieneAtras;
                                actual.vieneAtras.vieneAdelante = actual.vieneAdelante;
                            }
                            System.out.println("Cliente eliminado de la fila.");
                            break;
                        }
                        actual = actual.vieneAtras;
                    }

                    if (!encontrado) {
                        System.out.println("Cliente no encontrado en la fila.");
                    }
                    break;

                case 4:
                    if (inicioFila == null) {
                        System.out.println("La fila esta vacia.");
                        break;
                    }

                    System.out.print("Mostrar en orden normal (N) o inverso (I)? ");
                    char orden = sc.next().toUpperCase().charAt(0);
                    sc.nextLine();

                    if (orden == 'N') {
                        System.out.println("Fila (orden normal):");
                        imprimirNormal(inicioFila);
                    } else {
                        System.out.println("Fila (orden inverso):");
                        imprimirInverso(finFila);
                    }
                    break;

                case 5:
                    System.out.println("\nServicio terminado.");
                    int contador = 0;
                    Persona aux = inicioFila;
                    while (aux != null) {
                        contador++;
                        aux = aux.vieneAtras;
                    }

                    System.out.println("Personas sin atender: " + contador);
                    if (inicioFila != null) {
                        System.out.println("Clientes restantes en la fila:");
                        imprimirNormal(inicioFila);
                    } else {
                        System.out.println("No hay nadie en la fila.");
                    }
                    break;

                default:
                    System.out.println("Opcion no valida, intente nuevamente.");
            }

        } while (opcion != 5);
    }

    // Imprime en orden normal (inicio -> final)
    public static void imprimirNormal(Persona persona) {
        Persona temp = persona;
        while (temp != null) {
            System.out.print(temp.nombre + " -> ");
            temp = temp.vieneAtras;
        }
        System.out.println("FIN");
    }

    // Imprime en orden inverso (final -> inicio)
    public static void imprimirInverso(Persona persona) {
        Persona temp = persona;
        while (temp != null) {
            System.out.print(temp.nombre + " <- ");
            temp = temp.vieneAdelante;
        }
        System.out.println("INICIO");
    }
}

class Persona {
    String nombre;
    Persona vieneAtras;     // siguiente en la fila
    Persona vieneAdelante;  // anterior en la fila

    public Persona(String nombre) {
        this.nombre = nombre;
        this.vieneAtras = null;
        this.vieneAdelante = null;
    }
}