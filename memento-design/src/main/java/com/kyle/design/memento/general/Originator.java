package com.kyle.design.memento.general;

/**
 * Description : Originator
 *
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 */
public class Originator {
    // Internal state
    private String state;

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    // Create a memo
    public Memento createMemento() {
        return new Memento(this.state);
    }

    // Recovering from a memo
    public void restoreMemento(Memento memento) {
        this.setState(memento.getState());
    }
}