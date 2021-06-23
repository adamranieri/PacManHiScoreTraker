package com.revature.servicetests;

import com.revature.daos.ScoreDAO;
import com.revature.entities.Score;
import com.revature.services.ScoreService;
import com.revature.services.ScoreServiceImpl;
import org.mockito.Mockito;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ScoreServiceTests {

    static ScoreDAO scoreDAO = Mockito.mock(ScoreDAO.class);
    static ScoreService scoreService = new ScoreServiceImpl(scoreDAO);

    @BeforeMethod
    static void setup(){
        Score score1  = new Score(0,"ACR",1000);
        Score score2 = new Score(0,"AAA",5555);
        Score score3 = new Score(0,"TIM",3000);
        List<Score> scores = new ArrayList<>();
        scores.add(score1);
        scores.add(score2);
        scores.add(score3);
        Mockito.when(scoreDAO.getAllScores()).thenReturn(scores);
    }

    @Test
    void pointOrdering(){
        List<Score> scores = scoreService.getScoresByPointsDescending();
        int curPoints = scores.get(0).getPoints();

        for(Score score : scores){
            if(score.getPoints()<= curPoints){
                curPoints = score.getPoints();
            }else{
                Assert.fail("Points did not descend in value");
            }
        }

    }


}
