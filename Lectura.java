
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lectura {
    //Dirección del archivo de texto.
    public static void main(String[] args) throws IOException {              
        LeerTexto("C:\\Users\\AntonioJose\\Desktop\\Prueba.txt");             
        
    }
    
    
    
    public static void LeerTexto(String direccion) throws FileNotFoundException, IOException{ 
        int cantidad_datos = 0;                                                 //Variable para saber la cantidad de numeros del .txt                                             
        int numero=0;                                                           //Variable para ingresar los datos al arreglo.
        
//***************Esta parte del codigo es para contar la cantidad de datos del .txt***********************//
        try{                                                    
            FileReader fr = new FileReader (direccion);
            BufferedReader br = new BufferedReader (fr);
            String cadena;
            
            while((cadena=br.readLine())!=null){  
                cantidad_datos = cantidad_datos+1;                              //Se hace un while para contar los datos del .txt
            }
            
        }catch (Exception ex){
        }   
//******************************************************************************//

//**************Se instancia el vector y se establece su longitud***************//
        
        Vector<Integer> datos = new Vector<>(Integer[].class, cantidad_datos);  //Se instancia el vector, y se establece su longitud en base a la cantidad de datos.
        Integer[] arreglo = datos.a;                                            //Se crea una variable para el ingreso de datos.
        
//******************************************************************************//

//***********Esta parte del codigo es para ingresar los datos del .txt al vector***********//
        try{                                                    
            FileReader fr = new FileReader (direccion);
            BufferedReader br = new BufferedReader (fr);
            String cadena;
            
            while((cadena=br.readLine())!=null){
                datos.a[numero] = Integer.parseInt(cadena);                     //Ingresa los numeros al arreglo.
                numero = numero+1;                                              //Contador para ingresar cada dato en un espacio dsitinto del arreglo.
            }
            
        }catch (IOException | NumberFormatException ex){
        }  
        
//******************************************************************************//

//******************************************************************************//
        BubbleSort Ordenamiento = new BubbleSort();                         //Instancia la clase Quicksort.
        Ordenamiento.bubblesort(arreglo);                                        //Se envia el arreglo como parametro.
        
       String lista= "{";
       int cont;
       for(cont=0;cont<arreglo.length-1;cont++){
           lista= lista +" "+ String.valueOf(arreglo[cont]);
       }
       System.out.print(lista);
        
    }
}
