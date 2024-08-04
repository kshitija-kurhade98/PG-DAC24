package com.example.playerservice.repository;

import com.example.playerservice.entity.Player;
import com.example.playerservice.entity.SportType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
    List<Player> findBySportType(SportType sportType);
}

