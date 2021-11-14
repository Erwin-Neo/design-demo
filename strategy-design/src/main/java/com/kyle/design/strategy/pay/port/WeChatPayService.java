package com.kyle.design.strategy.pay.port;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @description :
 */
public class WeChatPayService implements PaymentService {

    @Override
    public String getServiceName() {
        return "支付方式选择: 微信支付....";
    }

    @Override
    public double queryBalance(String accountID) {
        return 1000;
    }
}
