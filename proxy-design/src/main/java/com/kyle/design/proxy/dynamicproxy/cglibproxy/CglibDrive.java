package com.kyle.design.proxy.dynamicproxy.cglibproxy;

import net.sf.cglib.core.DebuggingClassWriter;

/**
 * JDK Proxy        vs         Cglib Proxy
 * <p>生成方式: JDK 采用读取接口的信息 | CGLib覆盖父类方法
 * <p>代理目的: 都是生成一个新的类, 实现增强原代码逻辑功能
 * <p>生成复杂度: JDK Proxy 生成代理的逻辑简单 | Cglib Proxy 生成代理逻辑更复杂
 * <p>执行效率:  JDK Proxy 执行效率相对要低(每次都要反射动态调用)
 * <p>         Cglib Proxy 调用效率更高, 生成一个包含了所有的逻辑的FastClass，
 * <p>         不再需要反射调用(Cglib不能代理final的方法)
 *  <p>JDK Proxy 对于用户而言, 必须要有一个接口实现, 目标类相对来说复杂 | Cglib 可以代理任意一个普通的类, 没有任何要求
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 *
 */
public class CglibDrive {

    public static void main(String[] args) {

        try {
            System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "F://cglib_proxy_classes");
            Customer proxy = (Customer) new CglibProxy().getInstance(Customer.class);
            proxy.request();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
