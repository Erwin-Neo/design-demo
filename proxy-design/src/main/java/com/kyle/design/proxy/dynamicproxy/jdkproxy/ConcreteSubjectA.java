package com.kyle.design.proxy.dynamicproxy.jdkproxy;


/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @description :  被代理对象A
 */
public class ConcreteSubjectA implements Subject {

    @Override
    public void request() {
        System.out.println("ConcreteSubjectA takes action to handle request...");
    }
}
