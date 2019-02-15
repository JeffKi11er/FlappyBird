package com.company.mainGame;

import com.company.Game.FlappyCat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FlappyFrame extends JFrame implements WindowListener, KeyListener {
        public static final int Width = 500;
        public static final int Height = 500;
        private Container container;
        private FlappyCat flappyCat = new FlappyCat();
        private FlappyPanel flappyPanel = new FlappyPanel();
        public FlappyFrame() {
            setSize(Width,Height);
//            setLayout(new CardLayout());

            setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            setLocationRelativeTo(null);
            setTitle("Horror Mikichan");
//            container = new Container(this);
            setResizable(false);
 //           add(container);
            add(flappyPanel);
            addKeyListener(new KeyAdapter() {
                @Override
                public void keyTyped(KeyEvent e) {
                    super.keyTyped(e);
                }

                @Override
                public void keyPressed(KeyEvent e) {
                    flappyCat.down();
                }

                @Override
                public void keyReleased(KeyEvent e) {
                    super.keyReleased(e);
                }
            });
 //           addWindowListener(mwindow);
        }
        private WindowAdapter mwindow = new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
               // SoundManager.getInstance().stopPlay();
               // MainPanel.IS_RUNNING = false;
            }
        };
        @Override
        public void windowOpened(WindowEvent e) {

        }

        @Override
        public void windowClosing(WindowEvent e) {

        }

        @Override
        public void windowClosed(WindowEvent e) {

        }

        @Override
        public void windowIconified(WindowEvent e) {

        }

        @Override
        public void windowDeiconified(WindowEvent e) {

        }

        @Override
        public void windowActivated(WindowEvent e) {

        }

        @Override
        public void windowDeactivated(WindowEvent e) {

        }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}

