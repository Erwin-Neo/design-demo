package com.kyle.design.strategy.pay.port;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @description :
 */
public class PayStrategy {

    public static final String ALI_PAY = "AliPay";
    public static final String JD_PAY = "JDPay";
    public static final String WECHAT_PAY = "WeChatPay";
    public static final String UNION_PAY = "UnionPay";
    public static final String DEFAULT_PAY = ALI_PAY;

    private static final Map<String, PaymentService> strategy = new ConcurrentHashMap<>();

    static {
        strategy.put(ALI_PAY, new AliPayService());
        strategy.put(JD_PAY, new JDPayService());
        strategy.put(WECHAT_PAY, new WeChatPayService());
        strategy.put(UNION_PAY, new UnionPayService());
    }


    public static PaymentService get(String payKey) {
        if (!strategy.containsKey(payKey)) {
            return strategy.get(DEFAULT_PAY);
        }
        return strategy.get(payKey);
    }

}
