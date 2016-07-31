/**
 * Clase que realiza el algoritmo Insertion Sort
 * @author German García.
 * @author Luis Nájera.
 * @author Antonio Ixtecoc.
 * @author Esteban Avalos.
 * version 30.07.16 
 */


public class InsertSort {
    
    public Integer [] ordenar(Comparable[] arreglo){
        
        /* Variables a utilizar en el programa, stateOne y stateTwo son los datos del arreglo a verificar */
        
        int stateOne;
        int stateTwo;
        Comparable newState; /* Se usa esta variable del tipo Comparable para realizar las comparaciones */
        
        
        
        /* Se realiza el for mienttras stateOne sea menor que el ancho del arreglo menos uno, y se suma 1 a la variable stateOne */
        /* se declara la variable newState la cual sera igual al valor del arreglo segun el valor de stateOne */
        /* en el while se compara el valor que posea newState y el valor anterior al mismo, con lo cual compara cual es el menor y lo coloca de primero en el arreglo */
        /* con lo cual se ordena el arreglo hasta llegar al ancho del mismo, y luego se retorna arreglo */
        for (stateOne=0;stateOne<arreglo.length-1;stateOne++){
            newState = arreglo[stateOne];
            stateTwo=stateOne;
            while (stateTwo> 0 && (arreglo[stateTwo-1].compareTo(newState)>0)){
                arreglo[stateTwo]=arreglo[stateTwo-1];
                stateTwo --;
            }
            arreglo[stateTwo]= newState;
        }
        
        return (Integer[]) arreglo;
    }
    
}

/* Se utilizo como referencia el codigo de la siguiente pagina: https://www.daniweb.com/programming/software-development/threads/347069/insertion-sort-method-using-comparable-array */