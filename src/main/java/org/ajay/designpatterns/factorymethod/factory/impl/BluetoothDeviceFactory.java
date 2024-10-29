package org.ajay.designpatterns.factorymethod.factory.impl;

import org.ajay.designpatterns.factorymethod.enums.DeviceType;
import org.ajay.designpatterns.factorymethod.factory.DeviceFactory;
import org.ajay.designpatterns.factorymethod.model.Device;
import org.ajay.designpatterns.factorymethod.model.impl.BluetoothKeyboard;
import org.ajay.designpatterns.factorymethod.model.impl.BluetoothMouse;

public class BluetoothDeviceFactory implements DeviceFactory {

    @Override
    public Device getDevice(DeviceType deviceType) {
        if (DeviceType.KEYBOARD == deviceType) return new BluetoothKeyboard();
        if (DeviceType.MOUSE == deviceType) return new BluetoothMouse();
        return null;
    }
}
