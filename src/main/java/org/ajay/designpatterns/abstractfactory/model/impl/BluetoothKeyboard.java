package org.ajay.designpatterns.abstractfactory.model.impl;

import org.ajay.designpatterns.abstractfactory.model.Keyboard;
import org.ajay.designpatterns.abstractfactory.model.Mouse;

public class BluetoothKeyboard implements Keyboard {

    @Override
    public String getDetails() {
        return "Bluetooth Mouse";
    }
}
