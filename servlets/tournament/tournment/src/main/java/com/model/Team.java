package com.model;

public class Team {
    int teamId;
    String teamName;
    String  captainName;
    int teamMember;

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

    public int getTeamMember() {
        return teamMember;
    }

    public void setTeamMember(int teamMember) {
        this.teamMember = teamMember;
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamId=" + teamId +
                ", teamName='" + teamName + '\'' +
                ", captainName='" + captainName + '\'' +
                ", teamMember=" + teamMember +
                '}';
    }
}
