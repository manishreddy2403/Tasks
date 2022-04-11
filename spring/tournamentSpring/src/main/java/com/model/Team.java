package com.model;

import javax.persistence.*;

@Entity
@Table(name="`team`")
public class Team {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int teamId;

    @Column(name="team_name")
    String teamName;

    @Column(name="captain_name")
    String captainName;

    @Column(name="player_count")
    int teamMembers;

    public Team(){}

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getCaptainName() {
        return captainName;
    }

    public void setCaptainName(String captainName) {
        this.captainName = captainName;
    }

    public int getTeamMembers() {
        return teamMembers;
    }

    public void setTeamMembers(int teamMembers) {
        this.teamMembers = teamMembers;
    }


}
