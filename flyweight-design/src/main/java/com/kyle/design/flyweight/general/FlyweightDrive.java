package com.kyle.design.flyweight.general;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @description :
 */
public class FlyweightDrive {

    public static void main(String[] args) {
        Flyweight flyweightA = FlyweightFactory.getFlyweight("intrinsicStateA");
        Flyweight flyweightB = FlyweightFactory.getFlyweight("intrinsicStateB");
        flyweightA.operation("extrinsicStateS");
        flyweightB.operation("extrinsicStateB");
    }
}
