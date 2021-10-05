package com.travalmanagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup extends JFrame implements ActionListener {
    JPanel p1, p2;
    JLabel l1, l2, l3, l4, l5, l6;
    JButton b1, b2;
    JTextField t1, t2, t3, t4;
    Choice c1;

    Signup() {
        setBounds(300, 100, 800, 500);
        getContentPane().setBackground(Color.DARK_GRAY);
        setLayout(null);

        createUser();
    }

    public void createUser() {
        p1 = new JPanel();
        p1.setBounds(0, 0, 400, 460);
        p1.setBackground(Color.DARK_GRAY);
        p1.setBorder(BorderFactory.createEtchedBorder());
        p1.setLayout(null);
        add(p1);

        l1 = new JLabel("Username");
        l1.setBounds(50, 50, 100, 30);
        l1.setForeground(Color.WHITE);
        p1.add(l1);
        t1 = new JTextField();
        t1.setBounds(200, 50, 180, 25);
        t1.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t1);

        l2 = new JLabel("Name");
        l2.setBounds(50, 100, 100, 30);
        l2.setForeground(Color.WHITE);
        p1.add(l2);
        t2 = new JTextField();
        t2.setBounds(200, 100, 180, 25);
        t2.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t2);

        l3 = new JLabel("Password");
        l3.setBounds(50, 150, 100, 30);
        l3.setForeground(Color.WHITE);
        p1.add(l3);
        t3 = new JTextField();
        t3.setBounds(200, 150, 180, 25);
        t3.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t3);

        l4 = new JLabel("Security question");
        l4.setBounds(50, 200, 100, 30);
        l4.setForeground(Color.WHITE);
        p1.add(l4);

        c1 = new Choice();
        c1.setBounds(200, 200, 180, 30);
        c1.add("Are you single");
        c1.add("What your skill");
        c1.add("Which programming language you like");
        c1.add("Are you virgin");
        p1.add(c1);

        l5 = new JLabel("Your answer");
        l5.setBounds(50, 250, 100, 30);
        l5.setForeground(Color.WHITE);
        p1.add(l5);
        t4 = new JTextField();
        t4.setBounds(200, 250, 180, 25);
        t4.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t4);

        b1 = new JButton("Back");
        b1.setBounds(50, 350, 100, 25);
        b1.setBackground(Color.DARK_GRAY);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        p1.add(b1);

        b2 = new JButton("Create");
        b2.setBounds(240, 350, 100, 25);
        b2.setBackground(Color.DARK_GRAY);
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        p1.add(b2);

        p2 = new JPanel();
        p2.setBounds(430, 0, 350, 460);
        p2.setBackground(Color.DARK_GRAY);
        p2.setLayout(null);
        add(p2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("com/travalmanagementSystem/icons/signup.png"));
        l6 = new JLabel(i1);
        l6.setBounds(50, 100, 200, 200);
        p2.add(l6);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == b1) {
            this.setVisible(false);
            new Login().setVisible(true);
        } else if (event.getSource() == b2) {
            String username = t1.getText();
            String name = t2.getText();
            String password = t3.getText();
            String answer = t4.getText();
            String security = c1.getSelectedItem();
            if (username.isBlank() || name.isBlank() || password.isBlank() || answer.isBlank()) {
                JOptionPane.showMessageDialog(this, "Please fill the form Correctly");
            } else {
                String query = "insert into account values('" + username + "','" + name + "','" + password + "','" + security + "','" + answer + "' )";
                try {
                    Conn c = new Conn();
                    c.statement.executeUpdate(query);
                    JOptionPane.showMessageDialog(this, "Successfully account created");
                    this.setVisible(false);
                    new Login().setVisible(true);
                } catch (Exception error) {
                    error.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello signup");
        new Signup().setVisible(true);
    }


}
