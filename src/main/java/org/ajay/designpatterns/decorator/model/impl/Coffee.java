package org.ajay.designpatterns.decorator.model.impl;

import org.ajay.designpatterns.decorator.model.Drink;

public class Coffee implements Drink {
    private final String name;
    private final int price;

    public Coffee(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void print() {
        System.out.printf("%s for $%s\n", name, price);
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }
}
