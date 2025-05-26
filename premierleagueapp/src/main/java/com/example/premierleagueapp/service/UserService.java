package com.example.premierleagueapp.service;

import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.premierleagueapp.model.Role;
import com.example.premierleagueapp.model.User;
import com.example.premierleagueapp.repository.RoleRepository;
import com.example.premierleagueapp.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, RoleRepository roleRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public Optional<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long userId) {
        return userRepository.findByUserID(userId);
    }

    public User createUser(User user) {
    	Role userRole = roleRepository.findById(1L).orElseThrow(() -> new RuntimeException("Default role not found"));

        user.setFirstName(user.getFirstName());
        user.setSurname(user.getSurname());
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setEmail(user.getEmail());
        user.setRoles(userRole);

        return userRepository.save(user);
    }

	public User loadUserByEmail(String email) {
		// TODO Auto-generated method stub
		return userRepository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("User not found with email: " + email));
   	}

	public boolean existsByEmail(String email) {
		// TODO Auto-generated method stub
        return userRepository.existsByEmail(email);
	}

	
}
