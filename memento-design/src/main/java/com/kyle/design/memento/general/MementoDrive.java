package com.kyle.design.memento.general;

/**
 * Description :
 *
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 */
public class MementoDrive {

    public static void main(String[] args) {
        Originator originator = new Originator();

        Caretaker caretaker = new Caretaker();

        caretaker.storeMemento(originator.createMemento());

        originator.restoreMemento(caretaker.getMemento());
    }
}
