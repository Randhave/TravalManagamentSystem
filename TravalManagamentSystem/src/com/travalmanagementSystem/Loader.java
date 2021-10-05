package com.travalmanagementSystem;

import javax.swing.*;
import java.awt.*;

public class Loader extends JFrame implements Runnable {
    JProgressBar progress;
    Thread t;
    String username;


    Loader(String username) {
        t = new Thread(this);
        this.username = username;
        setBounds(300, 100, 800, 500);
        getContentPane().setBackground(Color.DARK_GRAY);
        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setBounds(190, 100, 400, 200);
        p1.setBorder(BorderFactory.createEtchedBorder());
        p1.setBackground(Color.DARK_GRAY);
        p1.setLayout(null);
        add(p1);

        progress = new JProgressBar();
        progress.setBounds(100, 80, 200, 40);
        progress.setBorder(BorderFactory.createEtchedBorder());
        progress.setBackground(Color.DARK_GRAY);
        progress.setStringPainted(true);
        p1.add(progress);

        JLabel l1 = new JLabel("Please wait");
        l1.setFont(new Font("Raleway", Font.BOLD, 15));
        l1.setBounds(170, 130, 150, 20);
        l1.setForeground(Color.LIGHT_GRAY);
        p1.add(l1);

        JPanel p2 = new JPanel();
        p2.setBounds(10, 400, 350, 30);
        p2.setBackground(Color.DARK_GRAY);
        p2.setBorder(BorderFactory.createEtchedBorder());
        p2.setLayout(null);
        add(p2);
        JLabel l2 = new JLabel("Welocme " + username + " To our Turisom");
        l2.setFont(new Font("Raleway", Font.BOLD, 15));
        l2.setBounds(20, 5, 350, 20);
        l2.setForeground(Color.GREEN);
        p2.add(l2);

        t.start();
    }

    public void run() {
        try {
            for (int i = 1; i <= 100; i++) {
                int max = progress.getMaximum();
                int current = progress.getValue();
                if (current < max) {
                    progress.setValue(progress.getValue() + 1);
                } else {
                    i = 101;
                }
                Thread.sleep(80);

            }
            this.setVisible(false);
            new Dashboard(username).setVisible(true);

        } catch (Exception error) {
            error.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Loader("").setVisible(true);
    }
}
