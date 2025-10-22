/*
 * programa que con la llave accedes a los valores 
tarea u3t1 Hector Hernandez 20 10 2025
 */
package u3t1;

/**
 *
 * @author LENOVO
 */
import java.util.HashMap;
import java.util.Scanner;

public class ArreglosAsociativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crear un mapa de países y sus capitales
        HashMap<String, String> paises = new HashMap<>();
        paises.put("MEXICO", "CIUDAD DE MEXICO");
        paises.put("ESPAÑA", "MADRID");
        paises.put("FRANCIA", "PARIS");
        paises.put("JAPON", "TOKIO");
        paises.put("ITALIA", "ROMA");

        System.out.println("=== BUSCADOR DE CAPITALES ===");
        System.out.print("INGRESA EL NOMBRE DE UN PAIS: ");
        String pais = sc.nextLine().toUpperCase(); 

        // Buscar capital según el país
        if (paises.containsKey(pais)) {
            System.out.println("La capital de " + pais + " es: " + paises.get(pais));
        } else {
            System.out.println("No tengo registrada la capital de ese pais.");
        }

        sc.close();
    }
}
