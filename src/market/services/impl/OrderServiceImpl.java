package market.services.impl;

import market.models.Client;
import market.models.Order;
import market.models.Product;
import market.models.User;
import market.enums.Unit;
import market.services.ClientService;
import market.services.OrderService;
import market.services.ProductService;
import market.services.UserService;

import java.util.Scanner;

public class OrderServiceImpl implements OrderService {

    @Override
    public Order createOrder() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("New Order: \n");

        System.out.println("Please enter product: ");
        ProductService productService = new ProductServiceImpl();
        Product product = productService.createProduct();

        System.out.println("Please enter quantity: ");
        int quantity = scanner.nextInt();

        System.out.println("Please enter unit: ");
        String unit = scanner.next();

        System.out.println("Please enter createDateTime: ");
        String createDateTime = scanner.next();

        System.out.println("Please enter user: ");
        UserService userService = new UserServiceImpl();
        User user = userService.createUser();

        System.out.println("Please enter client: ");
        ClientService clientService = new ClientServiceImpl();
        Client client = clientService.createClient();

        Order order = new Order(123, product, quantity, Unit.valueOf(unit), createDateTime, user, client, 0);
        order.setOrderPrice(order.calculateOrderPrice());

        return order;
    }

    @Override
    public void deleteOrder() {
        System.out.println("delete order");
    }
}
