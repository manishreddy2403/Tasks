package com.jdbc;

import java.sql.*;
import java.util.Scanner;

public class Delete {
    Connection connection= null;
    Statement statement=null;
    Scanner sc=new Scanner(System.in);

    public void delete() {


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student", "root", "Babulureddy2000@");
            statement = connection.createStatement();
            System.out.print("enter book id to delete:");
            int del = sc.nextInt();

            ResultSet resultSet=statement.executeQuery("select name from book where id="+del);
            if(resultSet.next()) {
                PreparedStatement preparedStatement1 = connection.prepareStatement("delete from book where id=" + del);
                preparedStatement1.execute();

                System.out.println("successfully deleted");
            }
            else
                System.out.println("row not found");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("there is no row");
        }
    }
}
