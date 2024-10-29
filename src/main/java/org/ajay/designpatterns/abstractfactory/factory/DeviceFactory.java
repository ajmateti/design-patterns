package org.ajay.designpatterns.abstractfactory.factory;

import org.ajay.designpatterns.abstractfactory.model.Keyboard;
import org.ajay.designpatterns.abstractfactory.model.Mouse;

public interface DeviceFactory {
    public Mouse getMouse();
    public Keyboard getKeyboard();
}
