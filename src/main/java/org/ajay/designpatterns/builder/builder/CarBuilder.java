package org.ajay.designpatterns.builder.builder;

import org.ajay.designpatterns.builder.model.Car;

public interface CarBuilder {
    public CarBuilder buildModel(String model);
    public CarBuilder buildYear(int year);
    public CarBuilder buildCompany(String company);
    public Car getCar();

}
