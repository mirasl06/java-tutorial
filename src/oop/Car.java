package oop;

public class Car {

    // attributlar

    public String name;
    public String color;
    public int price;

    public void printCarInfo() {
        System.out.printf("####################\n" +
                "Name: %s\n" +
                "Color: %s\n" +
                "Price: %s\n" +
                "####################\n", name, color, price);
    }
}
