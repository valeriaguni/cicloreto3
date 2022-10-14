package com.reto3.ciclo3.Controller;

import com.reto3.ciclo3.Entidad.Score;
import com.reto3.ciclo3.Service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Score")
public class ScoreController {

    @Autowired
    private ScoreService scoreService;

    @GetMapping("/all")

    public List<Score> getAllReserveQualifications() {
        return scoreService.getAllScores();
    }

    @PostMapping("/all")
    public List<Score> getAllReserveQualifications2() {
        return scoreService.getAllScores();
    }

    @GetMapping("/{id}")
    public Optional<Score> getReserveQualification(@PathVariable Integer id) {
        return scoreService.getScore(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Score saveReserveQualification(@RequestBody Score score) {
        return scoreService.saveScore(score);
    }
}