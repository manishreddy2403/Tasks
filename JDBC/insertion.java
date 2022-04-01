package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Collections;
import java.util.Scanner;

public class insertion {
    Connection connection= null;
    Statement statement=null;
    Scanner sc=new Scanner(System.in);

    public void insert() {


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student", "root", "Babulureddy2000@");
            statement = connection.createStatement();
            PreparedStatement preparedStatement = connection.prepareStatement("insert into book value(?,?)");
            System.out.print("enter book_id:");
            int id = sc.nextInt();
            System.out.print("\n enter book_name:");
            String name = sc.next();
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);

            preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
