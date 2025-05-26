package com.example.premierleagueapp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.premierleagueapp.model.Player;
import com.example.premierleagueapp.model.Team;

public interface PlayerRepository extends JpaRepository<Player, Long> {
	
    Optional<Player> findByPlayerId(Long playerId);
    
    Optional<Player> findByPlayerSurname(String playerSurname);
    
    Optional<Player> findByPlayerFirstName(String playerFirstName);
    
    Optional<Player> findByTeam(Team team);
}