package com.kyle.design.flyweight.general;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @description :  Client 测试类
 */
public class FlyweightDrive {

    public static void main(String[] args) {
        Flyweight flyweightA = FlyweightFactory.getFlyweight("intrinsicStateA");
        Flyweight flyweightB = FlyweightFactory.getFlyweight("intrinsicStateB");
        flyweightA.operation("extrinsicStateA");
        flyweightB.operation("extrinsicStateB");
    }
}
