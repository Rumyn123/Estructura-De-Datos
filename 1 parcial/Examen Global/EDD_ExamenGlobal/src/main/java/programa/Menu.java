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
        boolean terminar = false;
        int opc;
         
        do{
            opc = Integer.parseInt(Utilidades.leer("Elige que programa iniciar: \n"
                                                 + "1- Directorio telefonico \n"
                                                 + "2- Administrador de Biblioteca\n"
                                                 + "3- Salir ")) ;
            
            switch(opc){
                
                case 1:
                    Utilidades.msg("Elegiste el directorio telefonico");
                    Finder_DirectorioTelefonico finder = new Finder_DirectorioTelefonico();
                    finder.iniciarFinderDirectorio();
                    terminar = false;
                    break;
                    
                case 2:
                    Utilidades.msg("Elegiste el Administrador de Bibliotecas");
                    Sorter_LecturasInteresantes sorter = new Sorter_LecturasInteresantes();
                    sorter.iniciarSorterLecturas();
                    terminar = false;
                    break;
                case 3:
                    Utilidades.msg("Ten un lindo dia :D");
                    terminar = true;
                    break;
                default:
                    Utilidades.msg("Escriba una opcion correcta del 1 al 3");

            }
        }while (terminar);
    }     
}




