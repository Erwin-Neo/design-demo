package com.kyle.design.prototype.singleton;

import lombok.Data;

import java.util.List;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @description :
 */
@Data
public class ConcretePrototype implements Cloneable {

    private String productID;
    private String productName;
    private List<String> tags;

    private static ConcretePrototype instance = new ConcretePrototype();

    private ConcretePrototype() {
    }

    public static ConcretePrototype getInstance() {
        return instance;
    }

    @Override
    public ConcretePrototype clone() {
        return instance;
    }

    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "productID='" + productID + '\'' +
                ", productName='" + productName + '\'' +
                ", tags=" + tags +
                '}';
    }
}
