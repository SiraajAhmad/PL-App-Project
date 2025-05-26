package com.example.premierleagueapp.service;

import org.springframework.stereotype.Service;

import com.example.premierleagueapp.model.Team;
import com.example.premierleagueapp.repository.TeamRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TeamService {

    private final TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public List<Team> getAllTeams() {
        return teamRepository.findAll();
    }

    public Optional<Team> getTeamById(Long teamId) {
        return teamRepository.findByTeamId(teamId);
    }

    public Team createTeam(Team team) {
        return teamRepository.save(team);
    }

}
