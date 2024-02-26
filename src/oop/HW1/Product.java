package oop.HW1;

/**
 * OOP ustunlaridan birinchisi: Inheritance (Voris olish: parent va child class)
 */
public class Product {
    private int id;
    private String name;
    private double price;
    private String created_date;

    public Product(int id, String name, double price, String created_date) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.created_date = created_date;
    }

    /**
     * OOP ustunlaridan ikkinchisi: Encapsulation (classimizda private bo'lgan attributlarni olish)
     * <p>
     * Encapsulation: ishlatish uchun GETTER va SETTOR metodlar yaratishizim kerak!
     * <p>
     * GET: attributni qiymatini olish uchun
     * SET: attributga qiymat berish yoki o'zgartirish uchun
     */

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCreated_date() {
        return created_date;
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    // Bu Poliformizm
    public void printInfo() {
        System.out.printf("******************\n" +
                "ID: %s\n" +
                "NAME: %s\n" +
                "PRICE: %s\n" +
                "CREATED_DATE: %s\n" +
                "******************\n", id, name, price, created_date);
    }
}
