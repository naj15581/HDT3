
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


public class InsertSortTest {
    
    public InsertSortTest() {
    }
    
    
    @Test
    public void testOrdenar() {
        Integer[] arreglo = {5,8,4,3,6,7,1};
        InsertSort instance = new InsertSort();
        instance.ordenar(arreglo);
        String expResult = "1,3,4,5,6,7";
        String result= " ";
        int contInsertS;
        for(contInsertS=0;contInsertS<arreglo.length-1;contInsertS++){
            result=result+ " "+ String.valueOf(arreglo[contInsertS]);
        }
        if (result == null ? expResult == null : result.equals(expResult)){
            fail("The test case is a prototype.");
        }
        
    }
    
}
