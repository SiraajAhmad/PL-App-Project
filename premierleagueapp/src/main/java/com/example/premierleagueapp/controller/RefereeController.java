package com.example.premierleagueapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.premierleagueapp.model.Referee;
import com.example.premierleagueapp.service.RefereeService;

import java.util.List;

@RestController
@RequestMapping("/api/referees")
public class RefereeController {

    private final RefereeService refereeService;

    public RefereeController(RefereeService refereeService) {
        this.refereeService = refereeService;
    }

    @GetMapping
    public List<Referee> getAllReferees() {
        return refereeService.getAllReferees();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Referee> getRefereeById(@PathVariable Long id) {
        return refereeService.getRefereeById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Referee> createReferee(@RequestBody Referee referee) {
        Referee createdReferee = refereeService.createReferee(referee);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdReferee);
    }

}
