/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programa;

import metodos.Utilidades;
import programa.Busqueda.Finder_DirectorioTelefonico;
import programa.Ordenamiento.Sorter_LecturasInteresantes;

/**
 *
 * @author Rumyn
 */
public class Menu {
    
    
    public Menu(){
       iniciarMenu(); 
        
    }
    
    // Libreria, nomina Buena empresa, 
    
    
    public void iniciarMenu(){
        boolean correcto;
        String opc;
         
        do{
            opc = Utilidades.leer("Elige que programa iniciar: \nDirectorio telefonico \nAdministrador de Biblioteca ");
            
            switch(opc){
                
                case "Directorio telefonico":
                    Utilidades.msg("Elegiste el directorio telefonico");
                    Finder_DirectorioTelefonico finder = new Finder_DirectorioTelefonico();
                    correcto = false;
                    break;
                    
                case "Administrador de Biblioteca":
                    Utilidades.msg("Elegiste el Administrador de Bibliotecas");
                    Sorter_LecturasInteresantes sorter = new Sorter_LecturasInteresantes();
                    correcto = false;
                    break;
                
                default:
                    Utilidades.msg("Escriba correctamente el nombre");
                    correcto = true;

            }
        }while (correcto);
    }     
}




