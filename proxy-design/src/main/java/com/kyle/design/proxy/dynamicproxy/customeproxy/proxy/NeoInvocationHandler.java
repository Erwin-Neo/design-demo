package com.kyle.design.proxy.dynamicproxy.customeproxy.proxy;

import java.lang.reflect.Method;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @description :
 */
public interface NeoInvocationHandler {

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}
