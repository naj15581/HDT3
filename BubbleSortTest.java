
/**
 * Prueba unitaria para BubbleSort.
 * @author German García.
 * @author Luis Nájera.
 * @author Antonio Ixtecoc.
 * @author Esteban Avalos.
 * version 30.07.16 
 */
import org.junit.Test;
import static org.junit.Assert.*;


public class BubbleSortTest {
    
    public BubbleSortTest() {
    }
    
   
    @Test
    public void testBubblesort() {
        Integer[] arreglo = {5,8,4,3,6,7,1};
        BubbleSort instance = new BubbleSort();
        instance.bubblesort(arreglo);
        String result= " ";
        int contBubbleS;
        String expResult = "1,3,4,5,6,7,8";
        for(contBubbleS=0;contBubbleS<arreglo.length-1;contBubbleS++){
            result=result+ " "+ String.valueOf(arreglo[contBubbleS]);
        }
        if (expResult == null ? result == null : expResult.equals(result)){
            fail("The test case is a prototype.");
        }
        
    }
    
    
}
