package org.ajay.designpatterns.decorator;

import org.ajay.designpatterns.decorator.model.Drink;
import org.ajay.designpatterns.decorator.model.impl.AlmondMilkDecorator;
import org.ajay.designpatterns.decorator.model.impl.Coffee;

public class Main {
    public static void main(String[] args) {
        Drink coffee = new Coffee("Cappuccino", 10);
        coffee.print();
        Drink almondMilkCoffee = new AlmondMilkDecorator(coffee);
        almondMilkCoffee.print();
    }
}
