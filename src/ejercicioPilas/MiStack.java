/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioPilas;

/**
 * Programa que me permite trabajar con los datoss en formato LIFO
 * Es una pila estatica para manipular datos
 * @author Hector Alejandro Hernadez 31/10/2025
 */
public class MiStack {
 
    private final int MAXIMO;
    private final String[] STACK;
    public int tope;
    
    /**
     * metodo que me permita ver el contenido de la pila 
     * @return regresa un arreglo con los datos 
     */
    public String[] viewStack(){
        int topeVirtual=tope+1;
        String [] values = new String[topeVirtual];
        int index=0;
        for(int i=tope; i>=0; i--){
            values[index]= STACK[i];
            index++;
        }
        return values;
    }
    
    /**
     * metodo que permite mostrar los elementos que tine la pila en el tope 
     * @return regresa el valor si no existe regresa vacio
     */
    public String peek(){
        String value ="";
        if (tope>=0){
            value=STACK[tope];
            
        }
        return value;
    }
    
    /**
     * Metodo que permite sacar el valor que tenemos en el tope de la pila
     * @return regresa el valor que tenemos en el final de la fila
     * si el valor no existe regresa vacia
     */
    public String pop(){
        String value= "";
        if (tope>=0){
            value=STACK[tope];
            tope--;
            
        }
        return value;
    }
    
    /**
     * Metodo que permite agregar elementos a la pila
     * @param value es el elemento que se agrega
     * @return un verdadero si se logro insertar
     */
    
    
    public boolean push(String value){
        boolean isSuccess;
        if (tope<MAXIMO-1){
            tope ++;
            STACK[tope]= value;
            isSuccess=true;
        }
        else {
            isSuccess= false;
        }
        return isSuccess;
    }
    
    
     
    
    public MiStack(int max){
        MAXIMO = max;
        STACK = new String[MAXIMO];
        tope=-1;
    }
    
    
}
