package com.kyle.design.decorator.vienna;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @date : 2021-05-08 17:52
 * @description :
 */
public class ViennaCoffeeTest {

    public static void main(String[] args) {

        Beverage beverageEspresso = new Espresso();
        System.out.println(beverageEspresso.getDescription() + " $" + beverageEspresso.cost());

        Beverage beverageDarkRoast = new DarkRoast();
        beverageDarkRoast = new Mocha(beverageDarkRoast);
        beverageDarkRoast = new Mocha(beverageDarkRoast);
        beverageDarkRoast = new Whip(beverageDarkRoast);
        System.out.println(beverageDarkRoast.getDescription() + " $" + beverageDarkRoast.cost());

    }
}
