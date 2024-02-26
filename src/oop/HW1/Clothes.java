package oop.HW1;

/**
 * Product parent class dan Clothes child class yaratildi
 */
public class Clothes extends Product {
    private String brand;
    private String color;
    private int size;

    public Clothes(int id, String name, double price, String created_date, String brand, String color, int size) {
        super(id, name, price, created_date);
        this.brand = brand;
        this.color = color;
        this.size = size;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    // Bu Poliformizm
    @Override
    public void printInfo() {
        super.printInfo();
    }
}
