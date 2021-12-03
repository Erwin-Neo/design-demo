package com.kyle.design.proxy.general;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @description :
 */
public class RealSubject implements Subject {

    public void request() {
        System.out.println("real service is called.");
    }
}
