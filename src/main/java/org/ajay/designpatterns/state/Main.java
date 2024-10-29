package org.ajay.designpatterns.state;

import org.ajay.designpatterns.state.model.VendingMachine;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> products = new HashSet<>();
        products.add(1);
        products.add(2);

        VendingMachine vendingMachine = new VendingMachine(products);
        vendingMachine.addCoin(10);
        vendingMachine.selectProduct(1);
        vendingMachine.dispenseProduct();
    }
}
