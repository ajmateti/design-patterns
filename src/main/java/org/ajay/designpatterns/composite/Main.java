package org.ajay.designpatterns.composite;

import org.ajay.designpatterns.composite.model.MenuComponent;
import org.ajay.designpatterns.composite.model.impl.Menu;
import org.ajay.designpatterns.composite.model.impl.MenuItem;

public class Main {
    public static void main(String[] args) {
        MenuComponent biryani = new MenuItem("Biryani", 10);
        MenuComponent dessert = new MenuItem("Brownie", 2);

        MenuComponent mainCourse = new Menu("Main Course");
        mainCourse.addMenu(biryani);

        MenuComponent dessertMenu = new Menu("Desserts");
        dessertMenu.addMenu(dessert);

        MenuComponent lunchMenu = new Menu("Lunch");
        lunchMenu.addMenu(mainCourse);
        lunchMenu.addMenu(dessertMenu);

        lunchMenu.printMenu();

        dessertMenu.printMenu();

        dessert.printMenu();
    }
}
