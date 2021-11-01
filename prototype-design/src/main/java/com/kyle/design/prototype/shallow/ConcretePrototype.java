package com.kyle.design.prototype.shallow;

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

    @Override
    public ConcretePrototype clone() {
        try {
            return (ConcretePrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
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
