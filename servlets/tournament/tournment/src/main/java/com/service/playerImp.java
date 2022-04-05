package com.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.model.Player;
import com.model.Team;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static com.service.connectionToDb.*;

public class playerImp implements PlayerService{
    Connection connection=null;
    Statement statement=null;

    public connectionToDb connectionToDb=new connectionToDb();

    @Override
    public List<Player> getPlayer() throws SQLException {

        try {


            connection = getConnection();
            ResultSet resultSet = getPlayerList();
            List<Player> playerList = new ArrayList<>();
            while (resultSet.next()) {
                Player p = new Player();
                p.setPlayerId(resultSet.getInt(1));
                p.setPlayerName(resultSet.getString(2));
                p.setAge(resultSet.getInt(3));
                playerList.add(p);

            }
            return playerList;
        }catch (Exception e){
            return null;
        }


    }

    @Override
    public Player getPlayerId(int playerId) {
        return null;
    }

    @Override
    public List<Player> SortPlayer() {
        try {
            connection = getConnection();
            ResultSet resultSet = sortPlayerList();
            List<Player> playerList = new ArrayList<>();
            while (resultSet.next()) {
                Player player = new Player();
                player.setPlayerId(resultSet.getInt(1));
                player.setPlayerName(resultSet.getString(2));
                player.setAge(resultSet.getInt(3));

                playerList.add(player);
                logger.info("jgbj"+playerList.toString());
            }
            return playerList;
        } catch (Exception e) {

        }


        return null;
    }

}
