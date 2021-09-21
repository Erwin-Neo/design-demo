package com.kyle.principles.dependencyinversion;

import com.kyle.principles.dependencyinversion.IGoods;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @date : 2021-09-21 19:15
 * @description :
 */
public class Customer {

    private IGoods goods;

    public void setGoods(IGoods goods) {
        this.goods = goods;
    }

    public void purchase() {
        goods.purchase();
    }
}
