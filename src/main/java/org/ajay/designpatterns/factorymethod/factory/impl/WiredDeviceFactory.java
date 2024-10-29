package org.ajay.designpatterns.factorymethod.factory.impl;

import org.ajay.designpatterns.factorymethod.enums.DeviceType;
import org.ajay.designpatterns.factorymethod.factory.DeviceFactory;
import org.ajay.designpatterns.factorymethod.model.Device;
import org.ajay.designpatterns.factorymethod.model.impl.WiredKeyboard;
import org.ajay.designpatterns.factorymethod.model.impl.WiredMouse;

public class WiredDeviceFactory implements DeviceFactory {
    @Override
    public Device getDevice(DeviceType deviceType) {
        if (DeviceType.KEYBOARD == deviceType) return new WiredKeyboard();
        if (DeviceType.MOUSE == deviceType) return new WiredMouse();
        return null;
    }
}
