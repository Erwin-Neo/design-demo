package com.kyle.design.prototype.general;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @description :
 */
public class ClientDrive {

    public static void main(String[] args) {
        // 创建原型对象
        ConcretePrototype prototype = new ConcretePrototype();
        prototype.setProductID("NRT12910301923");
        prototype.setProductName("Mac Pro");
        System.out.println(prototype);

        // 拷贝原型对象
        ConcretePrototype cloneType = prototype.clone();
        System.out.println("ConcretePrototype cloneType ::" + cloneType);
    }
}
