package com.kyle.design.visitor.general;

/**
 * Description: Client test class
 *
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 */
public class ClientDrive {

    public static void main(String[] args) {
        ObjectStructure collection = new ObjectStructure();

        System.out.println("ConcreteVisitorA handle elements:");
        Visitor visitorA = new ConcreteVisitorA();
        collection.accept(visitorA);

        System.out.println("------------------------------------");

        System.out.println("ConcreteVisitorB handle elements:");
        Visitor visitorB = new ConcreteVisitorB();
        collection.accept(visitorB);
    }

}
