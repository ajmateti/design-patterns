package org.ajay.designpatterns.state.model.impl;

import org.ajay.designpatterns.state.model.VendingMachine;
import org.ajay.designpatterns.state.model.VendingMachineState;

public class AddCoinState implements VendingMachineState {

    private final VendingMachine vendingMachine;

    public AddCoinState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    public void addCoin(int coin) {
//        vendingMachine.addCoin(coin);
        System.out.printf("%s coins added!\n", coin);
        vendingMachine.setCurrentState(vendingMachine.getSelectProductState());
    }
}
