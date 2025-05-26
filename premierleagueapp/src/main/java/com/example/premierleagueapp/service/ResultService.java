package com.example.premierleagueapp.service;

import org.springframework.stereotype.Service;

import com.example.premierleagueapp.model.Result;
import com.example.premierleagueapp.repository.ResultRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ResultService {

    private final ResultRepository resultRepository;

    public ResultService(ResultRepository resultRepository) {
        this.resultRepository = resultRepository;
    }

    public List<Result> getAllResults() {
        return resultRepository.findAll();
    }

    public Optional<Result> getResultById(Long resultId) {
        return resultRepository.findByResultId(resultId);
    }

    public Result createResult(Result result) {
        return resultRepository.save(result);
    }

}
