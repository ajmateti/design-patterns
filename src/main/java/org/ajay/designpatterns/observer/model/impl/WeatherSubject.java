package org.ajay.designpatterns.observer.model.impl;

import org.ajay.designpatterns.observer.model.Observer;
import org.ajay.designpatterns.observer.model.Subject;

import java.util.HashSet;

public class WeatherSubject implements Subject<WeatherData> {
    private final HashSet<Observer<WeatherData>> observers = new HashSet<>();
    private WeatherData weatherData;

    @Override
    public void addObserver(Observer<WeatherData> observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer<WeatherData> observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(weatherData));
    }

    public void setData(WeatherData weatherData) {
        this.weatherData = weatherData;
        notifyObservers();
    }
}
