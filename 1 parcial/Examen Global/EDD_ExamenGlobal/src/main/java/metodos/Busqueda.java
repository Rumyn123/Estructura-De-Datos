/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

/**
 *
 * @author Rumyn
 */
public class Busqueda {
    public Busqueda(){
        ultimoTelefono = "";
    }
    
    private String ultimoTelefono;
    private String[] ultimoLibro;
    public int estatus = 0;
    
    public String buscaTelefono(String[][] directorio, String nombre, String apellido){
        int directorioSize = directorio.length; 
        boolean noEncontrado = true;
        for(int i=0; i < directorioSize && noEncontrado; i++){
            if(directorio[i][0].equals(apellido)){
                if(directorio[i][1].equals(nombre)){
                   ultimoTelefono = directorio[i][2]; 
                   noEncontrado = false;
                }
            } else if((!directorio[i][0].equals(apellido) || !directorio[i][1].equals(nombre)) 
                     && i == directorioSize) {
                Utilidades.msg("Atención", "No se encontró el registro de " + nombre + " " + apellido);
                estatus = 2;
            }
        }
        return ultimoTelefono;
    }
    
    public String getUltimoTelefono(){
        return ultimoTelefono;
    }

        //Libros - estructura
        //Columna 0 = ID 
        //Columna 1 = Titulo
        //Columna 2 = Editorial
        //Columna 3 = Autor
        //Columna 4 = Año
    public String[] buscaLibro(String[][] libreria, String id){
        int libreriaSize = libreria.length; 
        ultimoLibro = new String[5];
        boolean noEncontrado = true;
        for(int i=0; i < libreriaSize && noEncontrado; i++){
            if(libreria[i][0].equals(id)){
                   ultimoLibro[0] = libreria[i][0];
                   ultimoLibro[1] = libreria[i][1];
                   ultimoLibro[2] = libreria[i][2];
                   ultimoLibro[3] = libreria[i][3];
                   ultimoLibro[4] = libreria[i][4];
                   noEncontrado = false;
                }
            else if((i+1 == libreriaSize) && noEncontrado){
                Utilidades.msg("Atención", "No se encontró el libro con ID: " + id);
                estatus = 2;
                }
            }
        
        return ultimoLibro;
    }
    
    public String[] getUltimoLibro(){
        return ultimoLibro;
    }
    
}
