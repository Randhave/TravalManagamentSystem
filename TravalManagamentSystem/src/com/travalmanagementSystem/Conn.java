package com.travalmanagementSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {
    Connection connection;
    Statement statement;

    Conn() {
        try {
            // load te driver
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);

            // creating a connection
            String url = "jdbc:mysql://localhost:3306/tms";
            String username = "root";
            String password = "javasql@1921261242054";

            connection = DriverManager.getConnection(url, username, password);
            statement =  connection.createStatement();
            if (connection.isClosed()){
                System.out.println("db not conncted");
            } else{
                System.out.println("database connected");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Conn();
    }
}
