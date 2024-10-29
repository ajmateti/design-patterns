package org.ajay.designpatterns.factorymethod.model.impl;

import org.ajay.designpatterns.factorymethod.model.Device;

public class BluetoothKeyboard implements Device {

    @Override
    public String getDetails() {
        return "Bluetooth Keyboard";
    }
}
