/*

 */
package ejercicio1.datos;

/**
 *Esta clase me permite mantener la informacion entre las ventanas
 * 
 * @author LENOVO Hector
 * 14 de octubre
 */
public class KardexDatos {
    public static String [][] datos=
            new String [10][3];
    public static int index=0; // para saber cuantos llevo
    
public static double calcularPromedio() {
    if (KardexDatos.index == 0) return 0;

    double suma = 0;
    for (int i = 0; i < KardexDatos.index; i++) {
        suma += Double.parseDouble(KardexDatos.datos[i][2]);
    }
    return suma / KardexDatos.index;
    // metodo que calcula el promedio segun lo vallan ingresando
}
public static int buscar(String dato) {
    for (int i = 0; i < index; i++) {
        if (dato.equalsIgnoreCase(datos[i][0])) {
            return i; // retorna el índice encontrado
        }
    }
    return -1; // si no se encontró
} 
}
