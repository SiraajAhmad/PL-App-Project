package com.example.premierleagueapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.premierleagueapp.configuration.ErrorResponse;
import com.example.premierleagueapp.configuration.SuccessResponse;
import com.example.premierleagueapp.model.RegistrationRequest;
import com.example.premierleagueapp.model.User;
import com.example.premierleagueapp.service.UserService;

@RestController
@RequestMapping("/api/auth")
public class RegistrationController {

    private final UserService userService;

    public RegistrationController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody RegistrationRequest registrationRequest) {
        if (userService.existsByEmail(registrationRequest.getEmail())) {
            ErrorResponse errorResponse = new ErrorResponse("Email is already taken");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
        }

        User user = new User( registrationRequest.getFirstName(), registrationRequest.getSurname(), registrationRequest.getPassword(),registrationRequest.getEmail(), registrationRequest.getRole());
        userService.createUser(user);
        SuccessResponse successResponse = new SuccessResponse("User registered successfully");
        return ResponseEntity.status(HttpStatus.CREATED).body(successResponse);
    }
}
