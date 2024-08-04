package com.example.playerservice.service;

import com.example.playerservice.entity.Player;
import com.example.playerservice.entity.SportType;
import com.example.playerservice.exception.PlayerNotFoundException;
import com.example.playerservice.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    @Override
    public Player addPlayer(Player player) {
        return playerRepository.save(player);
    }

    @Override
    public Player updatePlayer(Long playerId, Player player) {
        Optional<Player> existingPlayer = playerRepository.findById(playerId);
        if (existingPlayer.isPresent()) {
            player.setPlayerId(playerId);
            return playerRepository.save(player);
        } else {
            throw new PlayerNotFoundException("Player not found with id: " + playerId);
        }
        
    }

    @Override
    public List<Player> getAllPlayersBySportType(SportType sportType) {
        return playerRepository.findBySportType(sportType);
    }

    @Override
    public Player getPlayerById(Long playerId) {
        return playerRepository.findById(playerId)
                .orElseThrow(() -> new PlayerNotFoundException("Player not found with id: " + playerId));
    }

    @Override
    public void deletePlayer(Long playerId) {
        playerRepository.deleteById(playerId);
    }
}
