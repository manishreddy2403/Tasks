package com.jdbc;


import java.util.Scanner;

public class library {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);

            while(true){
                System.out.println(" Action to perform \n1)insertion \n2)Display \n3)Delete \n4)search ");
                int s= sc.nextInt();
                switch (s) {
                    case 1:
                       insertion ins=new insertion();
                       ins.insert();

                        break;

                    case 2:
                        Display dis =new Display();
                        dis.display();

                        break;

                    case 3:
                       Delete del=new Delete();
                       del.delete();

                        break;

                    case 4:
                       Search searc=new Search();
                       searc.search();
                            break;
                        }
                }


            }


//
//        catch (Exception e){
//            e.printStackTrace();
//
//        }finally {
//            try {
//                if(statement !=null){
//                    statement.close();
//                }
//            }catch (SQLException e){
//                e.printStackTrace();
//            }
//            try {
//                if (connection != null){
//                    connection.close();
//                }
//            } catch (SQLException e){
//                e.printStackTrace();
//            }
        }



//  to insert
//            statement.executeUpdate("insert into student values(107,'prashanth','sangareddy')");

// to give input or scanner
//            PreparedStatement preparedStatement=connection.prepareStatement("insert into student value(?,?,?)");
//            Scanner sc=new Scanner(System.in);
//            System.out.print("enter Student_id:");
//            int id=sc.nextInt();
//            System.out.print("\nenter Student_name:");
//            String name=sc.next();
//            System.out.print("\nenter Student_add:");
//            String address=sc.next();
//             preparedStatement.setInt(1,id);
//             preparedStatement.setString(2,name);
//             preparedStatement.setString(3,address);
//
//            preparedStatement.execute();
//            ResultSet resultSet=statement.executeQuery("select *from student");
//
//            while (resultSet.next()){
//                System.out.println("student_id: "+resultSet.getInt("id"));
//                System.out.println("Student_name:"+resultSet.getString(2));
//                System.out.println("Student_address: "+resultSet.getString(3));
//            }
