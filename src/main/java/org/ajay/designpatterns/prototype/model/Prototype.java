package org.ajay.designpatterns.prototype.model;

public abstract class Prototype<T> implements Cloneable {
    @Override
    public T clone() {
        try {
            return (T) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
