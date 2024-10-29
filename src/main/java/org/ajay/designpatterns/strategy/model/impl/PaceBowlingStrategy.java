package org.ajay.designpatterns.strategy.model.impl;

import org.ajay.designpatterns.strategy.enums.BallType;
import org.ajay.designpatterns.strategy.model.BowlingStrategy;

import java.util.List;
import java.util.Random;

public class PaceBowlingStrategy implements BowlingStrategy {
    private final List<BallType> options = List.of(BallType.SHORT, BallType.IN_SWING, BallType.OUT_SWING, BallType.YORKER);
    @Override
    public BallType getNextBall() {
        int option = new Random().nextInt(options.size());
        return options.get(option);
    }
}
