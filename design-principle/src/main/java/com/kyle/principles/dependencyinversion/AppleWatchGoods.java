package com.kyle.principles.dependencyinversion;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @date : 2021-09-21 19:14
 * @description :
 */
public class AppleWatchGoods implements IGoods {
    @Override
    public void purchase() {
        System.out.println("Customer :: 正在购买 AppleWatchGoods 商品");
    }
}
