package com.kyle.design.state.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Description : Order test class
 *
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 */
@SpringBootApplication
public class OrderDrive {
    public static void main(String[] args) {

        Thread.currentThread().setName("Main thread");

        ConfigurableApplicationContext context = SpringApplication.run(OrderDrive.class, args);

        OrderService orderService = (OrderService) context.getBean("orderService");
        orderService.create();
        orderService.create();
        orderService.pay(1);

        new Thread("Client thread") {
            @Override
            public void run() {
                orderService.deliver(1);
                orderService.receive(1);
            }
        }.start();

        orderService.pay(2);
        orderService.deliver(2);
        orderService.receive(2);

        System.out.println("Status of all orders: " + orderService.getOrders());
    }
}
