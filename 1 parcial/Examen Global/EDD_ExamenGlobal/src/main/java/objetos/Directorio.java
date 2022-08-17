/*
 * 1. Se cuenta con la información del directorio telefónico almacenada en una matriz de 3 columnas, 
en la primera está el apellido, en la segunda el nombre y en la tercera el número telefónico. 
Se requiere un algoritmo para buscar el número de teléfono de una persona tomando como clave su apellido y nombre.
 */
package objetos;

import metodos.Utilidades;

/**
 *
 * @author Bryant Gamboa
 */
public class Directorio {
    
    //Constructor
    public Directorio(){
        this.numInicial = 0;
        this.numFinal   = 0;
    }
    //Constructor
    
    //INICIA   - Variables Globales
    private String[][] directorio;
    private int numInicial;
    private int numFinal;
    //FINALIZA - Variables Globales
    
    
    public void crearNuevoDirectorio(int cantidadDePersonas){
        this.numFinal = cantidadDePersonas;
        this.directorio = new String[cantidadDePersonas][3];
        //Columna 0 = Apellido 
        //Columna 1 = Nombre
        //Columna 2 = Numero Telefónico
    }
    
    public void agregarRegistro(String apellido, String nombre, String numeroTelefonico){
        if(numInicial < numFinal){
            this.directorio[numInicial][0] = apellido;
            this.directorio[numInicial][1] = nombre;
            this.directorio[numInicial][2] = numeroTelefonico;
            numInicial ++;
        }
        else {
            Utilidades.msg("No puedes agregar mas registros", "Actualmente haz alcanzado el limite de registros permitidos");
        }
        
    }
    
    public String[][] getDirectorio(){
        if(numFinal > 0) {
            return this.directorio;
        } else {
            Utilidades.msg("Error", "Crea un directorio primero antes de solicitarlo, se retornará un directorio vacio");
            String[][] vacio = new String[0][0];
            return vacio;
        } 
    }
    
}
