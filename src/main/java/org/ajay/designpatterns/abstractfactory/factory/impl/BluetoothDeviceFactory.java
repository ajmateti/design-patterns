package org.ajay.designpatterns.abstractfactory.factory.impl;

import org.ajay.designpatterns.abstractfactory.factory.DeviceFactory;
import org.ajay.designpatterns.abstractfactory.model.Keyboard;
import org.ajay.designpatterns.abstractfactory.model.Mouse;
import org.ajay.designpatterns.abstractfactory.model.impl.BluetoothMouse;
import org.ajay.designpatterns.abstractfactory.model.impl.BluetoothKeyboard;

public class BluetoothDeviceFactory implements DeviceFactory {

    @Override
    public Mouse getMouse() {
        return new BluetoothMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new BluetoothKeyboard();
    }
}
