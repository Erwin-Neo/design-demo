package com.kyle.design.singleton.lazy;

/**
 * Description:
 * <p>Advantage: 性能提高, 线程安全</p>
 * <p>Disadvantage: 可读性难度大, 不够简洁</p>
 *
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 */
public class LazyDoubleCheckSingleton {

    private volatile static LazyDoubleCheckSingleton instance;

    private LazyDoubleCheckSingleton() {
    }

    public static LazyDoubleCheckSingleton getInstance() {
        //检查是否要阻塞
        if (instance == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                //检查是否要重新创建实例
                if (instance == null) {
                    instance = new LazyDoubleCheckSingleton();
                    //指令重排序的问题
                }
            }
        }
        return instance;
    }
}
