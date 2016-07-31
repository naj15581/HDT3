/*
	Autores:
	Luis Najera
	Antonio Ixtecoc
	German 	Garcias
	Esteban Avalos

    Esta clase es el metodo de ordenamiento de mergesort, esta forma de ordenemiento funciona creando sublistas de la orginal
    , cada una las va ordenando y derivando nuevas sub-listas, las cuales tambien se ordena.
*/
import java.util.Arrays;


public class mergeSort{
    
  
 /*
    Se recibe el array enviado desde el modulo de lectura
    
    */
  Integer[] mergeSort( Comparable [ ] a, Comparable [ ] tmpArray, int left, int right ) {
      /*
        Se busca el centro del vector para crear sub vectores y con ello irlos ordenando
      */
      if( left < right ) {
          int center = ( left + right ) / 2;
          mergeSort( a, tmpArray, left, center );
          mergeSort( a, tmpArray, center + 1, right );
          merge( a, tmpArray, left, center + 1, right );
      }
      // se retorna un vector ya ordenado 
      return (Integer[]) a;
      
  }
   
  /**
   * IMetodo que trabaja con las sub listas y las ordena
   * 
   * recibe la lista de comparable, la lista, el index mas izquierdo de la sub lista,
   * index derecho de la sublista, y el final del arreglo
   */
  private static void merge( Comparable [ ] a, Comparable [ ] tmpArray,
      int leftPos, int rightPos, int rightEnd ) {
      String imp="";
      int leftEnd = rightPos - 1;
      int tmpPos = leftPos;
      int numElements = rightEnd - leftPos + 1;
       
      /*
      * se realizan las operaciones con las sub listas creadas en el inicio del modulo y se ordenan
      */
      while( leftPos <= leftEnd && rightPos <= rightEnd )
          if( a[ leftPos ].compareTo( a[ rightPos ] ) <= 0 )
              tmpArray[ tmpPos++ ] = a[ leftPos++ ];
          else
              tmpArray[ tmpPos++ ] = a[ rightPos++ ];
       
      while( leftPos <= leftEnd )    // Copy rest of first half
          tmpArray[ tmpPos++ ] = a[ leftPos++ ];
       
      while( rightPos <= rightEnd ) 
          tmpArray[ tmpPos++ ] = a[ rightPos++ ];
       
      // retornara ya el vector completamente ordenado
      for( int i = 0; i < numElements; i++, rightEnd-- )
          a[ rightEnd ] = tmpArray[ rightEnd ];
      
      
  }
  
}
/* Se utilizo como referencia codigo obtenido  de  la siguiente pagina:http://www.java-tips.org/java-se-tips-100019/24-java-lang/1895-merge-sort-implementation-in-java.html
*/