package com.kyle.design.flyweight.general;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @description :    享元工厂
 */
public class FlyweightFactory {

    private static Map<String, Flyweight> cachePool = new HashMap<String, Flyweight>();

    // 由于内部状态具备不变性, 因此作为缓存的键
    public static Flyweight getFlyweight(String intrinsicState) {
        if (!cachePool.containsKey(intrinsicState)) {
            Flyweight flyweight = new ConcreteFlyweight(intrinsicState);
            cachePool.put(intrinsicState, flyweight);
        }
        return cachePool.get(intrinsicState);
    }
}
