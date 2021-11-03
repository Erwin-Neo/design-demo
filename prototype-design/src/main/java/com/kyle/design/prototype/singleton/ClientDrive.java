package com.kyle.design.prototype.singleton;

import com.kyle.design.prototype.shallow.ConcretePrototype;

import java.util.ArrayList;
import java.util.List;

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
        List<String> tags = new ArrayList<String>();
        tags.add("High Performance");
        tags.add("Electronic Product");
        prototype.setTags(tags);

        //拷贝原型对象
        ConcretePrototype cloneType = prototype.clone();
        cloneType.getTags().add("Delicate");

        System.out.println("原型对象: " + prototype);
        System.out.println("克隆对象: " + cloneType);
        System.out.println("原型对象 vs 克隆对象: " + (prototype == cloneType));

        System.out.println("原型对象的Tags:" + prototype.getTags());
        System.out.println("克隆对象的Tags: " + cloneType.getTags());
        System.out.println("原型对象Tags vs 克隆对象Tags: " + (prototype.getTags() == cloneType.getTags()));
    }
}
