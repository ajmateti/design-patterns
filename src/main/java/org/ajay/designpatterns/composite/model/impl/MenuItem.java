package org.ajay.designpatterns.composite.model.impl;

import org.ajay.designpatterns.composite.model.MenuComponent;

public class MenuItem implements MenuComponent {
    private final String name;
    private final int price;

    public MenuItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void printMenu() {
        System.out.printf("%s for $%s\n", name, price);
    }

    @Override
    public void addMenu(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("Can not add to menu item.");
    }
}
