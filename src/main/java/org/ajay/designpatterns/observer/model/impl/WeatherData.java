package org.ajay.designpatterns.observer.model.impl;

public class WeatherData {
    private int temperature;
    private int humidity;


    public WeatherData(int temperature, int humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
    }

    @Override
    public String toString() {
        return "WeatherData{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                '}';
    }
}
