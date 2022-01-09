package com.kyle.design.iterator.general;

/**
 * Description : An iterator test class
 *
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 */
public class IteratorDrive {

    public static void main(String[] args) {

        Aggregate<String> aggregate = new ConcreteAggregate<String>();

        aggregate.add("one");
        aggregate.add("two");
        aggregate.add("three");

        Iterator<String> iterator = aggregate.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
