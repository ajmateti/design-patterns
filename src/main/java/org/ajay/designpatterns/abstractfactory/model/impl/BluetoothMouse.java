package org.ajay.designpatterns.abstractfactory.model.impl;

import org.ajay.designpatterns.abstractfactory.model.Mouse;

public class BluetoothMouse implements Mouse {

    @Override
    public String getDetails() {
        return "Bluetooth Mouse";
    }
}
