package com.example.premierleagueapp.repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.premierleagueapp.model.Fixture;

public interface FixtureRepository extends JpaRepository<Fixture, Long> {
	
    Optional<Fixture> findById(Long matchId);
    
    Optional<Fixture> findByMatchDate(Date matchDate);
    
    List<Fixture> findAll();

        
}