package com.kyle.design.state.order;

/**
 * Description :  Order status
 *
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 */
public enum OrderStatus {

    WAIT_PAYMENT,
    WAIT_DELIVER,
    WAIT_RECEIVE,
    FINISH;
}