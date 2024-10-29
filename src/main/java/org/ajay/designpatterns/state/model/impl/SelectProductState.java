package org.ajay.designpatterns.state.model.impl;

import org.ajay.designpatterns.state.model.VendingMachine;
import org.ajay.designpatterns.state.model.VendingMachineState;

public class SelectProductState implements VendingMachineState {

    private final VendingMachine vendingMachine;

    public SelectProductState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    public void selectProduct(int product) {
        if (vendingMachine.productAvailable(product)) {
            vendingMachine.setSelectedProduct(product);
            System.out.println("Selected product " + vendingMachine.getSelectedProduct());
            vendingMachine.setCurrentState(vendingMachine.getDispenseProductState());
        } else {
            System.out.println("Product not available");
        }
    }
}
