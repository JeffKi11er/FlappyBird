package com.company.Game;

public class Check {
    private Pipe pipe = new Pipe();
    private FlappyCat flappyCat = new FlappyCat();
    public boolean isDead() {
        if (flappyCat.getY() + 45 >= 400) {
            return true;
        }
        if (flappyCat.getY() <= pipe.getH1() && ((flappyCat.getX() + 45) >= pipe.getX1()) && flappyCat.getX() <= (pipe.getX1() + 65)) {
            return true;
        }
        if((flappyCat.getY()+45)>=(pipe.getH1()+100)&&(flappyCat.getX()+45)>=pipe.getX1()&&(flappyCat.getX()<=(pipe.getX1()+65))){return true;}
        //-----
        if (flappyCat.getY() <= pipe.getH2() && ((flappyCat.getX() + 45) >= pipe.getX2()) && flappyCat.getX() <= (pipe.getX2() + 65)) {
            return true;
        }
        if((flappyCat.getY()+45)>=(pipe.getH2()+100)&&(flappyCat.getX()+45)>=pipe.getX2()&&(flappyCat.getX()<=(pipe.getX2()+65))){return true;}
        //-----
        if (flappyCat.getY() <= pipe.getH3() && ((flappyCat.getX() + 45) >= pipe.getX3()) && flappyCat.getX() <= (pipe.getX3() + 65)) {
            return true;
        }
        if((flappyCat.getY()+45)>=(pipe.getH3()+100)&&(flappyCat.getX()+45)>=pipe.getX3()&&(flappyCat.getX()<=(pipe.getX3()+65))){return true;}
        //-----
        if (flappyCat.getY() <= pipe.getH4() && ((flappyCat.getX() + 45) >= pipe.getX4()) && flappyCat.getX() <= (pipe.getX4() + 65)) {
            return true;
        }
        if((flappyCat.getY()+45)>=(pipe.getH4()+100)&&(flappyCat.getX()+45)>=pipe.getX4()&&(flappyCat.getX()<=(pipe.getX4()+65))){return true;}
        return false;
    }
}
