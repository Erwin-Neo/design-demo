package com.kyle.design.state.general.apply;

/**
 * Description :  Concrete state B
 *
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 */
public class ConcreteStateB extends State {

    @Override
    public void handle() {
        System.out.println("StateB do action");
    }
}