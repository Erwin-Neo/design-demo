package com.kyle.design.state.order;

/**
 * Description :
 *
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 */
public class Order {
    private int id;
    private OrderStatus status;

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Order id：" + id + ", Order Status：" + status;
    }
}
