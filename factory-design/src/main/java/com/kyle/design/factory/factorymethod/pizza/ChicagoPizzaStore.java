package com.kyle.design.factory.factorymethod.pizza;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @date : 2021-05-16 20:38
 * @description :
 */
public class ChicagoPizzaStore extends PizzaStore {

    Pizza createPizza(String item) {
        if ("cheese".equals(item)) {
            return new ChicagoStyleCheesePizza();
        } else if ("veggie".equals(item)) {
            return new ChicagoStyleVeggiePizza();
        } else if ("clam".equals(item)) {
            return new ChicagoStyleClamPizza();
        } else if ("pepperoni".equals(item)) {
            return new ChicagoStylePepperoniPizza();
        } else return null;
    }
}
