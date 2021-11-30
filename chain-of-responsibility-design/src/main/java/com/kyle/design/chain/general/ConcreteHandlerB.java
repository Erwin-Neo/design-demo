package com.kyle.design.chain.general;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @description :    ConcreteHandlerB
 */
public class ConcreteHandlerB extends Handler {

    public void handleRequest(String request) {
        if ("requestB".equals(request)) {
            System.out.println(this.getClass().getSimpleName() + "deal with request: " + request);
            return;
        }
        if (this.nextHandler != null) {
            this.nextHandler.handleRequest(request);
        }
    }
}
