package org.ajay.designpatterns.prototype;

import org.ajay.designpatterns.prototype.model.Keyboard;
import org.ajay.designpatterns.prototype.model.impl.WiredKeyboard;

public class Client {
    public static void main(String[] args) {
        Keyboard keyboard = new WiredKeyboard();
        Keyboard keyboard1 = keyboard.clone();
        System.out.println(keyboard);
        System.out.println(keyboard1);
    }
}
