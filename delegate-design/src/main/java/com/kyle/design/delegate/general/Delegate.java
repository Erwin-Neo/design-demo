package com.kyle.design.delegate.general;

import java.util.Random;


/**
 * Description :  Delegate class provides a proxy
 *
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 */
public class Delegate implements Task {

    public void handleTask() {
        System.out.println("proxy execution start:");

        Task task = null;
        if (new Random().nextBoolean()) {
            task = new ConcreteA();
        } else {
            task = new ConcreteB();
        }
        task.handleTask();

        System.out.println("proxy execution end.");
    }
}