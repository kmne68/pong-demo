/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pongdemo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 *
 * @author kemery
 */
public class Game extends JComponent {

    @Override
    protected void paintComponent(Graphics g) {
        
        Graphics2D g2 = (Graphics2D) g;
        
        g2.setColor(Color.BLACK);
        
        g2.fillRect(0, 0, getWidth(), getHeight());
    }
    
    
}
