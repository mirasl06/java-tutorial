package market;

import market.enums.Unit;
import market.models.*;
import market.services.BaseService;
import market.services.UserService;
import market.services.impl.UserServiceImpl;

public class Main {

    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();

        User admin = new User(1, "Ne'matov Javod", "javod", "javod123", "admin", "9989944085082");

        Category drinks = new Category(1, "Ichimliklar");
        Category foods = new Category(2, "Oziq-ovqat maxsulotlari");

        Product cola = new Product(1, "Coca Cola 1,5", 1200000L, 1100000L, "2023-12-06", "2025-12-06", drinks);
        Product fanta = new Product(2, "Fanta 1,5", 1200000L, 1100000L, "2023-12-06", "2025-12-06", drinks);
        Product guruch = new Product(3, "Alanga", 1200000L, 1100000L, "2023-12-06", "2025-12-06", foods);

        Client client = new Client(2, "Abbos", "9912345678");

        Order order1 = new Order(45, cola, 34, Unit.DONA, "2023-12-08", admin, client, 0);
        order1.setOrderPrice(order1.calculateOrderPrice());

        Order order2 = new Order(46, fanta, 50, Unit.DONA, "2023-12-08", admin, client, 0);
        order2.setOrderPrice(order2.calculateOrderPrice());

        Order order3 = new Order(47, guruch, 10, Unit.KILOGRAM, "2023-12-08", admin, client, 0);
        order3.setOrderPrice(order3.calculateOrderPrice());

//        admin.printInfo();
//        drinks.printInfo();
//        cola.printInfo();
//        client.printInfo();

//        order1.printInfo();
//        order2.printInfo();
//        order3.printInfo();

        long ordersPriceInTiyin = BaseService.sumOrderPrices(order1, order2, order3);
//        System.out.printf("All orders price in tiyin: %s\n", ordersPriceInTiyin);
//        System.out.printf("All orders price in sum: %s\n", BaseService.tiyinToSum(ordersPriceInTiyin));
//

        userService.createUser();
        userService.updateUser();
        userService.deleteUser();
    }
}
