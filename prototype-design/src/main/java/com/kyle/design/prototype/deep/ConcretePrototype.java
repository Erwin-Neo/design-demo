package com.kyle.design.prototype.deep;

import lombok.Data;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @description :
 */
@Data
public class ConcretePrototype implements Cloneable, Serializable {

    private String productID;
    private String productName;
    private List tags;

    @Override
    public com.kyle.design.prototype.shallow.ConcretePrototype clone() {
        try {
            return (com.kyle.design.prototype.shallow.ConcretePrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public ConcretePrototype deepCloneTags() {
        try {
            ConcretePrototype result = (ConcretePrototype) super.clone();
            result.tags = (List) ((ArrayList) result.tags).clone();
            return result;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public ConcretePrototype deepClone() {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            return (ConcretePrototype) ois.readObject();
        } catch (Exception e) {
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
