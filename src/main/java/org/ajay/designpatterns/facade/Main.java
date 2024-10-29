package org.ajay.designpatterns.facade;

import org.ajay.designpatterns.facade.model.Light;
import org.ajay.designpatterns.facade.model.MovieModeFacade;
import org.ajay.designpatterns.facade.model.Speaker;
import org.ajay.designpatterns.facade.model.TV;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        Speaker speaker = new Speaker();
        Light light = new Light();
        MovieModeFacade facade = new MovieModeFacade(tv, speaker, light);
        facade.turnOn();
        facade.turnOff();
    }
}
