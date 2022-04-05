package com.service;


import com.model.Team;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;

public class connectionToDb {
    public static Logger logger= LoggerFactory.getLogger(connectionToDb.class);
    public  static Connection connection = null;
    public static Statement statement = null;
  public  static Connection getConnection() {

      try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/tournament", "root", "Babulureddy2000@");
          logger.info("Connection Odject"+connection.toString());
          statement = connection.createStatement();
          return connection;

      } catch (Exception e) {
          e.printStackTrace();
          return null;
      }

  }

  public static ResultSet getTeamList() throws SQLException {

      ResultSet resultSet= statement.executeQuery("select * from team");

      return resultSet;

  }

  public static ResultSet getTeamById(int teamId ) throws SQLException {
      ResultSet resultSet=statement.executeQuery("select * from team where id="+ teamId);
      logger.info("id "+connection.toString());
      return  resultSet;
  }

  public static  ResultSet getPlayerList() throws SQLException {
      ResultSet resultSet=statement.executeQuery("select *from player");

      return resultSet;
  }



  public static  void createTeamList(Team team) throws SQLException {
      PreparedStatement preparedStatement = connection.prepareStatement("insert into team value(?,?,?,?)");
      preparedStatement.setInt(1,team.getTeamId());
      preparedStatement.setString(2,team.getTeamName());
      preparedStatement.setString(3,team.getCaptainName());
      preparedStatement.setInt(4,team.getTeamMember());
      preparedStatement.executeUpdate();


  }

  public  static void deleteTeamList(Team team) throws SQLException {

          connection = getConnection();
          logger.info("connection"+getConnection().toString());
          PreparedStatement preparedStatement = connection.prepareStatement("delete from team where id=?");
          preparedStatement.setInt(1,team.getTeamId());
          preparedStatement.executeUpdate();



  }


  public  static  ResultSet  sortPlayerList() throws SQLException {

      connection=getConnection();
      ResultSet resultSet=statement.executeQuery("SELECT * FROM player ORDER BY name ASC;");

      return  resultSet;
  }



}







