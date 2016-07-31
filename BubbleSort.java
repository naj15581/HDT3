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
     boolean esmayor = true;   // set flag to true to begin first pass
     int numerotemp;   //holding variable

     while ( esmayor )
     {
            esmayor= false;    //set flag to false awaiting a possible swap
            for( i=0;  i < arreglo.length -1;  i++ )
            {
                   if (arreglo[ i ].compareTo(arreglo[i+1])> 0)   // change to > for ascending sort
                   {
                       numerotemp = (int) arreglo[ i ];                //swap elements
                       arreglo[ i] = arreglo[ i+1 ];
                       arreglo[ i+1 ] = numerotemp;
                       esmayor= true;              //shows a swap occurred
                   } 
            } 
      } 
     
     return (Integer[]) arreglo;
}   
        
                

   
}
