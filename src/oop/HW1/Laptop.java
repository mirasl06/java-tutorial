package oop.HW1;

/**
 * Product parent class dan Laptop child class yaratildi
 */
public class Laptop extends Product {
    private String model;
    private String brand;

    public Laptop(int id, String name, double price, String created_date, String model, String brand) {
        super(id, name, price, created_date);
        this.model = model;
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Bu Poliformizm
    @Override
    public void printInfo() {
        super.printInfo();
    }
}
