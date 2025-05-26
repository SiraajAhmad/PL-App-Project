package com.example.premierleagueapp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.premierleagueapp.model.Role;
import com.example.premierleagueapp.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
    Optional<User> findByUserID(Long userID);
    
    Optional<User> findBySurname(String surname);
    
    Optional<User> findByFirstName(String firstName);
    
    Optional<User> findByEmail(String email);
    
    Optional<User> findByRole (Role role);

	boolean existsByEmail(String email);
}
