package com.company.Game;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Pipe extends JPanel {
    private static int x1 = 500,x2= x1 +140,x3 = x2+140,x4 = x3+140;
    private static int h1,h2,h3,h4;
    private static boolean aBoolean1 = false;
    private static boolean aBoolean2 = false;
    private static boolean aBoolean3 = false;
    private static boolean aBoolean4 = false;

    public void readHeight(){
        Random random = new Random();
        if(aBoolean1==false) {
            h1 = random.nextInt(200);
            aBoolean1 = true;
        }
        if(aBoolean2==false) {
            h2 = random.nextInt(200);
            aBoolean2 = true;
        }
        if(aBoolean3==false) {
            h3 = random.nextInt(200);
            aBoolean3 = true;
        }
        if(aBoolean4==false) {
            h4 = random.nextInt(200);
            aBoolean4 = true;
        }
    }
    public void paint(Graphics graphics){
        readHeight();
        graphics.setColor(Color.GREEN);
        graphics.fillRect(x1,0,65,h1);
        graphics.setColor(Color.GREEN);
        graphics.fillRect(x1,h1 +100,65,500);
        graphics.setColor(Color.GREEN);
        graphics.fillRect(x2,0,65,h2);
        graphics.setColor(Color.GREEN);
        graphics.fillRect(x2,h2+100,65,500);
        graphics.setColor(Color.GREEN);
        graphics.fillRect(x3,0,65,h3);
        graphics.setColor(Color.GREEN);
        graphics.fillRect(x3,h3 +100,65,500);
        graphics.setColor(Color.GREEN);
        graphics.fillRect(x4,0,65,h4);
        graphics.setColor(Color.GREEN);
        graphics.fillRect(x4,h4+100,65,500);
    }
    public void move(){
        x1--;
        x2--;
        x3--;
        x4--;
    }
    public void loop(){
        if(x1==-65){
            x1 = 500;
            aBoolean1 = false;
        }
        if(x2==-65){
            x2 = 500;
            aBoolean2 = false;
        }
        if(x3==-65){
            x3 = 500;
            aBoolean3 = false;
        }
        if(x4==-65){
            x4 = 500;
            aBoolean4 = false;
        }
    }

    public static int getX1() {
        return x1;
    }

    public static int getX2() {
        return x2;
    }

    public static int getX3() {
        return x3;
    }

    public static int getX4() {
        return x4;
    }

    public static int getH1() {
        return h1;
    }

    public static int getH2() {
        return h2;
    }

    public static int getH3() {
        return h3;
    }

    public static int getH4() {
        return h4;
    }
}
