package oop;

public class Drug {
    public String name;
    public int price;

    /**
     * static bu class ga tegishli bo'lgan metod yoki attribut
     */
    public static boolean isExists;

    public Drug() {
    }

    public Drug(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void printDruginfo() {
        System.out.printf("**************\n" +
                "Name: %s\n" +
                "Price: %s\n" +
                "**************\n", name, price);
    }

    /**
     * static bu class ga tegishli bo'lgan metod yoki attribut
     */
    public static void getClassName() {
        System.out.println("My class name is Drug");
    }
}
