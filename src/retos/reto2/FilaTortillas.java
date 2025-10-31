/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retos.reto2;


import java.util.Scanner;

public class FilaTortillas {
    static Scanner sc = new Scanner(System.in);
    static String[] fila;
    static int total = 0;

    public static void main(String[] args) {
        System.out.print("Cuantas personas maximo estaran en la fila? ");
        int tam = sc.nextInt();
        sc.nextLine();
        fila = new String[tam];

        int opcion;
        do {
            System.out.println("\n--- Fila de las Tortillas ---");
            System.out.println("1. Agregar cliente");
            System.out.println("2. Atender cliente");
            System.out.println("3. Cliente sale de la fila");
            System.out.println("4. Terminar servicio");
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> agregarCliente();
                case 2 -> atenderCliente();
                case 3 -> clienteSale();
                case 4 -> terminarServicio();
                default -> System.out.println("Opcion invalida, intenta de nuevo");
            }
        } while (opcion != 4); // termina ciclo 
    }

    static void agregarCliente() { // se agrega cliente
        if (total == fila.length) {
            System.out.println("La fila esta llena");
            return;
        }
        System.out.print("Nombre del cliente: ");
        String nombre = sc.nextLine();
        fila[total] = nombre;
        total++;
        System.out.println(nombre + " se unio a la fila");
    }

    static void atenderCliente() { // se atiende  un cliente
        if (total == 0) {
            System.out.println("No hay clientes en la fila");
            return;
        }
        System.out.println("Se atendio a: " + fila[0]);
        for (int i = 0; i < total - 1; i++) {
            fila[i] = fila[i + 1];
        }
        fila[total - 1] = null;
        total--;
    }

    static void clienteSale() { // si un cliente sale entra aqui
        if (total == 0) {
            System.out.println("No hay clientes en la fila");
            return;
        }
        System.out.print("Nombre del cliente que sale: ");
        String nombre = sc.nextLine();
        int pos = buscarCliente(nombre);
        if (pos == -1) {
            System.out.println("No se encontro a " + nombre + " en la fila");
            return;
        }
        for (int i = pos; i < total - 1; i++) {
            fila[i] = fila[i + 1];
        }
        fila[total - 1] = null;
        total--;
        System.out.println(nombre + " salio de la fila");
    }

    static int buscarCliente(String nombre) { // busca cliente
        for (int i = 0; i < total; i++) {
            if (fila[i].equalsIgnoreCase(nombre)) {
                return i;
            }
        }
        return -1;
    }

    static void terminarServicio() { // terminar servicio
        System.out.println("\n--- Servicio terminado ---");
        System.out.println("Quedaron " + total + " personas en la fila");
        if (total > 0) {
            System.out.println("Personas restantes:");
            for (int i = 0; i < total; i++) {
                System.out.println((i + 1) + ". " + fila[i]);
            }
        }
    }
}