package org.ajay.designpatterns.factorymethod.factory;

import org.ajay.designpatterns.factorymethod.enums.DeviceType;
import org.ajay.designpatterns.factorymethod.model.Device;

public interface DeviceFactory {
    public Device getDevice(DeviceType deviceType);
}
