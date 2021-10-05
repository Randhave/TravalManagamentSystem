package com.travalmanagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Book_package extends JFrame implements ActionListener {
    JPanel p1, p2;
    JLabel username, id, number, name, gender, country, address, phone, email, l6, t8;
    JButton b1, b2, b3;
    JTextField t1, t2, t4, t5, t6, t7, t9;
    Choice t3 = null;
    String user;

    Book_package(String username) {
        this.user = username ;
        setBounds(300, 100, 800, 500);
        getContentPane().setBackground(Color.DARK_GRAY);
        setTitle("Book packages");
        setLayout(null);

        customerDetails();
        try {
            Conn c = new Conn();
            String query = "select * from customer where username = '" + user + "' ";
            ResultSet result = c.statement.executeQuery(query);
            while (result.next()) {
                t1.setText(result.getString("username"));
                t2.setText(result.getString("id"));
                t4.setText(result.getString("phone"));
                t5.setText(result.getString("number"));
                t6.setText(result.getString("gender"));


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
        t1 = new JTextField();
        t1.setBounds(200, 10, 180, 25);
        t1.setBorder(BorderFactory.createEmptyBorder());
        t1.addActionListener(this);
        p1.add(t1);

        id = new JLabel("ID");
        id.setBounds(50, 50, 100, 30);
        id.setForeground(Color.WHITE);
        p1.add(id);
        t2 = new JTextField();
        t2.setBounds(200, 50, 180, 25);
        t2.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t2);

        number = new JLabel("Select package");
        number.setBounds(50, 90, 100, 30);
        number.setForeground(Color.WHITE);
        p1.add(number);
        t3 = new Choice();
        t3.setBounds(200, 90, 180, 25);
        t3.add("Gold package");
        t3.add("Silver package");
        t3.add("Bronze package");
        p1.add(t3);

        name = new JLabel("Phone");
        name.setBounds(50, 130, 100, 30);
        name.setForeground(Color.WHITE);
        p1.add(name);
        t4 = new JTextField();
        t4.setBounds(200, 130, 180, 25);
        t4.setBorder(BorderFactory.createEmptyBorder());
        t4.addActionListener(this);
        p1.add(t4);

        gender = new JLabel("Number");
        gender.setBounds(50, 170, 100, 30);
        gender.setForeground(Color.WHITE);
        p1.add(gender);
        t5 = new JTextField();
        t5.setBounds(200, 170, 180, 25);
        t5.setBorder(BorderFactory.createEmptyBorder());
        t5.addActionListener(this);
        p1.add(t5);

        country = new JLabel("Gender");
        country.setBounds(50, 210, 100, 30);
        country.setForeground(Color.WHITE);
        p1.add(country);
        t6 = new JTextField();
        t6.setBounds(200, 210, 180, 25);
        t6.setBorder(BorderFactory.createEmptyBorder());
        t6.addActionListener(this);
        p1.add(t6);

        address = new JLabel("Total persons");
        address.setBounds(50, 250, 100, 30);
        address.setForeground(Color.WHITE);
        p1.add(address);
        t7 = new JTextField();
        t7.setBounds(200, 250, 180, 25);
        t7.setBorder(BorderFactory.createEmptyBorder());
        t7.addActionListener(this);
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
        b1.setBounds(50, 400, 70, 25);
        b1.setBackground(Color.DARK_GRAY);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        p1.add(b1);

        b2 = new JButton("Check Price");
        b2.setBounds(130, 400, 120, 25);
        b2.setBackground(Color.DARK_GRAY);
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        p1.add(b2);

        b3 = new JButton("Book Package");
        b3.setBounds(270, 400, 120, 25);
        b3.setBackground(Color.GREEN);
        b3.setForeground(Color.white);
        b3.addActionListener(this);
        p1.add(b3);

        p2 = new JPanel();
        p2.setBounds(400, 0, 350, 460);
        p2.setBackground(Color.DARK_GRAY);
        p2.setLayout(null);
        add(p2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("com/travalmanagementSystem/icons/bookpackage.jpg"));
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
        } else if (event.getSource() == b2) {
            if (t7.getText().isBlank()) {
                JOptionPane.showMessageDialog(null, "Please mention a person");
            } else {
                String Package = t3.getSelectedItem();
                int cost = 0;
                if (Package.equals("Gold package")) {
                    cost += 12000;
                } else if (Package.equals("Silver package")) {
                    cost += 24000;
                } else if (Package.equals("Bronze package")) {
                    cost += 32000;
                }
                int persons = Integer.parseInt(t7.getText());
                cost *= persons;
                t8.setText("Rs " + cost);
            }

        } else if (event.getSource() == b3) {
            if (t8.getText().isBlank()) {
                JOptionPane.showMessageDialog(null, "Check Your price before Booked ");
            } else {
                try {
                    String query = "insert into packages values('" + t1.getText() + "','" + t2.getText() + "','" + t3.getSelectedItem() + "','" + t4.getText() + "','" + t5.getText() + "','" + t6.getText() + "','" + t7.getText() + "' ,'" + t8.getText() + "')";
                    Conn c = new Conn();
                    c.statement.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Successfully Package Booked");
                    this.setVisible(false);
                } catch (Exception error) {
                    error.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        new Book_package("").setVisible(true);
    }
}
