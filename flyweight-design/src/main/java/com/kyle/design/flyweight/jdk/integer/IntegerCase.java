package com.kyle.design.flyweight.jdk.integer;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @description :
 */
public class IntegerCase {

    public static void main(String[] args) {

        Integer a = Integer.valueOf(99);
        Integer b = 99;

        Integer c = Integer.valueOf(999);
        Integer d = 999;

        System.out.println("a == b ? : " + (a == b));
        System.out.println("c == d ? : " + (c == d));
    }
}
