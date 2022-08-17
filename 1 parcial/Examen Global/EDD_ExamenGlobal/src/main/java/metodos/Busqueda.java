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
    
    public String buscaTelefono(String[][] directorio, String nombre, String apellido){
        int directorioSize = directorio.length; 
        boolean noEncontrado = true;
        for(int i=0; i <= directorioSize && noEncontrado; i++){
            if(directorio[i][0] == apellido){
                if(directorio[i][1] == nombre){
                   ultimoTelefono = directorio[i][2]; 
                   noEncontrado = false;
                }
            } else if((directorio[i][0] != apellido || directorio[i][1] != nombre) 
                     && i == directorioSize) {
                Utilidades.msg("Atención", "No se encontró el registro de " + nombre + " " + apellido);
            }
        }
        return ultimoTelefono;
    }
    
    public String getUltimoTelefono(){
        return ultimoTelefono;
    }
}
