package com.revature.services;

import com.revature.entities.Score;

import java.util.List;

public interface ScoreService {

    Score addScore(Score score);

    List<Score> getScoresByInitials(String intials);

    List<Score> getScoresByPointsDescending();
}
