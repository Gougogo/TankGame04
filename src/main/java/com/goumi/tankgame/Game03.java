package com.goumi.tankgame;

import javax.swing.*;

/**
 * @version 1.0
 * @auther GouMi
 */
public class Game03 extends JFrame {

    MyPanel mp = null;

    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));
        new Game03().setVisible(true);
    }


    public Game03(){
        mp = new MyPanel();
        this.add(mp);
        this.setSize(2025, 1565);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.addKeyListener(mp);

    }
}
