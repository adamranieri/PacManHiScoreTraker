package com.revature.daos;

import com.revature.entities.Score;

import java.util.List;

public interface ScoreDAO {

    //CREATE
    Score createScore(Score score);

    //READ
    Score getScoreById(int id);
    List<Score> getAllScores();

    //UPDATE
    Score updateScore(Score score);

    //DELETE
    boolean deleteScoreById(int id);


}
