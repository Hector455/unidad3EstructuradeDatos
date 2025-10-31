
package ejercicioPilas;

import java.util.Arrays;

/**
 * clase que me permite verificar mis operaciones con la pila
 * @author LENOVO
 */
public class SimulacionPila {
    public static void main(String[] args) {
        MiStack miPila = new MiStack(4);
        miPila.push("uno");
        miPila.push("dos");
        miPila.push("tres");
        System.out.println("valor que esta en el tope "+miPila.peek());
        miPila.pop();
        miPila.pop();
        System.out.println("Todos los valores "+ Arrays.toString(miPila.viewStack()));
        
    }
    
    
}
