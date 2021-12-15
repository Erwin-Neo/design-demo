package com.kyle.design.observer.general;


/**
 * Description : Concrete Observer
 *
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 */
public class ConcreteObserver<E> implements Observer<E> {

    public void update(E event) {
        System.out.println("receive event: " + event);
    }
}