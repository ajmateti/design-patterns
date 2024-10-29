package org.ajay.designpatterns.prototype.model.impl;

import org.ajay.designpatterns.prototype.model.Keyboard;

public class BluetoothKeyboard extends Keyboard {
    private final String name = "Bluetooth Keyboard";
    public BluetoothKeyboard(Keyboard source) {
        super(source);
    }

    @Override
    public String toString() {
        return name;
    }
}
