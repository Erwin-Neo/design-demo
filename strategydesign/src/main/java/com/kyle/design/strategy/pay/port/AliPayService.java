package com.kyle.design.strategy.pay.port;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @date : 2021-06-04 06:52
 * @description :
 */
public class AliPayService implements PaymentService {

    @Override
    public String getServiceName() {
        return "支付方式选择: 支付宝支付....";
    }

    @Override
    public double queryBalance(String accountID) {
        return 4000;
    }
}
