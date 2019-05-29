/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author nicob
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ventana window= new Ventana();
        
        window.setTitle("Management of sale ®");//titulo
        window.setLocationRelativeTo(null);//centra ventana
        window.setVisible(true);//que se muestra la ventana
        
    }
    
}
