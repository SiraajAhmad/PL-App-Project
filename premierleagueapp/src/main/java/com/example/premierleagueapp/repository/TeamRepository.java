package com.example.premierleagueapp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.premierleagueapp.model.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {
	
    Optional<Team> findByTeamId(Long teamId);
    
    Optional<Team> findByTeamName(String teamName);
    
}