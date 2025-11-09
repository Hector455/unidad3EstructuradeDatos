/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploColas;

/**
 * queque (interfas) -> PriorityQueue
 * Clase que simula las operaciones con una fila 
 * @author LENOVO
 */
public class MiFila {
    
   private final int MAXIMO;
   private final  String[] fila;
   public int fin;
   
   /**
    * metodo que conbierte la fila a un arreglo
    * @return el arreglo y sus valores 
    */
   
   public String[] aArreglo(){
       String arreglo[]= new String[fin];
       for (int i=0; i<fin;i++){
           arreglo[i]=fila[i];
       }
       return arreglo;
   }
   
   /**
    * metodo que permite ver el primer valor que tengo en la fila
    * @return el valor
    */
   public String peek (){
       String value ="";
       if (fin>0){
           value = fila[0];
       }
       return value;
   }
   
   /**
    * Metodo que que saca el primer valor agregado y lo elimina 
    * @return el valor que se encontro, en blanco si no hay
    */
   public String poll(){
    String value = "";
    if (fin > 0){
        value = fila[0]; // el primero en entrar
        for(int i = 1; i < fin; i++){
            fila[i - 1] = fila[i]; // recorre los demás hacia adelante
        }
        fin--; // reduce el tamaño de la cola
    }
    return value;
}
  
   /**
    * Metodo que permite agregar valores a la fila 
    * @param value valor agregar
    * @return verdadero Si se pudo agregar
    */
   public boolean offer(String value){
       boolean isSuccess;
       if (fin<MAXIMO){
       fila[fin]= value;
       fin ++;
       isSuccess=true;
   } else {
           isSuccess=false;
       }
       return isSuccess;
       
   }
   
   public MiFila(int max){
       MAXIMO = max;
       fila = new String[MAXIMO];
       fin=0;
   }
   public MiFila(){
       
       this(10);
   }
}
