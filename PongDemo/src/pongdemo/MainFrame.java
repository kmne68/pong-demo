/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pongdemo;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author kemery
 */
public class MainFrame extends JFrame implements ActionListener {
    
    private Timer timer;    // could go in game class as that is where drawing takes place
    long startTime;
    long relativeTime;
    private Game game;
    private StartPanel startPanel;
    private CardLayout cards;
    
    
    MainFrame() {
        
        super("Animation Demo");
        
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MotifLookAndFeel");
        } catch (Exception ex) {
            System.out.println("Cannot set look and feel.");
        }
        
        cards = new CardLayout();
        startPanel = new StartPanel();
        game = new Game();
        
        startPanel.setListener(new StartPanelListener() {
            
            public void startGame() {
                cards.show(MainFrame.this.getContentPane(), "game");
            }            
        });
        
        timer = new Timer(20, this);
        timer.setInitialDelay(100);
        
        setSize(600, 500);
        setLayout(cards);
        
        add(startPanel, "start");
        add(game, "game");  
        
        timer.start();
        
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        game.update();
    }
    
}
