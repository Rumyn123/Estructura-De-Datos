/*
1. La biblioteca Lecturas Interesantes desea administrar sus materiales mediante 
un programa de computador y ha solicitado que se le diseñe un algoritmo para este propósito. 
Se desea almacenar los datos de los libros, como son: materia, titulo, editorial, autor y año. 
Se desea ingresar todos los libros y poder adicionar las nuevas adquisiciones en 
la medida en que se hacen; hacer consultas con base en autor, título o ISBN, de 
igual manera generar listados ordenados por autor o por título.
 */
package objetos;

import metodos.Busqueda;
import metodos.Ordenamiento;
import metodos.Utilidades;

/**
 *
 * @author Rumyn
 */
public class Libros {
    //Constructor
    public Libros(){
        
    }
    //Constructor
    
    //Variables Globales
    private String[][] libro;
    private int numInicial;
    private int numFinal;
    //Variables Globales
    
    public void crearNuevaLibreria(int cantidadDePersonas){
        this.numFinal = cantidadDePersonas;
        this.libro = new String[cantidadDePersonas][5];
        //Columna 0 = ID 
        //Columna 1 = Titulo
        //Columna 2 = Editorial
        //Columna 3 = Autor
        //Columna 4 = Año
        
        Utilidades.msg("Directorio con exito");
    }
    
    public void agregarRegistro(String id, String titulo, String editorial, String autor, String anio){
        
        if(numInicial < numFinal){
            this.libro[numInicial][0] = id;
            this.libro[numInicial][1] = titulo;
            this.libro[numInicial][2] = editorial;
            this.libro[numInicial][3] = autor;
            this.libro[numInicial][4] = anio;
            numInicial ++;
            Utilidades.msg("Registro añadido con exito");
        }
        else {
            Utilidades.msg("No puedes agregar mas registros", "Actualmente haz alcanzado el limite de registros permitidos");
        }
        
    }
    
    public String[][] getLibreria(){
        if(numFinal > 0) {
            return this.libro;
        } else {
            Utilidades.msg("Error", "Crea un directorio primero antes de solicitarlo, se retornará una libreria vacia");
            String[][] vacio = new String[0][0];
            return vacio;
        } 
    }
    
    public void listarOrdenados(String[][] libros){
        Ordenamiento ordena = new Ordenamiento();
        Busqueda busca = new Busqueda();
        int[] listaOrdenados = ordena.ordenarId(libros);
        for(int i = 0; i < listaOrdenados.length; i++){
            muestraLibro(busca.buscaLibro(libros, String.valueOf(listaOrdenados[i])) );
        }
        Utilidades.msg("Concluyó la lista");
    }
    
    public void muestraLibro(String[] book){
        Utilidades.msg("Datos de libro: ", 
                                       "ID: "        +  book[0] + "\n"
                                     + "Titulo: "    +  book[1] + "\n"
                                     + "Editorial: " +  book[2] + "\n"
                                     + "Autor: "     +  book[3] + "\n"
                                     + "Anio: "      +  book[4] );
    }
    
}
