package com.model;

public class Player {
    int playerId;
    String playerName;
    int age;

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "player{" +
                "playerId=" + playerId +
                ", playerNmae='" + playerName + '\'' +
                ", age=" + age +
                '}';
    }
}
