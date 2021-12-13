package com.kyle.design.decorator.general;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @description :
 */
public class ClientDrive {

    public static void main(String[] args) {
        Component concreteComponent = new ConcreteComponent();
        Decorator decoratorA = new ConcreteDecoratorA(concreteComponent);
        decoratorA.operation();

        Decorator decoratorB = new ConcreteDecoratorB(concreteComponent);
        decoratorB.operation();

        Decorator decoratorBandA = new ConcreteDecoratorB(decoratorA);
        decoratorBandA.operation();
    }
}
