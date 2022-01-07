package com.kyle.design.state.order;

import java.util.Map;

/**
 * Description :  Order service interface
 *
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 */
public interface OrderService {
    // create order
    Order create();
    // pay for order
    Order pay(int id);
    // deliver order
    Order deliver(int id);
    // receive order
    Order receive(int id);
    // get all orders info
    Map<Integer, Order> getOrders();
}
