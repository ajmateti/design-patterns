package org.ajay.designpatterns.bridge.model.impl;

import org.ajay.designpatterns.bridge.model.RemoteControl;
import org.ajay.designpatterns.bridge.model.TV;

public class ConcreteRemote implements RemoteControl {
    private final TV tv;

    public ConcreteRemote(TV tv) {
        this.tv = tv;
    }

    @Override
    public void on() {
        tv.on();
    }

    @Override
    public void off() {
        tv.off();
    }

    @Override
    public void setChannel(int channel) {
        tv.tuneChannel(channel);
    }

    @Override
    public void nextChannel() {
        setChannel(tv.getChannel()+1);
    }
}
