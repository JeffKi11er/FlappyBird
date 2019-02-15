package com.company.mainGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Option  extends JPanel implements ActionListener {
    private Container container;
    private JLabel lbbackground;
    private ImageIcon backgroundIcon;
    private JButton btn_ok;

    public Option(Container container) {
        this.container = container;
        setBackground(Color.RED);
        setLayout(null);
        initCompts();
    }

    private void initCompts() {
        lbbackground = new JLabel();
        lbbackground.setBounds(97, -5, FlappyFrame.Width,FlappyFrame.Height-60);
        lbbackground.setBackground(Color.BLACK);
//        backgroundIcon = new ImageIcon(getClass().getResource("/map/Howtoplay.jpg"));
        lbbackground.setIcon(backgroundIcon);
        add(lbbackground);

        btn_ok = new JButton();
        btn_ok.setText("OK");
        btn_ok.setBounds(300, 640, 100, 50);
        btn_ok.addActionListener(this);
        add(btn_ok);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn_ok){
            container.setShowmenu();
        }
    }
}
