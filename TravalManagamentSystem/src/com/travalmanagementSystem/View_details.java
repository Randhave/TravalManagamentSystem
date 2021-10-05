package com.travalmanagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class View_details extends JFrame implements ActionListener {
    JPanel p1, p2;
    JLabel username, id, number, name, gender, country, address, phone, email, l6, t9, t1, t2, t3, t4, t5, t6, t7, t8;
    JButton b1;
    String user;

    View_details(String username) {
        this.user = username;
        setBounds(300, 100, 800, 500);
        getContentPane().setBackground(Color.DARK_GRAY);
        setTitle("View Customer Details");
        setLayout(null);

        customerDetails();
        try {
            Conn c = new Conn();
            String query = "select * from customer where username = ' " + user + " '  ";
            ResultSet result = c.statement.executeQuery(query);
            while (result.next()) {
                t1.setText(result.getString("username"));
                t2.setText(result.getString("id"));
                t3.setText(result.getString("number"));
                t4.setText(result.getString("name"));
                t5.setText(result.getString("gender"));
                t6.setText(result.getString("country"));
                t7.setText(result.getString("address"));
                t8.setText(result.getString("phone"));
                t9.setText(result.getString("email"));
            }
        } catch (Exception error) {
            error.printStackTrace();
        }
    }

    public void customerDetails() {

        p1 = new JPanel();
        p1.setBounds(0, 0, 785, 250);
        p1.setBackground(Color.DARK_GRAY);
        p1.setBorder(BorderFactory.createEtchedBorder());
        p1.setLayout(null);
        add(p1);

        username = new JLabel("Username ");
        username.setBounds(50, 10, 100, 30);
        username.setForeground(Color.WHITE);
        p1.add(username);
        t1 = new JLabel();
        t1.setBounds(150, 10, 150, 25);
        t1.setBorder(BorderFactory.createEmptyBorder());
        t1.setForeground(Color.WHITE);
        p1.add(t1);

        id = new JLabel("ID ");
        id.setBounds(400, 10, 30, 30);
        id.setForeground(Color.WHITE);
        p1.add(id);
        t2 = new JLabel();
        t2.setBounds(480, 10, 150, 25);
        t2.setBorder(BorderFactory.createEmptyBorder());
        t2.setForeground(Color.WHITE);
        p1.add(t2);

        number = new JLabel("Number ");
        number.setBounds(50, 50, 100, 30);
        number.setForeground(Color.WHITE);
        p1.add(number);
        t3 = new JLabel();
        t3.setBounds(150, 50, 150, 25);
        t3.setBorder(BorderFactory.createEmptyBorder());
        t3.setForeground(Color.WHITE);
        p1.add(t3);

        name = new JLabel("Name ");
        name.setBounds(400, 50, 100, 30);
        name.setForeground(Color.WHITE);
        p1.add(name);
        t4 = new JLabel();
        t4.setBounds(480, 50, 150, 25);
        t4.setBorder(BorderFactory.createEmptyBorder());
        t4.setForeground(Color.WHITE);
        p1.add(t4);

        gender = new JLabel("Gender ");
        gender.setBounds(50, 90, 100, 30);
        gender.setForeground(Color.WHITE);
        p1.add(gender);
        t5 = new JLabel();
        t5.setBounds(150, 90, 150, 25);
        t5.setBorder(BorderFactory.createEmptyBorder());
        t5.setForeground(Color.WHITE);
        p1.add(t5);

        country = new JLabel("Country ");
        country.setBounds(400, 90, 100, 30);
        country.setForeground(Color.WHITE);
        p1.add(country);
        t6 = new JLabel();
        t6.setBounds(480, 90, 150, 25);
        t6.setBorder(BorderFactory.createEmptyBorder());
        t6.setForeground(Color.WHITE);
        p1.add(t6);

        address = new JLabel("Address ");
        address.setBounds(400, 130, 100, 30);
        address.setForeground(Color.WHITE);
        p1.add(address);
        t7 = new JLabel();
        t7.setBounds(480, 130, 150, 25);
        t7.setBorder(BorderFactory.createEmptyBorder());
        t7.setForeground(Color.WHITE);
        p1.add(t7);

        phone = new JLabel("Phone ");
        phone.setBounds(50, 130, 150, 30);
        phone.setForeground(Color.WHITE);
        p1.add(phone);
        t8 = new JLabel();
        t8.setBounds(150, 130, 150, 25);
        t8.setBorder(BorderFactory.createEmptyBorder());
        t8.setForeground(Color.WHITE);
        p1.add(t8);

        email = new JLabel("Email ");
        email.setBounds(400, 170, 100, 30);
        email.setForeground(Color.WHITE);
        p1.add(email);
        t9 = new JLabel("");
        t9.setBounds(480, 170, 150, 25);
        t9.setBorder(BorderFactory.createEmptyBorder());
        t9.setForeground(Color.WHITE);
        p1.add(t9);


        b1 = new JButton("Back");
        b1.setBounds(250, 210, 100, 25);
        b1.setBackground(Color.DARK_GRAY);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        p1.add(b1);

        p2 = new JPanel();
        p2.setBounds(0, 260, 780, 230);
        p2.setBackground(Color.DARK_GRAY);
        p2.setLayout(null);
        add(p2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("com/travalmanagementSystem/icons/viewall.jpg"));
        Image image = i1.getImage().getScaledInstance(780, 210, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(image);
        l6 = new JLabel(i2);
        l6.setBounds(0, 0, 780, 210);
        p2.add(l6);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == b1) {
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {
        new View_details("").setVisible(true);
    }
}
