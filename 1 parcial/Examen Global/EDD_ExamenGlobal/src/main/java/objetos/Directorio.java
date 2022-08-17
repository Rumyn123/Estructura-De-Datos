/*
 * 1. Se cuenta con la información del directorio telefónico almacenada en una matriz de 3 columnas, 
en la primera está el apellido, en la segunda el nombre y en la tercera el número telefónico. 
Se requiere un algoritmo para buscar el número de teléfono de una persona tomando como clave su apellido y nombre.
 */
package objetos;

/**
 *
 * @author Bryant Gamboa
 */
public class Directorio {
    
    //Constructor
    public Directorio(){
        
    }
    //Constructor
    
    //INICIA   - Variables Globales
    private String directorio [];
    private int numInicial;
    private int numFinal;
    //FINALIZA - Variables Globales
    
    
    public void crearNuevoDirectorio(int cantidadDePersonas){
        this.numFinal = cantidadDePersonas;
        this.directorio = new String[cantidadDePersonas];
    }
    
    public void agregarRegistro(){
        
    }
    
}
