/**
 * Clase que realiza el algoritmo Buble Sort
 * @author German García.
 * @author Luis Nájera.
 * @author Antonio Ixtecoc.
 * @author Esteban Avalos.
 * version 30.07.16 
 */


public class BubbleSort {
    
    public Integer[] bubblesort (Comparable[] arreglo){
       
     int i;
     boolean esmayor = true;   /*Variable que verifica cuando un cambio se realiza*/
     int numerotemp;   /*numero utilizado para hacer el cambio, o swapp*/
    /*Ciclo que ordena los numeros de la Lista*/
     while ( esmayor )
     {
            esmayor= false;    /*Valor inicial de falso para poder indicar los cambios*/
            for( i=0;  i < arreglo.length -1;  i++ )
            {
                   if (arreglo[ i ].compareTo(arreglo[i+1])> 0)   /*Condicion para que los elementos vayan de menor a mayor*/
                   {
                       numerotemp = (int) arreglo[ i ];                /*Intercambio de elementos si uno es menor a otro*/
                       arreglo[ i] = arreglo[ i+1 ];
                       arreglo[ i+1 ] = numerotemp;
                       esmayor= true;              /*Cambia el valor para poder hacer el siguiente cambio de numero*/
                   } 
            } 
      } 
     /*Retorno del arreglo ya ordenado*/
     return (Integer[]) arreglo;
}   
        
                

   
}
