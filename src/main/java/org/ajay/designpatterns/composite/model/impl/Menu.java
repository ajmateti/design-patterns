package org.ajay.designpatterns.composite.model.impl;

import org.ajay.designpatterns.composite.model.MenuComponent;

import java.util.ArrayList;
import java.util.List;

public class Menu implements MenuComponent {
    private final String name;
    private final List<MenuComponent> menuComponentList =  new ArrayList<>();

    public Menu(String name) {
        this.name = name;
    }

    @Override
    public void printMenu() {
        System.out.println(name);
        for(MenuComponent menuComponent: menuComponentList) {
            menuComponent.printMenu();
        }
    }

    @Override
    public void addMenu(MenuComponent menuComponent) {
        menuComponentList.add(menuComponent);
    }
}
