package oop;

public class Fruit {
    public String name;
    public String color;
    public int price;

    public  boolean tropic=false;

    public void printFruitInfo() {
        System.out.printf("####################\n" +
                "Name: %s\n" +
                "Color: %s\n" +
                "Price: %s\n" +
                "Tropic: %s\n" +
                "####################\n", name, color, price,tropic);
    }
    static String information(final String Information){
        System.out.println("this fruit useful for healthy");
        return Information;

    }
    static String Tropic(String a){
        System.out.println("tropic emas");
        return a;
    }

}
