package com.kyle.design.state.general.simple;

/**
 * Description :  Concrete state class
 *
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 */
public class ConcreteStateB implements State {

    public void handle() {
        System.out.println("StateB do action");
    }
}