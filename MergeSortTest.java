
/**
 * Prueba unitaria para InsertSort.
 * @author German García.
 * @author Luis Nájera.
 * @author Antonio Ixtecoc.
 * @author Esteban Avalos.
 * version 30.07.16 
 */
import org.junit.Test;
import static org.junit.Assert.*;


public class MergeSortTest {
    
    public MergeSortTest() {
    }
    
   
    @Test
    public void testMergeSort() {
        System.out.println("mergeSort");
        Integer[] arreglo = {5,8,4,3,6,7,1};
        Comparable[] tmpArray = new Comparable[ arreglo.length ];
        int left = 0;
        int right = arreglo.length - 1;
        MergeSort instance = new MergeSort();
        instance.mergeSort(arreglo, tmpArray, left, right);      
        String expResult = "1,3,4,5,6,7";
        String result= " ";
        int cont;
        for(cont=0;cont<arreglo.length-1;cont++){
            result=result+ " "+ String.valueOf(arreglo[cont]);
        }
        if (result==expResult){
            fail("The test case is a prototype.");
        }
        
    }
       
        
}
