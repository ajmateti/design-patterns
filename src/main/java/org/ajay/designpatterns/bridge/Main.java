package org.ajay.designpatterns.bridge;

import org.ajay.designpatterns.bridge.model.RemoteControl;
import org.ajay.designpatterns.bridge.model.TV;
import org.ajay.designpatterns.bridge.model.impl.ConcreteRemote;
import org.ajay.designpatterns.bridge.model.impl.SonyTv;

public class Main {
    public static void main(String[] args) {
        TV tv = new SonyTv();
        RemoteControl remoteControl = new ConcreteRemote(tv);
        remoteControl.on();
        remoteControl.setChannel(10);
        remoteControl.nextChannel();
        remoteControl.off();
    }
}
