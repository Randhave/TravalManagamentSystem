package com.travalmanagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class View_package extends JFrame implements ActionListener {
    JPanel p1, p2;
    JLabel username, id, number, name, gender, country, address, phone, l6, t8, t1, t2, t4, t5, t6, t7, t3, t9;
    JButton b1;
    String user;

    View_package(String username) {
        this.user = username;
        setBounds(300, 100, 800, 500);
        getContentPane().setBackground(Color.DARK_GRAY);
        setTitle("View packages");
        setLayout(null);

        customerDetails();

        try {
            Conn c = new Conn();
            String query = "select * from packages where username = '" + user + "' ";
            ResultSet result = c.statement.executeQuery(query);
            while (result.next()) {
                t1.setText(result.getString("username"));
                t2.setText(result.getString("id"));
                t3.setText(result.getString("packageName"));
                t4.setText(result.getString("phone"));
                t5.setText(result.getString("number"));
                t6.setText(result.getString("gender"));
                t7.setText(result.getString("person"));
                t8.setText(result.getString("price"));
            }
        } catch (Exception error) {
            error.printStackTrace();
        }

    }

    public void customerDetails() {

        p1 = new JPanel();
        p1.setBounds(0, 0, 400, 460);
        p1.setBackground(Color.DARK_GRAY);
        p1.setBorder(BorderFactory.createEtchedBorder());
        p1.setLayout(null);
        add(p1);

        username = new JLabel("Username");
        username.setBounds(50, 10, 100, 30);
        username.setForeground(Color.WHITE);
        p1.add(username);
        t1 = new JLabel();
        t1.setForeground(Color.WHITE);
        t1.setBounds(200, 10, 180, 25);
        t1.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t1);

        id = new JLabel("ID");
        id.setBounds(50, 50, 100, 30);
        id.setForeground(Color.WHITE);
        p1.add(id);
        t2 = new JLabel();
        t2.setForeground(Color.WHITE);
        t2.setBounds(200, 50, 180, 25);
        t2.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t2);

        number = new JLabel("Selected package");
        number.setBounds(50, 90, 100, 30);
        number.setForeground(Color.WHITE);
        p1.add(number);
        t3 = new JLabel();
        t3.setForeground(Color.WHITE);
        t3.setBounds(200, 90, 180, 25);
        p1.add(t3);

        name = new JLabel("Phone");
        name.setBounds(50, 130, 100, 30);
        name.setForeground(Color.WHITE);
        p1.add(name);
        t4 = new JLabel();
        t4.setForeground(Color.WHITE);
        t4.setBounds(200, 130, 180, 25);
        t4.setBorder(BorderFactory.createEmptyBorder());

        p1.add(t4);

        gender = new JLabel("Number");
        gender.setBounds(50, 170, 100, 30);
        gender.setForeground(Color.WHITE);
        p1.add(gender);
        t5 = new JLabel();
        t5.setForeground(Color.WHITE);
        t5.setBounds(200, 170, 180, 25);
        t5.setBorder(BorderFactory.createEmptyBorder());

        p1.add(t5);

        country = new JLabel("Gender");
        country.setBounds(50, 210, 100, 30);
        country.setForeground(Color.WHITE);
        p1.add(country);
        t6 = new JLabel();
        t6.setForeground(Color.WHITE);
        t6.setBounds(200, 210, 180, 25);
        t6.setBorder(BorderFactory.createEmptyBorder());

        p1.add(t6);

        address = new JLabel("Total persons");
        address.setBounds(50, 250, 100, 30);
        address.setForeground(Color.WHITE);
        p1.add(address);
        t7 = new JLabel();
        t7.setForeground(Color.WHITE);
        t7.setBounds(200, 250, 180, 25);
        t7.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t7);

        phone = new JLabel("Total price");
        phone.setBounds(50, 290, 100, 30);
        phone.setForeground(Color.WHITE);
        p1.add(phone);
        t8 = new JLabel();
        t8.setBounds(200, 290, 180, 25);
        t8.setForeground(Color.RED);
        t8.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t8);


        b1 = new JButton("Back");
        b1.setBounds(200, 400, 100, 30);
        b1.setBackground(Color.DARK_GRAY);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        p1.add(b1);

        p2 = new JPanel();
        p2.setBounds(400, 0, 350, 460);
        p2.setBackground(Color.DARK_GRAY);
        p2.setLayout(null);
        add(p2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("com/travalmanagementSystem/icons/dest6.jpg"));
        Image image = i1.getImage().getScaledInstance(550, 400, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(image);
        l6 = new JLabel(i2);
        l6.setBounds(10, 10, 550, 400);
        p2.add(l6);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == b1) {
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {
        new View_package("").setVisible(true);
    }
}
