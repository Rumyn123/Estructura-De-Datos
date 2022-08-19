/*
1. La biblioteca Lecturas Interesantes desea administrar sus materiales mediante 
un programa de computador y ha solicitado que se le diseñe un algoritmo para este propósito. 
Se desea almacenar los datos de los libros, como son: materia, titulo, editorial, autor y año. 
Se desea ingresar todos los libros y poder adicionar las nuevas adquisiciones en 
la medida en que se hacen; hacer consultas con base en autor, título o ISBN, de 
igual manera generar listados ordenados por autor o por título.
 */
package programa.Ordenamiento;

import metodos.Busqueda;
import metodos.Utilidades;
import objetos.Libros;

/**
 *
 * @author Rumyn
 */
public class Sorter_LecturasInteresantes {
    
    public Sorter_LecturasInteresantes(){
        
    }
    public void iniciarSorterLecturas(){
        boolean repetir = true;
        int opcion;
        Libros libro = new Libros();
        Busqueda buscador = new Busqueda();
        do{
            opcion = imprimirMenu();
            switch(opcion){
                case 1:
                    try{
                        int numeroPersonas = Integer.parseInt(Utilidades.leer("Ingrese el numero de libros máximos para esta libreria"));
                        libro.crearNuevaLibreria(numeroPersonas);
                    } catch(Exception e){
                        Utilidades.msg("Error", "Introduce un numero entero valido");
                    }
                break;
                
                case 2:
                        //Columna 0 = ID 
                        //Columna 1 = Titulo
                        //Columna 2 = Editorial
                        //Columna 3 = Autor
                        //Columna 4 = Año
                    String id = Utilidades.leer("Ingrese el id");
                    String titulo = Utilidades.leer("Ingrese el titulo");
                    String editorial = Utilidades.leer("Ingrese la editorial");
                    String autor = Utilidades.leer("Ingrese el autor");
                    String anio = Utilidades.leer("Ingrese el anio");
                    
                    libro.agregarRegistro(id, titulo, editorial, autor, anio);
                break;
                
                case 3:
                    String[] libroEncontrado;
                    String id1 = Utilidades.leer("Ingrese el ID");
                    libroEncontrado = buscador.buscaLibro(libro.getLibreria(), id1);
                    if(buscador.estatus == 2){
                        Utilidades.msg("No se encontró el libro con ID: " + id1);
                    } else if(buscador.estatus == 0){
                        libro.muestraLibro(libroEncontrado);
                    }
                break;
                
                case 4:
                    libro.listarOrdenados(libro.getLibreria());
                    break;
                
                case 5:
                    Utilidades.msg("Saliendo del Buscador de Libros");
                    repetir = false;
                break;
                
                case 99:
                    Utilidades.msg("Error", "Introduce una opcion valida del 1 al 4");
                break;
                
                default:
                break;
            }
            
            
        } while(repetir);
        
    }
    
    private int imprimirMenu(){
        try{
            return Integer.parseInt(Utilidades.leer("1- Crear nueva Libreria \n"
                                              + "2- Añadir un Libro \n"
                                              + "3- Buscar un Libro \n"
                                              + "4- Listar Libros   \n"
                                              + "5- Salir")) ;
    
        } catch(Exception e){
            
            return 99;
        }
    }
    
}
