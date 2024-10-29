package org.ajay.designpatterns.singleton.model;

public class Singleton {
    private static Singleton instance;
    private Singleton(){}
    public static synchronized Singleton getInstance(){
        synchronized(instance) {
            if (instance == null) {
                instance = new Singleton();
            }
        }
        return instance;
    }

    public String print(){
        return "print method in singleton object";
    }
}
