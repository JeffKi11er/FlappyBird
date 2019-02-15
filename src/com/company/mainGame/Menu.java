package com.company.mainGame;

//import com.company.sound.SoundManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Menu extends JPanel {
    private int padding = 15;
    private FlappyFrame mainFrame;
    private Container container;
    private JLabel lbbackground;
    private JLabel lbPlayGame;
    private JLabel lbOption;
    private JLabel lbAbout;
    private JLabel lbExit;
    private ImageIcon backgroundIcon;
    private MouseListener mMouseAdapter = new MouseAdapter() {
        @Override
        public void mousePressed(MouseEvent e) {
            if(e.getSource()==lbExit){
           //     SoundManager.getInstance().getAudio(SoundManager.MENU).stop();
                mainFrame.dispose();
   //             FlappyPanel.IS_RUNNING=false;
            }
            if(e.getSource()==lbPlayGame){
                container.setShowPlay();
            }
            if(e.getSource()==lbOption){
                container.setShowOption();
            }
            if(e.getSource()==lbAbout){
                container.setShowAbout();
            }
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            if(e.getSource()==lbPlayGame){
                ImageIcon playIcon = new ImageIcon(getClass().getResource("/map/PLAY.png"));
                lbPlayGame.setIcon(playIcon);
            }
            if(e.getSource()==lbOption){
                ImageIcon optionIcon = new ImageIcon(getClass().getResource("/map/OPTION.png"));
                lbOption.setIcon(optionIcon);
            }
            if(e.getSource()==lbAbout){
                ImageIcon hightScoreIcon = new ImageIcon(getClass().getResource("/map/ABOUT.png"));
                lbAbout.setIcon(hightScoreIcon);
            }
            if(e.getSource()==lbExit){
                ImageIcon exitIcon = new ImageIcon(getClass().getResource("/map/EXIT.png"));
                lbExit.setIcon(exitIcon);
            }
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if(e.getSource()==lbPlayGame){
                ImageIcon playIcon = new ImageIcon(getClass().getResource("/map/PLAY.png"));
                lbPlayGame.setIcon(playIcon);
            }
            if(e.getSource()==lbOption){
                ImageIcon optionIcon = new ImageIcon(getClass().getResource("/map/OPTION.png"));
                lbOption.setIcon(optionIcon);
            }
            if(e.getSource()==lbAbout){
                ImageIcon hightScoreIcon = new ImageIcon(getClass().getResource("/map/ABOUT.png"));
                lbAbout.setIcon(hightScoreIcon);
            }
            if(e.getSource()==lbExit){
                ImageIcon exitIcon = new ImageIcon(getClass().getResource("/map/EXIT.png"));
                lbExit.setIcon(exitIcon);
            }
        }
    };

    public Menu(Container container) {
        this.container = container;
        this.mainFrame = container.getMainFrame();
        setBackground(Color.BLACK);
        setLayout(null);
        initComps(mainFrame);
        initBackground();
    }
    public JLabel setLabel(int x, int y, String ImageIcon){
        JLabel label = new JLabel();
        ImageIcon Icon = new ImageIcon(getClass().getResource(ImageIcon));
        label.setBounds(x, y, Icon.getIconWidth(), Icon.getIconHeight());
        label.setIcon(Icon);
        return label;
    }
    private void initComps(FlappyFrame mainFrame) {
        lbPlayGame = setLabel((mainFrame.getWidth()-150)/2-355, (mainFrame.getHeight()-30)/2+279, "/map/PLAY.png");
        lbOption = setLabel(lbPlayGame.getX()+ lbPlayGame.getWidth()+padding,lbPlayGame.getY(), "/map/OPTION.png");
        lbAbout = setLabel(lbOption.getX()+ lbOption.getWidth()+padding,lbOption.getY(), "/map/ABOUT.png");
        lbExit = setLabel(lbAbout.getX()+ lbAbout.getWidth()+padding,lbAbout.getY(), "/map/EXIT.png");

        lbPlayGame.addMouseListener(mMouseAdapter);
        lbOption.addMouseListener(mMouseAdapter);
        lbAbout.addMouseListener(mMouseAdapter);
        lbExit.addMouseListener(mMouseAdapter);

        add(lbPlayGame);
        add(lbOption);
        add(lbAbout);
        add(lbExit);
    }
    private void initBackground(){
        lbbackground = new JLabel();
        lbbackground.setBounds(90, 10, mainFrame.getWidth(), mainFrame.getHeight());
        lbbackground.setBackground(Color.BLACK);
        backgroundIcon = new ImageIcon(getClass().getResource("/map/background.jpg"));
        lbbackground.setIcon(backgroundIcon);
        add(lbbackground);
    }
}
