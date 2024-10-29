package org.ajay.designpatterns.builder.builder.impl;

import org.ajay.designpatterns.builder.builder.CarBuilder;
import org.ajay.designpatterns.builder.model.Car;

public class CarBuilderImpl implements CarBuilder {
    private final Car instance;

    public CarBuilderImpl() {
        this.instance = new Car();
    }

    @Override
    public CarBuilder buildModel(String model) {
        instance.setModel(model);
        return this;
    }

    @Override
    public CarBuilder buildYear(int year) {
        instance.setYear(year);
        return this;
    }

    @Override
    public CarBuilder buildCompany(String company) {
        instance.setCompany(company);
        return this;
    }

    @Override
    public Car getCar() {
        return instance;
    }
}
