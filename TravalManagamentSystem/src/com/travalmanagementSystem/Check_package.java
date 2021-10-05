package com.travalmanagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Check_package extends JFrame implements ActionListener {
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10;

    Check_package() {

        setBounds(300, 100, 800, 500);
        getContentPane().setBackground(Color.WHITE);
        setTitle("Package Details");

        String[] package1 = new String[]{"Gold Package", "6 Days and 7 Nights", " Half Day City Tour", " Daily Buffet", "Welcome Drinks  on Arrival", "Full day Island Cruise", "English speaking guide", "BOOK NOW", "SUMMER SPECIAL", "12000/-", "dest2.png"};
        String[] package2 = new String[]{"Silver Package", "5 Days and 6 Nights", " Half Day City Tour", "Total free nd Entrance Free tack", "Welcome Drinks  on Arrival", "Full day Island Cruise", "English speaking guide", "BOOK NOW", "SUMMER SPECIAL", "24000/-", "dest1.jpeg"};
        String[] package3 = new String[]{"Bronze Package", "7 Days and 8 Nights", " FUll Day City Tour", "Total free nd Entrance Free tack", "Night safari", "Ful day 3 island", "Cruise with dinner", "BOOK NOW", "SUMMER SPECIAL", "32000/-", "dest1.jpeg"};

        JTabbedPane pane = new JTabbedPane();
        JPanel p1 = createpackage(package1);
        pane.addTab("Package1", null, p1);

        JPanel p2 = createpackage(package2);
        pane.addTab("Package2", null, p2);

        JPanel p3 = createpackage(package3);
        pane.addTab("Package3", null, p3);

        add(pane, BorderLayout.CENTER);
    }

    public JPanel createpackage(String[] pack) {
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        l10 = new JLabel(pack[0]);
        l10.setBounds(50, 0, 200, 50);
        l10.setForeground(Color.BLACK);
        l10.setFont(new Font("Tahoma", Font.BOLD, 20));
        p1.add(l10);

        l1 = new JLabel(pack[1]);
        l1.setBounds(20, 40, 200, 50);
        l1.setForeground(Color.RED);
        l1.setFont(new Font("Tahoma", Font.BOLD, 20));
        p1.add(l1);

        l2 = new JLabel(pack[2]);
        l2.setBounds(15, 80, 200, 50);
        l2.setForeground(Color.GREEN);
        l2.setFont(new Font("Tahoma", Font.BOLD, 20));
        p1.add(l2);

        l3 = new JLabel(pack[3]);
        l3.setBounds(15, 120, 200, 50);
        l3.setForeground(Color.RED);
        l3.setFont(new Font("Tahoma", Font.BOLD, 20));
        p1.add(l3);

        l4 = new JLabel(pack[4]);
        l4.setBounds(20, 160, 200, 50);
        l4.setForeground(Color.BLACK);
        l4.setFont(new Font("Tahoma", Font.BOLD, 20));
        p1.add(l4);

        l5 = new JLabel(pack[5]);
        l5.setBounds(20, 200, 200, 50);
        l5.setForeground(Color.BLUE);
        l5.setFont(new Font("Tahoma", Font.BOLD, 20));
        p1.add(l5);

        l6 = new JLabel(pack[6]);
        l6.setBounds(20, 240, 200, 50);
        l6.setForeground(Color.PINK);
        l6.setFont(new Font("Tahoma", Font.BOLD, 20));
        p1.add(l6);

        l7 = new JLabel(pack[7]);
        l7.setBounds(20, 380, 200, 50);
        l7.setForeground(Color.BLACK);
        l7.setFont(new Font("Tahoma", Font.BOLD, 20));
        p1.add(l7);

        l8 = new JLabel(pack[8]);
        l8.setBounds(200, 380, 200, 50);
        l8.setForeground(Color.BLUE);
        l8.setFont(new Font("Tahoma", Font.BOLD, 20));
        p1.add(l8);

        l9 = new JLabel(pack[9]);
        l9.setBounds(600, 380, 200, 50);
        l9.setForeground(Color.RED);
        l9.setFont(new Font("Tahoma", Font.BOLD, 20));
        p1.add(l9);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("com/travalmanagementSystem/icons/" + pack[10]));
        JLabel image = new JLabel(i1);
        image.setBounds(300, 20, 450, 330);
        p1.add(image);
        return p1;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new Check_package().setVisible(true);
    }
}
