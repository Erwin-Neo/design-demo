package com.kyle.design.command.diner;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @date : 2021-05-22 23:26
 * @description :
 */
public class NiceDiner {

    public static void main(String[] args) {
        Cook cook = new Cook();
        Waitress waitress = new Waitress();
        
        Customer customer = new Customer(waitress);

        customer.createOrder(new BurgerAndFriesOrder(cook));
        customer.hungry();
    }
}
