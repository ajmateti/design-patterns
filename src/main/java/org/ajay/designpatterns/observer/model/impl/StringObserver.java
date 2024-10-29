package org.ajay.designpatterns.observer.model.impl;

import org.ajay.designpatterns.observer.model.Observer;

public class StringObserver implements Observer<WeatherData> {
    @Override
    public void update(WeatherData weatherData) {
        System.out.printf("StringObserver got update : %s\n", weatherData);
    }
}
