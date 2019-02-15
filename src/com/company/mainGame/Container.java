package com.company.mainGame;

//import com.company.sound.SoundManager;

import javax.swing.*;
import java.awt.*;

public class Container extends JPanel {
    private FlappyFrame mainFrame;
    private FlappyPanel mainPanel;
    private static final String TAG_MENU = "tag_menu";
    private static final String TAG_PLAYGAME = "tag_playgame";
    private static final String TAG_OPTION = "tag_option";
    private static final String TAG_ABOUT = "tag_about";
    private CardLayout mCardLayout;
    private Menu menu;
    private Option option;
    private About about;

    public Container(FlappyFrame mainFrame) {
        this.mainFrame = mainFrame;
        setBackground(Color.BLACK);
        mCardLayout = new CardLayout();
        setLayout(mCardLayout);
        menu = new Menu(this);
        add(menu,TAG_MENU);
       // mainPanel = new FlappyPanel(this);
        add(mainPanel,TAG_PLAYGAME);
        option = new Option(this);
        add(option,TAG_OPTION);
        about = new About(this);
        add(about,TAG_ABOUT);

        setShowmenu();
    }
    public FlappyFrame getMainFrame(){
        return mainFrame;
    }
    public void setShowmenu() {
        mCardLayout.show(Container.this,TAG_MENU);
        menu.requestFocus();
//        SoundManager.getInstance().stopPlay();
//        SoundManager.getInstance().getAudio(SoundManager.MENU).loop();
    }
    public void setShowPlay() {
        mCardLayout.show(Container.this, TAG_PLAYGAME);
        mainPanel.requestFocus();
//        SoundManager.getInstance().getAudio(SoundManager.MENU).stop();
//        SoundManager.getInstance().getAudio(SoundManager.WAVE1).loop();
    }
    public void setShowOption(){
        mCardLayout.show(Container.this, TAG_OPTION);
        option.requestFocus();
    }

    public void setShowAbout(){
        mCardLayout.show(Container.this, TAG_ABOUT);
        about.requestFocus();
    }
}
