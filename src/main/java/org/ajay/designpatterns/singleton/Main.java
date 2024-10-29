package org.ajay.designpatterns.singleton;

import org.ajay.designpatterns.singleton.model.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.print());
    }
}
