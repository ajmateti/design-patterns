package org.ajay.designpatterns.bridge.model;

public interface TV {
    void on();
    void off();
    void tuneChannel(int channel);
    int getChannel();
}
