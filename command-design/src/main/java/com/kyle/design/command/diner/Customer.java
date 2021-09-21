package com.kyle.design.command.diner;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @date : 2021-05-22 23:23
 * @description :
 */
public class Customer {

    Waitress waitress;
    Order order;

    public Customer(Waitress waitress) {
        this.waitress = waitress;
    }

    public void createOrder(Order order) {
        this.order = order;
    }

    public void hungry() {
        waitress.takeOrder(order);
    }
}
