package org.ajay.designpatterns.factorymethod.model.impl;

import org.ajay.designpatterns.factorymethod.model.Device;

public class WiredKeyboard implements Device {

    @Override
    public String getDetails() {
        return "Wired Keyboard";
    }
}
