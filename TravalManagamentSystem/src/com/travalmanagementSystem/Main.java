package com.travalmanagementSystem;

import javax.swing.*;
import java.awt.*;

public class Main {
    Main() {

        Intro frame = new Intro();
        frame.setVisible(true);
        int length = 1;
        for (int i = 0; i <= 680; i++, length += 1) {
            frame.setLocation(0, 0);
            frame.setSize(length + i, i);
            try {
                Thread.sleep(10);
            } catch (Exception error) {
                error.printStackTrace();
            }
        }

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello world");
        new Main();
    }
}

class Intro extends JFrame implements Runnable {
    ImageIcon i1, i3;
    JLabel l1;
    Image i2;

    Intro() {
        i1 = new ImageIcon(ClassLoader.getSystemResource("com/travalmanagementSystem/icons/home.jpg"));
        i2 = i1.getImage().getScaledInstance(600, 700, Image.SCALE_DEFAULT);
        i3 = new ImageIcon(i2);
        l1 = new JLabel(i1);
        add(l1);

        Thread t1 = new Thread(this);
        t1.start();
    }

    @Override
    public void run() {
        try {
            Thread.sleep(20000);
            this.setVisible(false);
            new Login().setVisible(true);
        } catch (Exception error) {
            error.printStackTrace();
        }
    }
}
