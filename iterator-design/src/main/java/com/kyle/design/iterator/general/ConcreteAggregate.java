package com.kyle.design.iterator.general;

import java.util.ArrayList;
import java.util.List;

/**
 * Description : Concrete container
 *
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 */
public class ConcreteAggregate<E> implements Aggregate<E> {

    private List<E> list = new ArrayList<E>();

    public boolean add(E element) {
        return this.list.add(element);
    }

    public boolean remove(E element) {
        return this.list.remove(element);
    }

    public Iterator<E> iterator() {
        return new ConcreteIterator<E>(this.list);
    }
}