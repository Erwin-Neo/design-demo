package com.kyle.design.command.diner;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @date : 2021-05-22 23:20
 * @description :
 */
public class Waitress {

    Order order; /// Command

    public Waitress() { }

    public void takeOrder(Order order) {
        // setCommand
        this.order = order;
        order.orderUp();
    }
}
