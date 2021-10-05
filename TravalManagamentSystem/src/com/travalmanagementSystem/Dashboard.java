package com.travalmanagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame implements ActionListener {
    ImageIcon i1, i2;
    JButton logout, addDetails, viewDetails, viewPackage, viewHotels, viewbookedHotels, updateDetails, deleteDetails, checkPackage, bookPackage, bookHotel, destination, notepad, about, payment, cacli;
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15;
    String username;

    Dashboard(String username) {
        this.username = username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
//        setBounds( 0,  0, 1950, 1000);
        getContentPane().setBackground(new Color(0, 0, 102));
        setLayout(null);
//        i1 = new ImageIcon(ClassLoader.getSystemResource("com/travalmanagementSystem/icons/home.jpg"));
//        Image image = i1.getImage().getScaledInstance(1200,900,Image.SCALE_DEFAULT);
//        i2 = new ImageIcon(image);
//        l1 = new JLabel(i2);
//        l1.setBounds(300,50,1200,900);
//        add(l1);

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(0, 0, 102));
        p1.setBounds(0, 0, 1950, 50);
        p1.setLayout(null);
        add(p1);
        l2 = new JLabel("Traval Turisom Management");
        l2.setBounds(20, 5, 300, 30);
        l2.setForeground(Color.WHITE);
        p1.add(l2);
        buttons();

    }

    public void buttons() {
        JPanel p2 = new JPanel();
        p2.setBounds(20, 50, 300, 1000);
//        p2.setBorder(BorderFactory.createEtchedBorder());
        p2.setBackground(new Color(0, 0, 102));
        p2.setLayout(null);
        add(p2);

        addDetails = new JButton("Add personal details");
        addDetails.setBounds(0, 0, 250, 25);
        addDetails.setBackground(new Color(0, 0, 102));
        addDetails.setForeground(Color.WHITE);
        addDetails.setMargin(new Insets(0, 0, 0, 100));
        addDetails.setFont(new Font("Raleway", Font.CENTER_BASELINE, 15));
        addDetails.addActionListener(this);
        p2.add(addDetails);

        updateDetails = new JButton("Update personal details");
        updateDetails.setBounds(0, 35, 250, 25);
        updateDetails.setBackground(new Color(0, 0, 102));
        updateDetails.setForeground(Color.WHITE);
        updateDetails.setMargin(new Insets(0, 0, 0, 100));
        updateDetails.setFont(new Font("Raleway", Font.CENTER_BASELINE, 15));
        updateDetails.addActionListener(this);
        p2.add(updateDetails);

        viewDetails = new JButton("View details");
        viewDetails.setBounds(0, 70, 250, 25);
        viewDetails.setBackground(new Color(0, 0, 102));
        viewDetails.setForeground(Color.WHITE);
        viewDetails.setMargin(new Insets(0, 0, 0, 150));
        viewDetails.setFont(new Font("Raleway", Font.CENTER_BASELINE, 15));
        viewDetails.addActionListener(this);
        p2.add(viewDetails);

        deleteDetails = new JButton("Delete personal details");
        deleteDetails.setBounds(0, 105, 250, 25);
        deleteDetails.setBackground(new Color(0, 0, 102));
        deleteDetails.setForeground(Color.WHITE);
        deleteDetails.setMargin(new Insets(0, 0, 0, 150));
        deleteDetails.setFont(new Font("Raleway", Font.CENTER_BASELINE, 15));
        deleteDetails.addActionListener(this);
        p2.add(deleteDetails);

        checkPackage = new JButton("Check Package");
        checkPackage.setBounds(0, 140, 250, 25);
        checkPackage.setBackground(new Color(0, 0, 102));
        checkPackage.setForeground(Color.WHITE);
        checkPackage.setMargin(new Insets(0, 0, 0, 150));
        checkPackage.setFont(new Font("Raleway", Font.CENTER_BASELINE, 15));
        checkPackage.addActionListener(this);
        p2.add(checkPackage);

        bookPackage = new JButton("Book Package");
        bookPackage.setBounds(0, 175, 250, 25);
        bookPackage.setBackground(new Color(0, 0, 102));
        bookPackage.setForeground(Color.WHITE);
        bookPackage.setMargin(new Insets(0, 0, 0, 150));
        bookPackage.setFont(new Font("Raleway", Font.CENTER_BASELINE, 15));
        bookPackage.addActionListener(this);
        p2.add(bookPackage);

        viewPackage = new JButton("View Package");
        viewPackage.setBounds(0, 205, 250, 25);
        viewPackage.setBackground(new Color(0, 0, 102));
        viewPackage.setForeground(Color.WHITE);
        viewPackage.setMargin(new Insets(0, 0, 0, 150));
        viewPackage.setFont(new Font("Raleway", Font.CENTER_BASELINE, 15));
        viewPackage.addActionListener(this);
        p2.add(viewPackage);

        viewHotels = new JButton("View Hotels");
        viewHotels.setBounds(0, 240, 250, 25);
        viewHotels.setBackground(new Color(0, 0, 102));
        viewHotels.setForeground(Color.WHITE);
        viewHotels.setMargin(new Insets(0, 0, 0, 150));
        viewHotels.setFont(new Font("Raleway", Font.CENTER_BASELINE, 15));
        viewHotels.addActionListener(this);
        p2.add(viewHotels);

        bookHotel = new JButton("Book Hotels");
        bookHotel.setBounds(0, 275, 250, 25);
        bookHotel.setBackground(new Color(0, 0, 102));
        bookHotel.setForeground(Color.WHITE);
        bookHotel.setMargin(new Insets(0, 0, 0, 150));
        bookHotel.setFont(new Font("Raleway", Font.CENTER_BASELINE, 15));
        bookHotel.addActionListener(this);
        p2.add(bookHotel);

        viewbookedHotels = new JButton("View Booked Hotels");
        viewbookedHotels.setBounds(0, 305, 250, 25);
        viewbookedHotels.setBackground(new Color(0, 0, 102));
        viewbookedHotels.setForeground(Color.WHITE);
        viewbookedHotels.setMargin(new Insets(0, 0, 0, 100));
        viewbookedHotels.setFont(new Font("Raleway", Font.CENTER_BASELINE, 15));
        viewbookedHotels.addActionListener(this);
        p2.add(viewbookedHotels);

        destination = new JButton("Destinations");
        destination.setBounds(0, 340, 250, 25);
        destination.setBackground(new Color(0, 0, 102));
        destination.setForeground(Color.WHITE);
        destination.setMargin(new Insets(0, 0, 0, 150));
        destination.setFont(new Font("Raleway", Font.CENTER_BASELINE, 15));
        destination.addActionListener(this);
        p2.add(destination);

        payment = new JButton("Payment");
        payment.setBounds(0, 375, 250, 25);
        payment.setBackground(new Color(0, 0, 102));
        payment.setForeground(Color.WHITE);
        payment.setMargin(new Insets(0, 0, 0, 200));
        payment.setFont(new Font("Raleway", Font.CENTER_BASELINE, 15));
        payment.addActionListener(this);
        p2.add(payment);

        cacli = new JButton("Caclulator");
        cacli.setBounds(0, 405, 250, 25);
        cacli.setBackground(new Color(0, 0, 102));
        cacli.setForeground(Color.WHITE);
        cacli.setMargin(new Insets(0, 0, 0, 200));
        cacli.setFont(new Font("Raleway", Font.CENTER_BASELINE, 15));
        cacli.addActionListener(this);
        p2.add(cacli);

        notepad = new JButton("Notepad");
        notepad.setBounds(0, 440, 250, 25);
        notepad.setBackground(new Color(0, 0, 102));
        notepad.setForeground(Color.WHITE);
        notepad.setMargin(new Insets(0, 0, 0, 200));
        notepad.setFont(new Font("Raleway", Font.CENTER_BASELINE, 15));
        notepad.addActionListener(this);
        p2.add(notepad);

        about = new JButton("About");
        about.setBounds(0, 475, 250, 25);
        about.setBackground(new Color(0, 0, 102));
        about.setForeground(Color.WHITE);
        about.setMargin(new Insets(0, 0, 0, 200));
        about.setFont(new Font("Raleway", Font.CENTER_BASELINE, 15));
        about.addActionListener(this);
        p2.add(about);

        l2 = new JLabel("Logged as " + username);
        l2.setBounds(0, 550, 250, 30);
        l2.setBackground(new Color(0, 0, 102));
        l2.setForeground(Color.WHITE);
        l2.setBorder(BorderFactory.createEtchedBorder());
        l2.setFont(new Font("Raleway", Font.CENTER_BASELINE, 15));
        p2.add(l2);

        logout = new JButton("Logout");
        logout.setBounds(0, 600, 250, 30);
        logout.setBackground(new Color(0, 0, 102));
        logout.setForeground(Color.WHITE);
        logout.setBorder(BorderFactory.createEtchedBorder());
        logout.setFont(new Font("Raleway", Font.CENTER_BASELINE, 15));
        logout.addActionListener(this);
        p2.add(logout);
    }


    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == addDetails) {
            new Add_customer(username).setVisible(true);
        } else if (event.getSource() == logout) {
            this.setVisible(false);
            new Login().setVisible(true);
        } else if (event.getSource() == updateDetails) {
            new Update_details(username).setVisible(true);
        } else if (event.getSource() == viewDetails) {
            new View_details(username).setVisible(true);
        } else if (event.getSource() == checkPackage) {
            new Check_package().setVisible(true);
        } else if (event.getSource() == bookPackage) {
            new Book_package(username).setVisible(true);
        } else if (event.getSource() == viewPackage) {
            new View_package(username).setVisible(true);
        }

    }

    public static void main(String[] args) {
        new Dashboard("").setVisible(true);
    }

}
