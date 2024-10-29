package org.ajay.designpatterns.builder;

import org.ajay.designpatterns.builder.builder.CarBuilder;
import org.ajay.designpatterns.builder.builder.impl.CarBuilderImpl;
import org.ajay.designpatterns.builder.model.Car;

public class Director {
    public static void main(String[] args) {
        CarBuilder builder = new CarBuilderImpl();


        Car car = builder.buildCompany("Tesla").buildYear(2024).buildModel("CyberTruck").getCar();

        System.out.println(car);
    }
}
