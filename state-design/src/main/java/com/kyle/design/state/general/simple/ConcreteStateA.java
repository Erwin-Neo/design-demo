package com.kyle.design.state.general.simple;

/**
 * Description :  Concrete state class
 *
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 */
public class ConcreteStateA implements State {

    public void handle() {
        System.out.println("StateA do action");
    }
}