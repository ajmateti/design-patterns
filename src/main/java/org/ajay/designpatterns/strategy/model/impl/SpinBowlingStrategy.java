package org.ajay.designpatterns.strategy.model.impl;

import org.ajay.designpatterns.strategy.enums.BallType;
import org.ajay.designpatterns.strategy.model.BowlingStrategy;

import java.util.List;
import java.util.Random;

public class SpinBowlingStrategy implements BowlingStrategy {
    private final List<BallType> options = List.of(BallType.OFF_SPIN, BallType.LEG_SPIN, BallType.GOOGLY, BallType.CARROM);
    @Override
    public BallType getNextBall() {
        int option = new Random().nextInt(options.size());
        return options.get(option);
    }
}
