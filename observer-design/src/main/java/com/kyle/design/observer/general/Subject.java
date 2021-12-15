package com.kyle.design.observer.general;

/**
 * Description : Abstract Subject
 *
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 */
public interface Subject<E> {

    boolean attach(Observer<E> observer);

    boolean detach(Observer<E> observer);

    void notify(E event);

}
