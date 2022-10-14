package com.reto3.ciclo3.Service;

import com.reto3.ciclo3.Entidad.Score;
import com.reto3.ciclo3.Repository.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ScoreService {

    @Autowired
    private ScoreRepository scoreRepository;

    public List<Score> getAllScores(){
        return scoreRepository.getAllScores();
    }

    public Optional<Score> getScore(Integer id){
        return scoreRepository.getScore(id);
    }

    public Score saveScore(Score score){
        return scoreRepository.saveScore(score);
    }
}