package com.service;

import com.model.Team;

import java.sql.SQLException;
import java.util.List;

public interface TeamService {

    List<Team> getTeam() throws SQLException;
    Team getTeamById(int teamId);
    Team createTeam(Team team);
    Team deleteTeam(Team team);
    Team updateTeam(Team team);
}
