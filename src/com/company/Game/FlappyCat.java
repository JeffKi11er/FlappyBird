package com.company.Game;

import javax.swing.*;
import java.awt.*;

public class FlappyCat {
    private static int y = 200;
    private static int x = 100;

    public static int getY() {
        return y;
    }
    public static int getX(){
        return x;
    }
    public void draw(Graphics graphics2D){
        graphics2D.setColor(Color.RED);
        graphics2D.fillRect(x,y,45,45);
    }
    public void up(){
        y++;
    }
    public void down(){
        y-=30;
    }
}
