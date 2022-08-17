/*
 * 1. Se cuenta con la información del directorio telefónico almacenada en una matriz de 3 columnas, 
en la primera está el apellido, en la segunda el nombre y en la tercera el número telefónico. 
Se requiere un algoritmo para buscar el número de teléfono de una persona tomando como clave su apellido y nombre.
 */
package programa.Busqueda;

import metodos.Busqueda;
import metodos.Utilidades;
import objetos.Directorio;

/**
 *
 * @author Rumyn
 */
public class Finder_DirectorioTelefonico {
    
    public Finder_DirectorioTelefonico(){
        
    }
    

    public void iniciarFinderDirectorio(){
        boolean repetir = true;
        int opcion;
        Directorio dir = new Directorio();
        Busqueda buscador = new Busqueda();
        do{
            opcion = imprimirMenu();
            switch(opcion){
                case 1:
                    try{
                        int numeroPersonas = Integer.parseInt(Utilidades.leer("Ingrese el numero de personas máximo para este directorio"));
                        dir.crearNuevoDirectorio(numeroPersonas);
                    } catch(Exception e){
                        Utilidades.msg("Error", "Introduce un numero entero valido");
                    }
                break;
                
                case 2:
                    String apellido = Utilidades.leer("Ingrese el primer apellido");
                    String nombre = Utilidades.leer("Ingrese el nombre");
                    String numeroTelefonico = Utilidades.leer("Ingrese el celular");
                    
                    dir.agregarRegistro(apellido, nombre, numeroTelefonico);
                break;
                
                case 3:
                    String numeroCelular;
                    String apellido1 = Utilidades.leer("Ingrese el primer apellido");
                    String nombre1 = Utilidades.leer("Ingrese el nombre");
                    numeroCelular = buscador.buscaTelefono(dir.getDirectorio(), nombre1, apellido1);
                    if(buscador.estatus == 2){
                        Utilidades.msg("No se encontró un registro de " + apellido1 + " " + nombre1);
                    } else if(buscador.estatus == 0){
                        Utilidades.msg("Registro encontrado", "El numero de " + nombre1 + " " + apellido1 + " es: " + numeroCelular);
                    }
                break;
                
                case 4:
                    Utilidades.msg("Saliendo del Buscador de Directorio Telefonico");
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
            return Integer.parseInt(Utilidades.leer("1- Crear nuevo directorio \n"
                                              + "2- Agregar nuevo registro \n"
                                              + "3- Buscar numero telefono \n"
                                              + "4- Salir")) ;
    
        } catch(Exception e){
            
            return 99;
        }
    }

}
