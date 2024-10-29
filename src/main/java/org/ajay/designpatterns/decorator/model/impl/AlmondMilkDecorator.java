package org.ajay.designpatterns.decorator.model.impl;

import org.ajay.designpatterns.decorator.model.Drink;

public class AlmondMilkDecorator implements Drink {
    private final Drink object;

    public AlmondMilkDecorator(Drink object) {
        this.object = object;
    }

    @Override
    public void print() {
        System.out.printf("%s for $%s\n", getName(), getPrice());
    }

    @Override
    public int getPrice() {
        return 5 + object.getPrice();
    }

    @Override
    public String getName() {
        return object.getName() + " with Almond Milk";
    }
}
