package org.ajay.designpatterns.observer;

import org.ajay.designpatterns.observer.model.Observer;
import org.ajay.designpatterns.observer.model.Subject;
import org.ajay.designpatterns.observer.model.impl.ListObserver;
import org.ajay.designpatterns.observer.model.impl.StringObserver;
import org.ajay.designpatterns.observer.model.impl.WeatherData;
import org.ajay.designpatterns.observer.model.impl.WeatherSubject;

public class Main {
    public static void main(String[] args) {
        Subject<WeatherData> subject = new WeatherSubject();
        Observer<WeatherData> stringObserver = new StringObserver();
        Observer<WeatherData> listObserver = new ListObserver();

        subject.setData(new WeatherData(36, 0));


        subject.addObserver(stringObserver);
        subject.addObserver(listObserver);

        subject.setData(new WeatherData(35, 10));
        subject.setData(new WeatherData(34, 20));

    }
}
