package com.example.playerservice.controller;

import com.example.playerservice.entity.Player;
import com.example.playerservice.entity.SportType;
import com.example.playerservice.exception.PlayerNotFoundException;
import com.example.playerservice.service.PlayerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/players")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Player addPlayer(@Valid @RequestBody Player player) {
        return playerService.addPlayer(player);
    }

    @PutMapping("/{playerId}")
    public Player updatePlayer(@PathVariable Long playerId, @Valid @RequestBody Player player) {
        return playerService.updatePlayer(playerId, player);
    }

    @GetMapping("/sportType/{sportType}")
    public List<Player> getAllPlayersBySportType(@PathVariable SportType sportType) {
        return playerService.getAllPlayersBySportType(sportType);
    }

    @GetMapping("/{playerId}")
    public ResponseEntity<Player> getPlayerById(@PathVariable Long playerId) {
        Player player = playerService.getPlayerById(playerId);
        return ResponseEntity.ok().body(player);
    }

    @DeleteMapping("/{playerId}")
    public ResponseEntity<Void> deletePlayer(@PathVariable Long playerId) {
        playerService.deletePlayer(playerId);
        return ResponseEntity.noContent().build();
    }

    // Exception handling
    @ExceptionHandler(value = { PlayerNotFoundException.class })
    protected ResponseEntity<Object> handlePlayerNotFoundException(PlayerNotFoundException ex) {
        return ResponseEntity.notFound().build();
    }

    // Other exception handlers
}
