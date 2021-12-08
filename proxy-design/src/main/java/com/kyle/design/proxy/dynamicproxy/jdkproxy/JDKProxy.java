package com.kyle.design.proxy.dynamicproxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @description : JDK 动态代理
 */
public class JDKProxy implements InvocationHandler {

    private Subject target;

    public Subject getInstance(Subject target) {
        this.target = target;
        Class<?> clazz = target.getClass();
        return (Subject) Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(this.target, args);
        after();
        return result;
    }

    private void after() {
        System.out.println("after::take action to handle request after invoking RealSubject#request()...");
    }

    private void before() {
        System.out.println("before::take action to handle request before invoking RealSubject#request()...");
    }

}
