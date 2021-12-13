package com.kyle.design.decorator.general;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @description :
 */
public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    /**
     * The operation that needs to be performed
     * before calling the operation method of the parent class
     */
    private void operationFirst() {
    }

    /**
     * The operation that needs to be performed
     * after calling the operation method of the parent class
     */
    private void operationLast() {
    }

    public void operation() {
        operationFirst();
        super.operation();
        operationLast();
    }
}