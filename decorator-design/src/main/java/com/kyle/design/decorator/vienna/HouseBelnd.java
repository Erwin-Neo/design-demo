package com.kyle.design.decorator.vienna;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @date : 2021-05-08 17:40
 * @description :
 */
public class HouseBelnd extends Beverage {

    public HouseBelnd() {
        description = "HouseBelnd";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
