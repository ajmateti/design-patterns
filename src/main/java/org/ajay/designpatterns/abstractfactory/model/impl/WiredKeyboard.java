package org.ajay.designpatterns.abstractfactory.model.impl;

import org.ajay.designpatterns.abstractfactory.model.Keyboard;

public class WiredKeyboard implements Keyboard {

    @Override
    public String getDetails() {
        return "Wired Keyboard";
    }
}
