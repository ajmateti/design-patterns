package org.ajay.designpatterns.factorymethod;

import org.ajay.designpatterns.factorymethod.enums.DeviceType;
import org.ajay.designpatterns.factorymethod.factory.DeviceFactory;
import org.ajay.designpatterns.factorymethod.factory.impl.WiredDeviceFactory;
import org.ajay.designpatterns.factorymethod.model.Device;

public class Client {
    private static final DeviceFactory factory = new WiredDeviceFactory();
    public static void main(String[] args) {
        Device mouse = factory.getDevice(DeviceType.MOUSE);
        Device keyboard = factory.getDevice(DeviceType.KEYBOARD);
        System.out.printf("Created mouse %s, keyboard %s using factory!!%n", mouse.getDetails(), keyboard.getDetails());
    }
}