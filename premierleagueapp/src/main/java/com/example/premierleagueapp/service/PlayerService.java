package com.example.premierleagueapp.service;

import org.springframework.stereotype.Service;

import com.example.premierleagueapp.model.Player;
import com.example.premierleagueapp.repository.PlayerRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {

    private final PlayerRepository playerRepository;

    
    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    public Optional<Player> getPlayerById(Long playerId) {
        return playerRepository.findByPlayerId(playerId);
    }

    public Player createPlayer(Player player) {
        return playerRepository.save(player);
    }

}
