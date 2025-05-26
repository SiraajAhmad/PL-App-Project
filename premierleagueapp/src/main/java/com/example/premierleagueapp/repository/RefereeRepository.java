package com.example.premierleagueapp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.premierleagueapp.model.Referee;

public interface RefereeRepository extends JpaRepository<Referee, Long> {
	
    Optional<Referee> findByRefereeId(Long RefereeId);
    
    Optional<Referee> findByRefereeSurname(String RefereeSurname);
    
    Optional<Referee> findByRefereeFirstName(String RefereeFirstName);
    
}