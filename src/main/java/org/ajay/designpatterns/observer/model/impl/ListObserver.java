package org.ajay.designpatterns.observer.model.impl;

import org.ajay.designpatterns.observer.model.Observer;

import java.util.ArrayList;

public class ListObserver implements Observer<WeatherData> {
    private final ArrayList<WeatherData> arrayList = new ArrayList<>();
    @Override
    public void update(WeatherData weatherData) {
        arrayList.add(weatherData);
        System.out.print("StringObserver got update: ");
        arrayList.forEach(weatherData1 -> {
            System.out.printf("%s\t", weatherData1);
        });
        System.out.print("\n");
    }
}
