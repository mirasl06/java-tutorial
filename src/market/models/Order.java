package market.models;

import market.enums.Unit;
import market.services.BaseService;

public class Order extends BaseService {
    private int id;
    private Product product;
    private int quantity;
    private Unit unit;
    private String createDateTime;
    private User user;
    private Client client;
    private long orderPrice;

    public Order(int id, Product product, int quantity, Unit unit, String createDateTime, User user, Client client, long orderPrice) {
        this.id = id;
        this.product = product;
        this.quantity = quantity;
        this.unit = unit;
        this.createDateTime = createDateTime;
        this.user = user;
        this.client = client;
        this.orderPrice = orderPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public String getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(String createDateTime) {
        this.createDateTime = createDateTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public long getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(long orderPrice) {
        this.orderPrice = orderPrice;
    }

    public long calculateOrderPrice() {
        return product.getPrice() * quantity;
    }

    @Override
    public void printInfo() {
        System.out.printf("******************\n" +
                "ID: %s\n" +
                "PRODUCT: %s\n" +
                "QUALITY: %s\n" +
                "UNIT: %s\n" +
                "CREAT_DATE: %s\n" +
                "USER: %s\n" +
                "CLIENT: %s\n" +
                "ORDER_PRICE: %s\n" +
                "******************\n", id, product.getName(), quantity, unit, createDateTime, user.getName(), client.getName(), orderPrice);
    }
}
