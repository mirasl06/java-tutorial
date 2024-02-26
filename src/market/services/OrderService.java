package market.services;

import market.models.Order;

public interface OrderService {
    Order createOrder();
    void deleteOrder();
}
