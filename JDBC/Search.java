package com.jdbc;

import com.mysql.cj.jdbc.SuspendableXAConnection;

import java.sql.*;
import java.util.Scanner;

public class Search {
    Connection connection= null;
    Statement statement=null;
    Scanner sc=new Scanner(System.in);

    public void search() {


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student", "root", "Babulureddy2000@");
            statement = connection.createStatement();
            System.out.print("enter book id to search:");
            int ser = sc.nextInt();
            ResultSet resultSet2 = statement.executeQuery("select name from book where id=" + ser);
            if (resultSet2.next()) {
                System.out.println("book found");
                PreparedStatement preparedStatement2 = connection.prepareStatement("select name  from book where id=" + ser);
                System.out.println("book_name: " + resultSet2.getString(1));
                preparedStatement2.execute();
            }
            else
                System.out.println("book not found");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
