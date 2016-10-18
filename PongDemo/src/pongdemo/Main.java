/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pongdemo;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.Timer;

/**
 *
 * @author kemery
 */
public class Main extends JApplet implements ActionListener {
    
  /*  public static void main(String[] args) {
        
        System.out.println("Hello pong!");
    } */
    
    private Timer timer;
    long startTime;
    long relativeTime;
    

    @Override
    public void destroy() {
        System.out.println("destroy");
    }
    

    @Override
    public void stop() {
        System.out.println("stop");
        
        timer.stop();
    }
    

    @Override
    public void start() {
        System.out.println("start");
        
        timer.start(); // starts when applet becomes visible
    }
    

    @Override
    public void init() {
        
        timer = new Timer(1000, this);
        timer.setInitialDelay(100);
        
        setSize(600, 500);
        setLayout(new BorderLayout());
        
        add(new Game(), BorderLayout.CENTER);
        
        System.out.println("init");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        System.out.println("timer running");
    }
    
    
}
