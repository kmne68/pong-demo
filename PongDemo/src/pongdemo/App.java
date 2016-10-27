/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pongdemo;

import javax.swing.SwingUtilities;

/**
 *
 * @author kemery
 */
public class App {
    
    public static void main(String[] args) {
        
        //SwingUtilities.invokeLater(()->{ new MainFrame(); });
        // Traditional method
        SwingUtilities.invokeLater(new Runnable() {
            
            public void run() {
                new MainFrame();
            }
               
        
        });
        
         
    }
    
}
