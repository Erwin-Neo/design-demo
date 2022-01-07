package com.kyle.design.memento.general;

/**
 * Description : Caretaker
 *
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 */
public class Caretaker {

    // Memo object
    private Memento memento;

    public Memento getMemento() {
        return this.memento;
    }

    public void storeMemento(Memento memento) {
        this.memento = memento;
    }
}
