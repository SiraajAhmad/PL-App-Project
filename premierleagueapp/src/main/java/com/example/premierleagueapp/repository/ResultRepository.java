package com.example.premierleagueapp.repository;

import java.util.Date;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.premierleagueapp.model.Referee;
import com.example.premierleagueapp.model.Result;

public interface ResultRepository extends JpaRepository<Result, Long> {
	
    Optional<Result> findByResultId(Long resultId);
    
    Optional<Result> findByResultDate(Date resultDate);
    
    Optional<Result> findByReferee(Referee referee);
            
}