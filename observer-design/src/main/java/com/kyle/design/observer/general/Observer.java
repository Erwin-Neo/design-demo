package com.kyle.design.observer.general;

/**
 * Description : Abstract Observer
 *
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 */
public interface Observer<E> {

    void update(E event);
}
