/**
 * Prueba unitaria para QuickSort
 * @author German García.
 * @author Luis Nájera.
 * @author Antonio Ixtecoc.
 * @author Esteban Avalos.
 * version 30.07.16 
 */

import org.junit.Test;
import static org.junit.Assert.*;

public class QuicksortTest {
    
    public QuicksortTest() {
    }
   
    
    @Test
    public void testQuickSort() {
        Quicksort instance = new Quicksort();
        Integer[] arreglo = {5,8,4,3,6,7,1};
        int izq = 0;
        int der = arreglo.length-1;
        int contQuickSort;
        instance.quickSort(arreglo,izq,der);
        String result= " ";
        String expResult = "1,3,4,5,6";
        for(contQuickSort=0;contQuickSort<arreglo.length-1;contQuickSort++){
            result=result+ " "+ String.valueOf(arreglo[contQuickSort]);
        }
        if (expResult == null ? result == null : expResult.equals(result)){
            fail("The test case is a prototype.");
        }
    }
    
}
