package org.ajay.designpatterns.strategy.model;

import org.ajay.designpatterns.strategy.enums.BallType;

public interface BowlingStrategy {
    BallType getNextBall();
}
