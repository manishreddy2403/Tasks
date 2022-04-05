package com.service;

import com.model.Player;

import java.sql.SQLException;
import java.util.List;

public interface PlayerService {
    List<Player> getPlayer() throws SQLException;
    Player getPlayerId(int playerId);
    List<Player> SortPlayer();
}
