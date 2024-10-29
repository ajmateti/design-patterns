package org.ajay.designpatterns.observer.model;

import org.ajay.designpatterns.observer.model.impl.WeatherData;

public interface Subject<T> {
    void addObserver(Observer<T> observer);
    void removeObserver(Observer<T> observer);
    void notifyObservers();
    void setData(T t);
}
