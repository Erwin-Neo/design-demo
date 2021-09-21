package com.kyle.principles.openclose;


import org.junit.Test;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @description :
 */
public class OpenCloseExampleTest {

    @Test
    public void testOpenCloseExample() {
        IGoods macProDiscountGoods = new MacProDiscountGoods("SH1972202109211643", "Mac Pro", 12999.0);
        MacProDiscountGoods macPro = (MacProDiscountGoods) macProDiscountGoods;
        System.out.println("MacProDiscountGoods::" + macPro);
    }
}