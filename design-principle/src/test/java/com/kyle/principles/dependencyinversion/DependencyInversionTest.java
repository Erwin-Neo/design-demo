package com.kyle.principles.dependencyinversion;


import org.junit.Test;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @date : 2021-09-21 19:16
 * @description :
 */
public class DependencyInversionTest {

    @Test
    public void testDependencyInversion() {
        Customer customer = new Customer();
        customer.setGoods(new MacProGoods());
        customer.purchase();
    }
}