package org.ajay.designpatterns.facade.model;

public class Speaker {
    public void turnOn() {
        System.out.println("Speaker turned on!");
    }

    public void turnOff() {
        System.out.println("Speaker turned off!");
    }

    public void setVolume(int volume) {
        System.out.printf("Speaker volume set to %s\n", volume);
    }
}
