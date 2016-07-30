import java.lang.reflect.Array;  

/**
 * Clase para crear un vector génerico que almacenará los datos del .txt tando desordenados como oredenados. 
 * @author German García.
 * @author Luis Nájera.
 * @author Antonio Ixtecoc.
 * @author Esteban Avalos.
 * version 30.07.16
 * @param <E> 
 */
public class Vector<E> {  
    final E[] a;

    public Vector(Class<E[]> clazz, int length) {  
        a = clazz.cast(Array.newInstance(clazz.getComponentType(), length));  
    }  
    
}
