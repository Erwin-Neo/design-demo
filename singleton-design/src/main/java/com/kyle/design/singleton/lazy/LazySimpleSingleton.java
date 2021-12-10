package com.kyle.design.singleton.lazy;

/**
 * Description:
 * <p>Advantage: 节省内存, 线程安全</p>
 * <p>Disadvantage: 性能低</p>
 *
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 */
public class LazySimpleSingleton {

    private static LazySimpleSingleton instance;

    private LazySimpleSingleton() {
    }

    public synchronized static LazySimpleSingleton getInstance() {
        if (instance == null) {
            instance = new LazySimpleSingleton();
        }
        return instance;
    }
}
