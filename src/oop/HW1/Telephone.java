package oop.HW1;

/**
 * Product parent class dan Telephone child class yaratildi
 */
public class Telephone extends Product {
    private String model;
    private String color;

    public Telephone(int id, String name, double price, String created_date, String model, String color) {
        super(id, name, price, created_date);
        this.model = model;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Bu Poliformizm
    @Override
    public void printInfo() {
        super.printInfo();
    }
}
