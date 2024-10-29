package org.ajay.designpatterns.bridge.model;

public interface RemoteControl {
    void on();
    void off();
    void setChannel(int channel);

    void nextChannel();
}
