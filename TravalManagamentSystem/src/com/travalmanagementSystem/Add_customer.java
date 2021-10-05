package com.travalmanagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Add_customer extends JFrame implements ActionListener {
    JPanel p1, p2;
    JLabel username, id, number, name, gender, country, address, phone, email, l6;
    JButton b1, b2;
    JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9;
    JRadioButton male, female;
    JComboBox box;

    Add_customer(String username) {
        setBounds(300, 100, 800, 500);
        getContentPane().setBackground(Color.DARK_GRAY);
        setTitle("Add Customer");
        setLayout(null);

        customerDetails();

        try {
            String query = "select * from account where username = '" + username + "' ";
            Conn c = new Conn();
            ResultSet result = c.statement.executeQuery(query);
            while (result.next()) {
                t1.setText(result.getString("username"));
                t4.setText(result.getString("name"));
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
        box = new JComboBox(new String[]{"", "Passport", "Aadhar Card", "Pan Card", "Ration Card"});
        box.setBounds(200, 50, 180, 25);
        box.setBorder(BorderFactory.createEmptyBorder());
        p1.add(box);

        number = new JLabel("Number");
        number.setBounds(50, 90, 100, 30);
        number.setForeground(Color.WHITE);
        p1.add(number);
        t3 = new JTextField();
        t3.setBounds(200, 90, 180, 25);
        t3.setBorder(BorderFactory.createEmptyBorder());
        t3.addActionListener(this);
        p1.add(t3);

        name = new JLabel("Name");
        name.setBounds(50, 130, 100, 30);
        name.setForeground(Color.WHITE);
        p1.add(name);
        t4 = new JTextField();
        t4.setBounds(200, 130, 180, 25);
        t4.setBorder(BorderFactory.createEmptyBorder());
        t4.addActionListener(this);
        p1.add(t4);

        gender = new JLabel("Gender");
        gender.setBounds(50, 170, 100, 30);
        gender.setForeground(Color.WHITE);
        p1.add(gender);
        male = new JRadioButton("male");
        male.setBounds(200, 170, 80, 25);
        male.setBackground(Color.DARK_GRAY);
        male.setForeground(Color.white);
        female = new JRadioButton("female");
        female.setBounds(300, 170, 80, 25);
        female.setBackground(Color.DARK_GRAY);
        female.setForeground(Color.white);
        p1.add(male);
        p1.add(female);


        country = new JLabel("Country");
        country.setBounds(50, 210, 100, 30);
        country.setForeground(Color.WHITE);
        p1.add(country);
        t6 = new JTextField();
        t6.setBounds(200, 210, 180, 25);
        t6.setBorder(BorderFactory.createEmptyBorder());
        t6.addActionListener(this);
        p1.add(t6);

        address = new JLabel("Address");
        address.setBounds(50, 250, 100, 30);
        address.setForeground(Color.WHITE);
        p1.add(address);
        t7 = new JTextField();
        t7.setBounds(200, 250, 180, 25);
        t7.setBorder(BorderFactory.createEmptyBorder());
        t7.addActionListener(this);
        p1.add(t7);

        phone = new JLabel("Phone");
        phone.setBounds(50, 290, 100, 30);
        phone.setForeground(Color.WHITE);
        p1.add(phone);
        t8 = new JTextField();
        t8.setBounds(200, 290, 180, 25);
        t8.setBorder(BorderFactory.createEmptyBorder());
        t8.addActionListener(this);
        p1.add(t8);

        email = new JLabel("Email");
        email.setBounds(50, 330, 100, 30);
        email.setForeground(Color.WHITE);
        p1.add(email);
        t9 = new JTextField();
        t9.setBounds(200, 330, 180, 25);
        t9.setBorder(BorderFactory.createEmptyBorder());
        t9.addActionListener(this);
        p1.add(t9);

        b1 = new JButton("Back");
        b1.setBounds(50, 400, 100, 25);
        b1.setBackground(Color.DARK_GRAY);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        p1.add(b1);

        b2 = new JButton("Add");
        b2.setBounds(240, 400, 100, 25);
        b2.setBackground(Color.DARK_GRAY);
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        p1.add(b2);

        p2 = new JPanel();
        p2.setBounds(430, 0, 350, 460);
        p2.setBackground(Color.DARK_GRAY);
        p2.setLayout(null);
        add(p2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("com/travalmanagementSystem/icons/newcustomer.jpg"));
        Image image = i1.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(image);
        l6 = new JLabel(i2);
        l6.setBounds(20, 10, 300, 400);
        p2.add(l6);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == b1) {
            this.setVisible(false);
        } else if (event.getSource() == b2) {
            String username = t1.getText();
            String id = (String) box.getSelectedItem();
            String number = t3.getText();
            String name = t4.getText();
            String country = t6.getText();
            String address = t7.getText();
            String phone = t8.getText();
            String email = t8.getText();
            String gender = null;
            if (male.isSelected()) {
                gender = "male";
            } else if (female.isSelected()) {
                gender = "female";
            }
            if (username.isBlank() || number.isBlank() || name.isBlank() || country.isBlank() || address.isBlank() || phone.isBlank() || email.isBlank()) {
                JOptionPane.showMessageDialog(null, "Fill the form correctly");
            } else {
                try {
                    String query = "insert into customer values('" + username + "','" + id + "','" + number + "','" + name + "','" + email + "','" + country + "','" + address + "','" + phone + "','" + gender + "' )";
                    Conn c = new Conn();
                    c.statement.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Customer Added Successfully");
                    this.setVisible(false);
                } catch (Exception error) {
                    error.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        new Add_customer("").setVisible(true);
    }
}
