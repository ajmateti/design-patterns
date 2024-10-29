package org.ajay.designpatterns.state.model.impl;

import org.ajay.designpatterns.state.model.VendingMachine;
import org.ajay.designpatterns.state.model.VendingMachineState;

public class DispenseProductState implements VendingMachineState {
    private final VendingMachine vendingMachine;

    public DispenseProductState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    public void dispenseProduct() {
        if (vendingMachine.getSelectedProduct() == null) {
            System.out.println("No product selected to dispense");
        } else {
            System.out.println("Dispensing product " + vendingMachine.getSelectedProduct());
            vendingMachine.setSelectedProduct(null);
            vendingMachine.setCurrentState(vendingMachine.getAddCoinState());
        }
    }
}
