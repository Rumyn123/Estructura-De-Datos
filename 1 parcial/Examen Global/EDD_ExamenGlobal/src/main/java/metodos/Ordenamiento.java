/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

/**
 *
 * @author Rumyn
 */
public class Ordenamiento {
    public Ordenamiento(){
        
    }
    
    private int[] idOrdenado;
    
    
    
    public int[] ordenarId(String[][] libros){
        int totalElementos = libros.length;
        idOrdenado = new int[totalElementos];
        int aux;
        for(int a = 0; a < totalElementos; a++){
            idOrdenado[a] = Integer.valueOf(libros[a][0]);
        }
        
        
        for(int i = 0; i < totalElementos; i++){
            for(int j = 0; j < totalElementos-1; j++){
                if(idOrdenado[j]  > idOrdenado[j+1]){
                    aux = idOrdenado[j];
                    idOrdenado[j] = idOrdenado[j+1];
                    idOrdenado[j+1] = aux;
                }
            }
        }
        return idOrdenado;
    }
    
    
}
