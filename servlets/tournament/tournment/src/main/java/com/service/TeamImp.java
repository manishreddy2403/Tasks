package com.service;

import com.model.Team;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static com.service.connectionToDb.*;

public class TeamImp implements TeamService {
    Connection connection = null;
    Statement statement = null;
    public connectionToDb connectionToDb = new connectionToDb();


    @Override
    public List<Team> getteam() throws SQLException {
        try {
            connection = getConnection();
            ResultSet resultSet = getTeamList();

//            System.out.println(resultSet.toString());

            List<Team> teamList = new ArrayList<>();
            while (resultSet.next()) {
                Team tm = new Team();
                tm.setTeamId(resultSet.getInt(1));
                tm.setCaptainName(resultSet.getString(2));
                tm.setTeamName(resultSet.getString(3));
                tm.setTeamMember(resultSet.getInt(4));
                teamList.add(tm);
            }
            return teamList;

        } catch (Exception e) {

            return null;

        }

    }


    @Override
    public Team getTeamId(int teamId) throws SQLException {
        try {
            connection = getConnection();

            ResultSet resultSet = getTeamById(teamId);
            Team team = new Team();
            team.setTeamId(resultSet.getInt(1));
            team.setTeamName(resultSet.getString(2));
            team.setCaptainName(resultSet.getString(3));
            team.setTeamMember(resultSet.getInt(4));
            logger.info("id2" + team.getTeamId());
            return team;

        } catch (Exception e) {

        }
        return null;
    }

    @Override
    public Team createTeam(Team team) throws SQLException {
        try {
            connection = getConnection();
            createTeamList(team);
            return team;
        } catch (Exception e) {

            return null;

        }
    }

    @Override
    public Team deleteTeam(Team team)  {
        try {
            deleteTeamList(team);
            logger.info("delete" + connection.toString());

            return  team;

        } catch (Exception e) {


        }
        return null;
    }

    @Override
    public List<Team> SortTeam() {
        return null;
    }

//    @Override
//    public List<Team> SortTeam() {
//        try{
//            connection=getConnection();
//            List<Team>teamList=new ArrayList<>();
//            ResultSet resultSet=sortTeamList();
//            while (resultSet.next()) {
//                Team team = new Team();
//                team.setTeamId(resultSet.getInt(1));
//                team.setTeamName(resultSet.getString(2));
//                team.setCaptainName(resultSet.getString(3));
//                team.setTeamMember(resultSet.getInt(4));
//                teamList.add(team);
//
//
//            }
//            return teamList;
//        }catch (Exception e){
//
//        }
//
//
//        return null;
//    }
}
