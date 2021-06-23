package com.revature.entities;

// Java Bean
public class Score {

    private int sId;
    private String initials;
    private int points;

    public Score() {
    }

    public Score(int sId, String initials, int points) {
        this.sId = sId;
        this.initials = initials;
        this.points = points;
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Score{" +
                "sId=" + sId +
                ", initials='" + initials + '\'' +
                ", points=" + points +
                '}';
    }
}
