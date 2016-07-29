/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AntonioJose
 */
import java.lang.reflect.Array;
   
public class Vector<E> {  
    final E[] a;

    public Vector(Class<E[]> clazz, int length) {  
        a = clazz.cast(Array.newInstance(clazz.getComponentType(), length));  
    }  
    
    
}
