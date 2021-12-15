package com.kyle.design.observer.general;


import java.util.ArrayList;
import java.util.List;


/**
 * Description : Concrete Subject
 *
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 */
public class ConcreteSubject<E> implements Subject<E> {

    private List<Observer<E>> observers = new ArrayList<Observer<E>>();

    public boolean attach(Observer<E> observer) {
        return !this.observers.contains(observer) && this.observers.add(observer);
    }

    public boolean detach(Observer<E> observer) {
        return this.observers.remove(observer);
    }

    public void notify(E event) {
        for (Observer<E> observer : this.observers) {
            observer.update(event);
        }
    }
}