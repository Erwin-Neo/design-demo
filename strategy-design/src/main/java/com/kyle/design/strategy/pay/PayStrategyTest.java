package com.kyle.design.strategy.pay;

import com.kyle.design.strategy.pay.port.PayStrategy;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @date : 2021-06-04 07:14
 * @description :
 */
public class PayStrategyTest {

    public static void main(String[] args) {
        Order order = new Order("ID20220701102930", "ZJ1000918293043", 200);
        System.out.println(order.pay(PayStrategy.ALI_PAY));
    }
}
