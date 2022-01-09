package com.kyle.design.iterator.general;

/**
 * Description : Abstract container
 *
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 */
public interface Aggregate<E> {

    boolean add(E element);

    boolean remove(E element);

    Iterator<E> iterator();
}