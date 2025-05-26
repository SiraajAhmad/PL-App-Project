package com.example.premierleagueapp.service;

import org.springframework.stereotype.Service;

import com.example.premierleagueapp.model.Referee;
import com.example.premierleagueapp.repository.RefereeRepository;

import java.util.List;
import java.util.Optional;

@Service
public class RefereeService {

    private final RefereeRepository refereeRepository;

    public RefereeService(RefereeRepository refereeRepository) {
        this.refereeRepository = refereeRepository;
    }

    public List<Referee> getAllReferees() {
        return refereeRepository.findAll();
    }

    public Optional<Referee> getRefereeById(Long refereeId) {
        return refereeRepository.findByRefereeId(refereeId);
    }

    public Referee createReferee(Referee referee) {
        return refereeRepository.save(referee);
    }

}
