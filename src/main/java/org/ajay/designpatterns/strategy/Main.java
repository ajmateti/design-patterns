package org.ajay.designpatterns.strategy;

import org.ajay.designpatterns.strategy.model.Bowler;
import org.ajay.designpatterns.strategy.model.impl.PaceBowlingStrategy;
import org.ajay.designpatterns.strategy.model.impl.SpinBowlingStrategy;

public class Main {
    public static void main(String[] args) {
        Bowler ashwin = new Bowler(new SpinBowlingStrategy());
        Bowler bumrah = new Bowler(new PaceBowlingStrategy());
        System.out.println("\n\nAshwin\n");
        ashwin.bowl();
        System.out.println("\n\nBumrah\n");
        bumrah.bowl();
    }
}
