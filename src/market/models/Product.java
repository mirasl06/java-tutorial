package market.models;

import market.services.BaseService;

public class Product extends BaseService {
    private int id;
    private String name;
    private long price; // tiyinda
    private long salePrice; // tiyinda
    private String createDate;
    private String expiryDate;
    private Category category;

    public Product(int id, String name, long price, long salePrice, String createDate, String expiryDate, Category category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.salePrice = salePrice;
        this.createDate = createDate;
        this.expiryDate = expiryDate;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(long salePrice) {
        this.salePrice = salePrice;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public void printInfo() {
        System.out.printf("******************\n" +
                "ID: %s\n" +
                "NAME: %s\n" +
                "PRICE: %s\n" +
                "SALE_PRICE: %s\n" +
                "CREATE_DATE: %s\n" +
                "EXPIRY_DATE: %s\n" +
                "CATEGORY: id: %s, name: %s\n" +
                "******************\n", id, name, price, salePrice, createDate, expiryDate, category.getId(), category.getName());
    }
}
