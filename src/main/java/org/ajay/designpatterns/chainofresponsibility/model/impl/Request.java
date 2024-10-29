package org.ajay.designpatterns.chainofresponsibility.model.impl;

import org.ajay.designpatterns.chainofresponsibility.enums.RequestType;

public class Request {
    private final RequestType requestType;
    private final String detail;

    public Request(RequestType requestType, String detail) {
        this.requestType = requestType;
        this.detail = detail;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public String getDetail() {
        return detail;
    }
}
