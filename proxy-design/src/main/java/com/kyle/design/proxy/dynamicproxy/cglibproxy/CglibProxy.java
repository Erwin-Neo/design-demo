package com.kyle.design.proxy.dynamicproxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @description :
 */
public class CglibProxy implements MethodInterceptor {


    public Object getInstance(Class<?> clazz) throws Exception {
        //相当于Proxy==>代理的工具类
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object obj = methodProxy.invokeSuper(o, objects);
        after();
        return obj;
    }

    private void after() {
        System.out.println("after::take action to handle request after invoking Customer#request()...");
    }

    private void before() {
        System.out.println("before::take action to handle request before invoking Customer#request()...");
    }
}
