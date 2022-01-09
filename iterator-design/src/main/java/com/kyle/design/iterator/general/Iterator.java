package com.kyle.design.iterator.general;

/**
 * Description : Abstract iterator
 *
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 */
public interface Iterator<E> {

    E next();

    boolean hasNext();
}