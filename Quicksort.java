/**
 * Clase que implementa el método de ordenación QUICKSORT.
 * @author Luis Nájera
 * @version 30.07.16
 */
public class Quicksort {

	public Integer[] quickSort (Comparable arreglo[], int izq, int der){
		
                //Verifica que el vector tenga datos.
		if (izq>=der){  
                    return (Integer[]) arreglo;
		}
	
		int indiceDelPivote=getIndicedelPivote(izq, der);               //Recibe los datos del centro del arreglo no ordenados para elegir un pivote.
		Comparable pivote=arreglo[indiceDelPivote];                     //Elige el pivote.
                
		cambioDePosicion(arreglo, indiceDelPivote, der); 	
 
		
		int i=izq-1;
		int j=der;
		
		do{
			
			do {
                            i++;
                        } while (arreglo[i].compareTo(pivote)<0);               //Se comparan los numeros de la izq. para saber si son mayores o menores a los del pivote.
			do 
                        {j--;
                        } while (arreglo[j].compareTo(pivote)>0 &&(j>izq));     //Se comparan los numeros de la der. para saber si son mayores o menores a los del pivote.
			
			if (i<j){
				cambioDePosicion(arreglo, i, j);                //Si se cumple alguna de las condicionales se realiza un cambio en el lugar de los numeros.
			}
		} while (i<j);
		cambioDePosicion(arreglo, der, i);                              //Si se cumple alguna de las condicionales se realiza un cambio en el lugar de los numeros.
		
                
                
		quickSort(arreglo, izq, i-1); //Se reduce el puntero derecho en -1.
		quickSort(arreglo, i+1, der); //Se aumenta el pivore izquierdo en +1.
                return (Integer[]) arreglo;
	}
	
	
	/**
         * Metodo que cambia los valores del arreglo de posición.
         */
	private static void cambioDePosicion(Comparable[] comparableArray, int primerDato, int segundoDato) {
		final Comparable datoTemporal=comparableArray[primerDato];
		comparableArray[primerDato]=comparableArray[segundoDato];
		comparableArray[segundoDato]=datoTemporal;
	}

        /**
         * Método que devuelve los posibles valores a elegir del pivote. 
         */
	private static int getIndicedelPivote(int izq, int der) {
		return izq+((der-izq)/2);
	}  
      
        
        
}