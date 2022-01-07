package com.kyle.design.state.general.apply;

/**
 * Description :  Concrete state A
 *
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 */
public class ConcreteStateA extends State {
    @Override
    public void handle() {
        System.out.println("StateA do action");
        this.context.setState(Context.STATE_B);
        this.context.getState().handle();
    }
}