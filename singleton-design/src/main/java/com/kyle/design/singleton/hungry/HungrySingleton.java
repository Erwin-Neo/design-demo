package com.kyle.design.singleton.hungry;

/**
 * Description:
 * <p>Advantage: 执行效率高, 性能高, 没有任何的锁</p>
 * <p>Disadvantage: 某些情况下,可能会造成内存浪费</p>
 *
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 */
public class HungrySingleton {

    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return  hungrySingleton;
    }
}
