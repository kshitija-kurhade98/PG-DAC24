package com.example.playerservice.service;

import java.util.List;

import com.example.playerservice.entity.Player;
import com.example.playerservice.entity.SportType;

public interface PlayerService {
    Player addPlayer(Player player);
    Player updatePlayer(Long playerId, Player player);
    List<Player> getAllPlayersBySportType(SportType sportType);
    Player getPlayerById(Long playerId);
    void deletePlayer(Long playerId);
}
