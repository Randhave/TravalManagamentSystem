package com.travalmanagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Forgot_Password extends JFrame implements ActionListener {
    JPanel p1, p2;
    JLabel l1, l2, l3, question, answer, l6, password, l7;
    JButton search, back, retrieve;
    JTextField t1, t2, t3, t4, t5, t6;
    Choice c1;

    Forgot_Password() {
        setBounds(300, 100, 800, 500);
        getContentPane().setBackground(Color.DARK_GRAY);
        setLayout(null);

        createUser();
    }

    public void createUser() {
        p1 = new JPanel();
        p1.setBounds(0, 0, 500, 460);
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
        t1.addActionListener(this);
        p1.add(t1);
        search = new JButton("Search");
        search.setBounds(400, 50, 80, 25);
        search.setBackground(Color.DARK_GRAY);
        search.setForeground(Color.RED);
        search.addActionListener(this);
        p1.add(search);

        l2 = new JLabel("Name");
        l2.setBounds(50, 100, 100, 30);
        l2.setForeground(Color.WHITE);
        p1.add(l2);
        t2 = new JTextField();
        t2.setBounds(200, 100, 180, 25);
        t2.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t2);

        question = new JLabel("Security question");
        question.setBounds(50, 150, 100, 30);
        question.setForeground(Color.WHITE);
        p1.add(question);
        t5 = new JTextField();
        t5.setBounds(200, 150, 180, 25);
        t5.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t5);

        answer = new JLabel("Your answer");
        answer.setBounds(50, 200, 100, 30);
        answer.setForeground(Color.WHITE);
        p1.add(answer);
        t4 = new JTextField();
        t4.setBounds(200, 200, 280, 30);
        t4.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t4);
        retrieve = new JButton("Retrieve");
        retrieve.setBounds(400, 250, 90, 25);
        retrieve.setBackground(Color.DARK_GRAY);
        retrieve.setForeground(Color.GREEN);
        retrieve.addActionListener(this);
        p1.add(retrieve);


        password = new JLabel("Your password");
        password.setBounds(50, 250, 100, 30);
        password.setForeground(Color.WHITE);
        p1.add(password);
        t6 = new JTextField();
        t6.setBounds(200, 250, 180, 25);
        t6.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t6);


        back = new JButton("Back");
        back.setBounds(50, 350, 335, 25);
        back.setBackground(Color.DARK_GRAY);
        back.setForeground(Color.white);
        back.addActionListener(this);
        p1.add(back);

        p2 = new JPanel();
        p2.setBounds(420, 0, 350, 460);
        p2.setBackground(Color.DARK_GRAY);
        p2.setLayout(null);
        add(p2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("com/travalmanagementSystem/icons/forgotpassword.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l6 = new JLabel(i3);
        l6.setBounds(0, 20, 400, 400);
        p2.add(l6);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        Conn c;
        if (event.getSource() == search) {

            try {
                String username = t1.getText();
                String query = "Select * from account where username = '" + username + "' ";
                c = new Conn();
                ResultSet result = c.statement.executeQuery(query);
                while (result.next()) {
                    t2.setText(result.getString("name"));
                    t5.setText(result.getString("security"));
                }

            } catch (Exception error) {
                error.printStackTrace();
            }
        } else if (event.getSource() == retrieve) {
            try {
                String username = t1.getText();
                String answer = t4.getText();
                String sql = "Select * from account where answer = '" + answer + "' AND  username='" + username + "' ";
                c = new Conn();
                ResultSet result = c.statement.executeQuery(sql);
                if (result.next()) {
                    t6.setText(result.getString("password"));
                }

            } catch (Exception error) {
                error.printStackTrace();
            }

        } else if (event.getSource() == back) {
            this.setVisible(false);
            new Login().setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Forgot_Password().setVisible(true);
    }
}
