/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pongdemo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JComponent;

/**
 *
 * @author kemery
 */
public class Game extends JComponent {
    
    private Ellipse2D.Double ball = new Ellipse2D.Double(100, 100, 15, 15);
    private double speed = 10.0;
    private int xDirectionBall = 1;
    private int yDirectionBall = 1;

    @Override
    protected void paintComponent(Graphics g) {
        
        Graphics2D g2 = (Graphics2D) g;
        
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        g2.setColor(Color.BLACK);
        // fill background
        g2.fillRect(0, 0, getWidth(), getHeight());
        
        g2.setColor(Color.RED);
        g2.fill(ball);
        
        g2.setColor(Color.BLUE);
        g2.fill(new RoundRectangle2D.Double(200, 200, 100, 10, 20, 20));
        
    }   
    
    public void update() {
        
        ball.x += xDirectionBall * speed;
        ball.y += yDirectionBall * speed;
        
        if(ball.x < 0) {
            xDirectionBall = 1;
            ball.x = 0;
        }
        else if(ball.x + ball.getBounds().width > getWidth()) {
            xDirectionBall = -1;
            ball.x = getWidth() - ball.getBounds().width;
        }
        
        if(ball.y < 0) {
            yDirectionBall = 1;
            ball.y = 0;
        }
        else if(ball.y + ball.getBounds().height > getHeight()) {
            yDirectionBall = -1;
            ball.y = getHeight() - ball.getBounds().height;
        }
        
        repaint(); // saves time vs calling paintComponent
    }
}
