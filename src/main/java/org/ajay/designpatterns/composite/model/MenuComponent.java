package org.ajay.designpatterns.composite.model;

public interface MenuComponent {
    void printMenu();
    void addMenu(MenuComponent menuComponent);
}
