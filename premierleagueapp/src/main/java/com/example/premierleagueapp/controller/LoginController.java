package com.example.premierleagueapp.controller;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.premierleagueapp.model.LoginRequest;
import com.example.premierleagueapp.service.UserService;

@RestController
@RequestMapping("/api/auth")
public class LoginController {

    private final UserService userService;
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public LoginController(UserService userService) {
        this.userService = userService;
    }
	    
	
    @PostMapping("/login")
    public ResponseEntity<Map<String, String>> login(@RequestBody LoginRequest loginRequest) {
    	String siteAdminEmail = "admin@pl.com";
    	String siteAdminPassword = "#PLSitePassword1";
    	
    	if(siteAdminEmail.equals(loginRequest.getEmail()) && siteAdminPassword.equals(loginRequest.getPassword())) {
            return ResponseEntity.ok().body(Map.of("role", "admin"));
    	}   
    	try {
            UserDetails userDetails = userService.loadUserByEmail(loginRequest.getEmail());
            if (userDetails != null && passwordEncoder.matches(loginRequest.getPassword(), userDetails.getPassword())) {
				
                return ResponseEntity.ok().body(Map.of("role", "user"));

            } else {
                return ResponseEntity.badRequest().body(Map.of("error", "Invalid username or password"));
            }
        } catch (AuthenticationException e) {
            return ResponseEntity.badRequest().body(Map.of("error", "Invalid username or password"));
        }
    }
}
