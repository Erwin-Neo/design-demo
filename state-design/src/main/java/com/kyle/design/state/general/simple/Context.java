package com.kyle.design.state.general.simple;

/**
 * Description :  Context class
 *
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 */
public class Context {

    private static final State STATE_A = new ConcreteStateA();
    private static final State STATE_B = new ConcreteStateB();

    private State currentState = STATE_A;

    public void setState(State state) {
        this.currentState = state;
    }

    public void handle() {
        this.currentState.handle();
    }
}