package org.ajay.designpatterns.strategy.model;

import org.ajay.designpatterns.strategy.model.BowlingStrategy;

public class Bowler {
    private final BowlingStrategy bowlingStrategy;

    public Bowler(BowlingStrategy bowlingStrategy) {
        this.bowlingStrategy = bowlingStrategy;
    }

    public void bowl(){
        for (int i=0; i<6; i++) {
            System.out.println(bowlingStrategy.getNextBall());
        }
    }
}
