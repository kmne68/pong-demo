/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pongdemo;

import java.awt.BorderLayout;
import javax.swing.JApplet;

/**
 *
 * @author kemery
 */
public class Main extends JApplet {

    @Override
    public void destroy() {
        System.out.println("destroy");
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }

    @Override
    public void start() {
        System.out.println("start");
    }

    @Override
    public void init() {
        
        setLayout(new BorderLayout());
        
        add(new Game(), BorderLayout.CENTER);
        
        System.out.println("init");
    }
    
    
}
