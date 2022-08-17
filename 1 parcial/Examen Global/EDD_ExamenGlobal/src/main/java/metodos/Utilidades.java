/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

import javax.swing.JOptionPane;


/**
 *
 * @author Rumyn
 */
public class Utilidades {
    public static void msg(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public static void msg(String titulo,String mensaje){
        JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
    }

}
