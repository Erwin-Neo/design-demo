package com.kyle.design.visitor.general;


import java.util.Random;

/**
 * Description: Concrete element B
 *
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 */
public class ConcreteElementB implements Element {

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int operationB() {
        return new Random().nextInt(100);
    }
}