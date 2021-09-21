package com.kyle.design.factory.abstractfactory.pizza;

import com.kyle.design.factory.abstractfactory.pizza.ingredient.*;
import com.kyle.design.factory.abstractfactory.pizza.ingredient.impl.*;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @date : 2021-05-16 21:18
 * @description :
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    public Veggies[] createVeggies() {
        Veggies[] veggies = { new BlackOlives(),
                new Spinach(),
                new Eggplant() };
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FrozenClams();
    }
}
