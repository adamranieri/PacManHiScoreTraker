package com.revature.daotests;

import com.revature.entities.Score;
import com.revature.daos.ScoreDAO;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ScoreDaoTests {
    public static ScoreDAO scoreDAO = null;

    @Test
    void createScore(){
        Score score = new Score(0,"ACR",10000);
        scoreDAO.createScore(score);
        Assert.assertNotEquals(score.getsId(),0);

    }


}
