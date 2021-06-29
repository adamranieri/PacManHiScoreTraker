package com.revature.services;

import com.revature.entities.Score;

import java.util.List;
// meaningless comment 2.0
public interface ScoreService {

    Score addScore(Score score);

    List<Score> getScoresByInitials(String intials);

    List<Score> getScoresByPointsDescending();
}
