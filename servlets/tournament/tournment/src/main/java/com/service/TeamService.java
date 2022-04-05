package com.service;

import com.model.Team;

import java.sql.SQLException;
import java.util.List;

public interface TeamService {
    List<Team> getteam() throws SQLException;
    Team  getTeamId(int teamId) throws SQLException;
    Team createTeam(Team team) throws SQLException;
    Team deleteTeam(Team team) throws SQLException;
    List<Team> SortTeam();



}


