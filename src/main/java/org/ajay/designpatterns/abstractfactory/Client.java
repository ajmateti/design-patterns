package org.ajay.designpatterns.abstractfactory;

import org.ajay.designpatterns.abstractfactory.factory.DeviceFactory;
import org.ajay.designpatterns.abstractfactory.factory.impl.BluetoothDeviceFactory;
import org.ajay.designpatterns.abstractfactory.model.Keyboard;
import org.ajay.designpatterns.abstractfactory.model.Mouse;

public class Client {
    private static final DeviceFactory factory = new BluetoothDeviceFactory();
    public static void main(String[] args) {
        Mouse mouse = factory.getMouse();
        Keyboard keyboard = factory.getKeyboard();
        System.out.printf("Created mouse %s, keyboard %s using factory!!%n", mouse.getDetails(), keyboard.getDetails());
    }
}