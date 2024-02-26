package market.inputs;

import market.models.Order;
import market.services.OrderService;
import market.services.impl.OrderServiceImpl;

public class OrderInputs {

    public static void main(String[] args) {
        OrderService orderService = new OrderServiceImpl();
        Order order = orderService.createOrder();
        order.printInfo();
    }
}
