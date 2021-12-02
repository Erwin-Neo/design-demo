package com.kyle.design.chain.general;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @description : 抽象 Handler
 */
public abstract class Handler {

    protected Handler nextHandler;

    public void setNextHandler(Handler successor) {
        this.nextHandler = successor;
    }

    public abstract void handleRequest(String request);

}
