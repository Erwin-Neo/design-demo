package com.kyle.principles.openclose;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @description :
 */
public class MacProDiscountGoods extends MacProGoods {

    public MacProDiscountGoods(String id, String name, Double price) {
        super(id, name, price);
    }

    public Double getDiscountPrice() {
        return super.getPrice() * 0.95;
    }


}
