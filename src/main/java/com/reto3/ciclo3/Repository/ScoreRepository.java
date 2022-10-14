package com.reto3.ciclo3.Repository;

import com.reto3.ciclo3.CrudRepository.ScoreCrudRepository;
import com.reto3.ciclo3.Entidad.Score;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ScoreRepository {

    @Autowired
    private ScoreCrudRepository scoreCrudRepository;

    public List<Score> getAllScores() {
        return (List<Score>) scoreCrudRepository.findAll();
    }

    public Optional<Score> getScore(Integer id) {
        return scoreCrudRepository.findById(id);
    }

    public Score saveScore(Score score){
        return scoreCrudRepository.save(score);
    }
}