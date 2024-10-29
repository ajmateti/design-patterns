package org.ajay.designpatterns.state.model;

public interface VendingMachineState {
    default void addCoin(int coin) {
        System.out.println("addCoin not supported");
    }

    default void selectProduct(int product) {
        System.out.println("selectProduct not supported");
    }

    default void dispenseProduct() {
        System.out.println("dispenseProduct not supported");
    }

    default void reset() {
        System.out.println("reset not supported");
    }
}
