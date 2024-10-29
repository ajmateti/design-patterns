package org.ajay.designpatterns.prototype.model.impl;

import org.ajay.designpatterns.prototype.model.Keyboard;

public class WiredKeyboard extends Keyboard {
    private final String name = "Wired Keyboard";

    public WiredKeyboard() {
        super();
    }

    public WiredKeyboard(Keyboard source) {
        super(source);
    }

    @Override
    public String toString() {
        return name;
    }
}
