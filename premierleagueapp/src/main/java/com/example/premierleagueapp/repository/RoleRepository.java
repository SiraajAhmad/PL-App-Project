package com.example.premierleagueapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.premierleagueapp.model.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findById(Long id);
    
    Optional<Role> findByName(String name);

}
