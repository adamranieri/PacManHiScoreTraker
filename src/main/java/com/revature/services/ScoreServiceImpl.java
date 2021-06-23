package com.revature.services;

import com.revature.daos.ScoreDAO;
import com.revature.entities.Score;

import java.util.Collections;
import java.util.List;

public class ScoreServiceImpl implements ScoreService {

    private ScoreDAO scoreDAO = null;

    public ScoreServiceImpl(ScoreDAO scoreDAO) {
        this.scoreDAO = scoreDAO;
    }

    @Override
    public Score addScore(Score score) {
        return null;
    }

    @Override
    public List<Score> getScoresByInitials(String intials) {
        return null;
    }

    @Override
    public List<Score> getScoresByPointsDescending() {
        List<Score> scores = this.scoreDAO.getAllScores();
        Collections.sort(scores, (a,b) ->{
            if(a.getPoints() < b.getPoints()){
                return  1;
            }
            if(a.getPoints() > b.getPoints()){
                return  -1;
            }
            return 0;
        });
        return scores;
    }
}
