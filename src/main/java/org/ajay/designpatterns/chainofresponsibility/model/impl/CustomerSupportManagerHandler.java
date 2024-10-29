package org.ajay.designpatterns.chainofresponsibility.model.impl;

import org.ajay.designpatterns.chainofresponsibility.enums.RequestType;
import org.ajay.designpatterns.chainofresponsibility.model.Handler;

public class CustomerSupportManagerHandler implements Handler {
    private Handler nextHandler;
    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType() == RequestType.CRITICAL) {
            System.out.println("CustomerSupportManager handled request: "+ request.getDetail());
        } else {
            nextHandler.handleRequest(request);
        }
    }

    @Override
    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }
}
