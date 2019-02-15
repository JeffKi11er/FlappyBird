package com.company.mainGame;

import com.company.Game.Check;
import com.company.Game.FlappyCat;
import com.company.Game.Pipe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FlappyPanel extends JPanel implements ActionListener, Runnable {
    Check check = new Check();
    FlappyCat flappyCat = new FlappyCat();
    Pipe pipe = new Pipe();
    // public static boolean IS_RUNNING = true;
    // private GameManager gameManager = new GameManager();
    // private Container container;
    //  private StateAttack stateAttack;

    //  private boolean flag [] = new boolean[256];
    //  private JButton bmenu;
    Thread thread;
    public FlappyPanel() {//Container container) {
        //      this.container = container;
        thread = new Thread(this);
        thread.start();
//        setFocusable(true);
//        addKeyListener(this);
//        add(flappyCat);
        add(pipe);
//        initCompts();
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(Color.cyan);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.GREEN);
        g.fillRect(0, 400, getWidth(), getHeight());
        g.setColor(Color.orange);
        g.fillRect(0, 410, getWidth(), getHeight());
        flappyCat.draw(g);
        pipe.paint(g);
    }

    private void initCompts() {
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void run() {
        while (true) {
            repaint();
            pipe.move();
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                Logger.getLogger(FlappyPanel.class.getName()).log(Level.SEVERE, null, e);
            }
            pipe.loop();
            flappyCat.up();
            if (check.isDead() == true) {
                thread.stop();
            }
        }
    }
}
