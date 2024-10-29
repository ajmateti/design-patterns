package org.ajay.designpatterns.chainofresponsibility.model;

import org.ajay.designpatterns.chainofresponsibility.model.impl.Request;

public interface Handler {
    void handleRequest(Request request);
    void setNextHandler(Handler handler);
}
