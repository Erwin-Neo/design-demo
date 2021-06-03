package com.kyle.design.strategy.pay.port;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @date : 2021-06-04 06:55
 * @description :
 */
public class UnionPayService extends PaymentService {

    @Override
    public String getServiceName() {
        return "支付方式选择: 银联支付....";
    }

    @Override
    public double queryBalance(String accountID) {
        return 2999;
    }
}

