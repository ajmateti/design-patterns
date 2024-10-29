package org.ajay.designpatterns.facade.model;

public class MovieModeFacade {
    private final TV tv;
    private final Speaker speaker;
    private final Light light;

    public MovieModeFacade(TV tv, Speaker speaker, Light light) {
        this.tv = tv;
        this.speaker = speaker;
        this.light = light;
    }

    public void turnOn() {
        System.out.println("MovieMode turning on!");
        tv.turnOn();
        speaker.setVolume(50);
        light.turnOn();
    }

    public void turnOff() {
        System.out.println("MovieMode turning off!");
        tv.turnOff();
        speaker.setVolume(10);
        light.turnOff();
    }
}
