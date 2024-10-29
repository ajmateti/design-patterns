package org.ajay.designpatterns.state.model;

import org.ajay.designpatterns.state.model.impl.AddCoinState;
import org.ajay.designpatterns.state.model.impl.DispenseProductState;
import org.ajay.designpatterns.state.model.impl.SelectProductState;

import java.util.Set;

public class VendingMachine {
    VendingMachineState currentState;
    int coins;
    private final Set<Integer> productsList;
    Integer selectedProduct;

    private final VendingMachineState addCoinState = new AddCoinState(this);
    private final VendingMachineState selectProductState = new SelectProductState(this);
    private final VendingMachineState dispenseProductState = new DispenseProductState(this);

    public VendingMachine(Set<Integer> productsList) {
        this.productsList = productsList;
        this.currentState = addCoinState;
        this.coins = 0;
    }

    public void setCurrentState(VendingMachineState state) {
        this.currentState = state;
    }

    public VendingMachineState getAddCoinState() {
        return addCoinState;
    }

    public VendingMachineState getSelectProductState() {
        return selectProductState;
    }

    public VendingMachineState getDispenseProductState() {
        return dispenseProductState;
    }

    public void addCoin(int coin) {
        this.currentState.addCoin(coin);
    }

    public void dispenseProduct() {
        this.currentState.dispenseProduct();
    }

    public void selectProduct(int product) {
        this.currentState.selectProduct(product);
    }

    public Integer getSelectedProduct() {
        return selectedProduct;
    }

    public void setSelectedProduct(Integer selectedProduct) {
        this.selectedProduct = selectedProduct;
    }

    public boolean productAvailable(int product) {
        return productsList.contains(product);
    }
}
