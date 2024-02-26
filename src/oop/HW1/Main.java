package oop.HW1;

public class Main {

    public static void main(String[] args) {
        Product product1 = new Product(1, "Iphone 14", 2000, "2023");

        System.out.println(product1.getName());
        System.out.println(product1.getPrice());

        product1.setPrice(1300);
        System.out.println(product1.getPrice());

        Telephone telephone1 = new Telephone(1, "Iphone 15", 2000, "2023", "apple", "red");
        Telephone telephone2 = new Telephone(2, "Iphone 14", 1000, "2020", "apple", "red");
        Telephone telephone3 = new Telephone(3, "Iphone 13", 500, "2018", "apple", "red");

        telephone1.printInfo();
        telephone2.printInfo();
        telephone3.printInfo();

        // Abstrakt klassdan obyekt olib bo'lmaydi!
        // Table table = new Table();

        Hontaxta hontaxta = new Hontaxta();
        System.out.println(hontaxta.calculate());
        hontaxta.printTableName();
    }
}
