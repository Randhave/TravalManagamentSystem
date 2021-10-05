package com.travalmanagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
    JLabel l1, l2;
    JPanel p1, p2;
    ImageIcon i1;
    JTextField t1, t2;
    JButton signup, login, forgotPassword, b4;

    Login() {
        setBounds(300, 100, 800, 500);
        getContentPane().setBackground(Color.DARK_GRAY);
        setLayout(null);

        panalOne();
        panalTwo();
        buttons();
    }

    public void panalOne() {
        p1 = new JPanel();
        p1.setBackground(Color.DARK_GRAY);
        p1.setBounds(0, 0, 400, 450);
        p1.setLayout(null);
        add(p1);

        i1 = new ImageIcon(ClassLoader.getSystemResource("com/travalmanagementSystem/icons/login.png"));
        l1 = new JLabel(i1);
        l1.setBounds(0, 0, 400, 450);
        p1.add(l1);
    }

    public void panalTwo() {
        p2 = new JPanel();
        p2.setBackground(Color.DARK_GRAY);
        p2.setBounds(400, 0, 400, 450);
        p2.setLayout(null);
        add(p2);

        l2 = new JLabel("Username");
        l2.setBounds(50, 100, 100, 50);
        l2.setForeground(Color.LIGHT_GRAY);
        p2.add(l2);

        t1 = new JTextField();
        t1.setBounds(50, 150, 200, 30);
        t1.setBorder(BorderFactory.createEmptyBorder());
        t1.setBackground(Color.LIGHT_GRAY);
        p2.add(t1);

        l2 = new JLabel("Password");
        l2.setBounds(50, 200, 100, 50);
        l2.setForeground(Color.LIGHT_GRAY);
        p2.add(l2);

        t2 = new JPasswordField();
        t2.setBounds(50, 250, 200, 30);
        t2.setBorder(BorderFactory.createCompoundBorder());
        t2.setBackground(Color.LIGHT_GRAY);
        p2.add(t2);

    }

    public void buttons() {
        login = new JButton("Login");
        login.setBounds(50, 300, 80, 30);
        login.setBackground(Color.DARK_GRAY);
        login.setForeground(Color.white);
        login.addActionListener(this);
        p2.add(login);

        signup = new JButton("SignUp");
        signup.setBounds(170, 300, 80, 30);
        signup.setBackground(Color.DARK_GRAY);
        signup.setForeground(Color.white);
        signup.addActionListener(this);
        p2.add(signup);

        forgotPassword = new JButton("Forget password");
        forgotPassword.setBounds(50, 350, 200, 30);
        forgotPassword.setBackground(Color.DARK_GRAY);
        forgotPassword.setForeground(Color.white);
        forgotPassword.addActionListener(this);
        p2.add(forgotPassword);

        b4 = new JButton("Exit from System");
        b4.setBounds(50, 400, 200, 30);
        b4.setBackground(Color.DARK_GRAY);
        b4.setForeground(Color.white);
        b4.addActionListener(this);
        p2.add(b4);

    }

    public static void main(String[] args) {
        System.out.println("Login frame");
        new Login().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == login) {
            try {
                String username = t1.getText();
                String password = t2.getText();
                if (username.isBlank() || password.isBlank()) {
                    JOptionPane.showMessageDialog(null, "Invalid credentials");
                } else {
                    String query = "select * from account where username = '" + username + "' AND password = '" + password + "' ";
                    Conn c = new Conn();
                    ResultSet result = c.statement.executeQuery(query);

                    if (result.next()) {
                        this.setVisible(false);
                        new Loader(username).setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid credentials !");
                    }
                }

            } catch (Exception error) {
                error.printStackTrace();
            }
        } else if (event.getSource() == signup) {
            this.setVisible(false);
            new Signup().setVisible(true);

        } else if (event.getSource() == forgotPassword) {
            this.setVisible(false);
            new Forgot_Password().setVisible(true);

        } else if (event.getSource() == b4) {
            System.exit(0);
        }
    }
}
