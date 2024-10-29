package org.ajay.designpatterns.chainofresponsibility;

import org.ajay.designpatterns.chainofresponsibility.enums.RequestType;
import org.ajay.designpatterns.chainofresponsibility.model.impl.ChatbotHandler;
import org.ajay.designpatterns.chainofresponsibility.model.impl.CustomerSupportHandler;
import org.ajay.designpatterns.chainofresponsibility.model.impl.CustomerSupportManagerHandler;
import org.ajay.designpatterns.chainofresponsibility.model.impl.Request;

public class Main {
    public static void main(String[] args) {
        ChatbotHandler chatbotHandler = new ChatbotHandler();
        CustomerSupportHandler customerSupportHandler = new CustomerSupportHandler();
        CustomerSupportManagerHandler customerSupportManagerHandler = new CustomerSupportManagerHandler();

        chatbotHandler.setNextHandler(customerSupportHandler);
        customerSupportHandler.setNextHandler(customerSupportManagerHandler);

        chatbotHandler.handleRequest(new Request(RequestType.BASIC, "Food not delivered"));
        chatbotHandler.handleRequest(new Request(RequestType.INTERMEDIATE, "Food packaging issue"));
        chatbotHandler.handleRequest(new Request(RequestType.CRITICAL, "Health issue after eating"));

    }
}
