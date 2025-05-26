package com.example.premierleagueapp.service;

import org.springframework.stereotype.Service;

import com.example.premierleagueapp.model.Fixture;
import com.example.premierleagueapp.repository.FixtureRepository;

import java.util.List;
import java.util.Optional;

@Service
public class FixtureService {

    private final FixtureRepository fixtureRepository;

    public FixtureService(FixtureRepository fixtureRepository) {
        this.fixtureRepository = fixtureRepository;
    }

    public List<Fixture> getAllFixtures() {
        return fixtureRepository.findAll();
    }

    public Optional<Fixture> getFixtureById(Long fixtureId) {
        return fixtureRepository.findById(fixtureId);
    }

    public Fixture createFixture(Fixture fixture) {
        return fixtureRepository.save(fixture);
    }

}
