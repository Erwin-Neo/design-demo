package com.kyle.design.strategy.pay;

import com.kyle.design.strategy.pay.port.PayStrategy;
import com.kyle.design.strategy.pay.port.PaymentService;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @date : 2021-06-04 06:49
 * @description :
 */
public class Order {

    private final String accountID;
    private final String orderId;
    private final double amount;

    public Order(String accountID, String orderId, double amount) {
        this.accountID = accountID;
        this.orderId = orderId;
        this.amount = amount;
    }

    public MsgResult pay() {
        return pay(PayStrategy.DEFAULT_PAY);
    }

    public MsgResult pay(String payKey) {
        PaymentService payment = PayStrategy.get(payKey);
        System.out.println(payment.getServiceName());
        System.out.println("本次交易金额为" + amount + "，开始扣款");
        return payment.pay(accountID, amount);
    }

}
