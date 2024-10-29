package org.ajay.designpatterns.abstractfactory.model.impl;

import org.ajay.designpatterns.abstractfactory.model.Mouse;

public class WiredMouse implements Mouse {
    @Override
    public String getDetails() {
        return "Wired Mouse";
    }
}
