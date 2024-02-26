package oop.HW1;

public class Car {
    private String name;
    private int price;
    private String colour;
    private String possession;

    public Car(String name, int price, String colour, String possession) {
        this.name = name;
        this.price = price;
        this.colour = colour;
        this.possession = possession;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getPossession() {
        return possession;
    }

    public void setPossession(String possession) {
        this.possession = possession;
    }

    public void printinfo() {
        System.out.printf("###################\n" +
                "Name: %s\n" +
                "Price: %s\n" +
                "Colour: %s\n" +
                "Possession: %s\n" +
                "###################\n", name, price, colour, possession);
    }

}
