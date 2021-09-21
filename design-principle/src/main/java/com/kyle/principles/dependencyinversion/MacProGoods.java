package com.kyle.principles.dependencyinversion;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @date : 2021-09-21 19:11
 * @description :
 */
public class MacProGoods implements IGoods {

    public void purchase() {
        System.out.println("Customer :: 正在购买 MacProGoods 商品");
    }
}
