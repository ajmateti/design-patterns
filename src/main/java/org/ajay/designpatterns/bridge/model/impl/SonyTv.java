package org.ajay.designpatterns.bridge.model.impl;

import org.ajay.designpatterns.bridge.model.TV;

public class SonyTv implements TV {
    int channel;
    @Override
    public void on() {
        System.out.println("SonyTv turned on!");
    }

    @Override
    public void off() {
        System.out.println("SonyTv turned off!");
    }

    @Override
    public void tuneChannel(int channel) {
        this.channel = channel;
        System.out.println("SonyTv channel changed to : " + channel);
    }

    @Override
    public int getChannel() {
        return this.channel;
    }
}
