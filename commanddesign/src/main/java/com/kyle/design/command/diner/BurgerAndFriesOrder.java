package com.kyle.design.command.diner;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @date : 2021-05-22 23:27
 * @description :
 */
public class BurgerAndFriesOrder implements Order {

    Cook cook;

    public BurgerAndFriesOrder(Cook cook) {
        this.cook = cook;
    }

    public void orderUp() {
        // execute()
        cook.makeBurger();
        cook.makeFries();
    }
}
