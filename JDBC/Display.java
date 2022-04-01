package com.jdbc;

import java.sql.*;
import java.util.Scanner;

public class Display {
    Connection connection= null;
    Statement statement=null;
    Scanner sc =new Scanner(System.in);

    public void display() {


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student", "root", "Babulureddy2000@");
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select *from book");

            while (resultSet.next()) {

                System.out.println("student_id: " + resultSet.getInt("id"));
                System.out.println("Student_name:" + resultSet.getString("name"));
                System.out.println("-----------------------------------------------" );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

