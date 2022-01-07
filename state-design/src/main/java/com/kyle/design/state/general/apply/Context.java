package com.kyle.design.state.general.apply;

/**
 * Description :  Environment context
 *
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 */
public class Context {

    public static final State STATE_A = new ConcreteStateA();
    public static final State STATE_B = new ConcreteStateB();

    private State currentState = STATE_A;

    {
        STATE_A.setContext(this);
        STATE_B.setContext(this);
    }

    public void setState(State state) {
        this.currentState = state;
        this.currentState.setContext(this);
    }

    public State getState() {
        return this.currentState;
    }

    public void handle() {
        this.currentState.handle();
    }
}