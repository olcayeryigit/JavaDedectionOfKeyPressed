package dedectionofkeypressed;

import javax.swing.*;
import java.awt.*;


public class Runner  {
    public static void main(String[] args) {
        JFrame jF=new JFrame();
        MyKeyListener myKL=new MyKeyListener();


        jF.setTitle("Javada Basılan Tuşu Algılama");
        jF.setSize(500,500);
        jF.setResizable(false);
        jF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jF.setVisible(true);

        Image cat;
        ImageIcon iicat= new ImageIcon("src/main/resources/cat.png");
        cat= iicat.getImage();
        jF.setIconImage(cat);

        jF.addKeyListener(myKL);





    }
}
