package org.ajay.designpatterns.abstractfactory.factory.impl;

import org.ajay.designpatterns.abstractfactory.factory.DeviceFactory;
import org.ajay.designpatterns.abstractfactory.model.Keyboard;
import org.ajay.designpatterns.abstractfactory.model.Mouse;
import org.ajay.designpatterns.abstractfactory.model.impl.WiredKeyboard;
import org.ajay.designpatterns.abstractfactory.model.impl.WiredMouse;

public class WiredDeviceFactory implements DeviceFactory {
    @Override
    public Mouse getMouse() {
        return new WiredMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new WiredKeyboard();
    }
}
