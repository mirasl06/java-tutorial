package oop.HW1;

public class Client {
    private int id;
    public String name;
    public String phoneNumber;
    public int age;

    public static boolean isClientHasCard;

    // Bu konstruktor
    public Client(int id, String name, String phoneNumber, int age) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public void printClientInfo() {
        System.out.printf("\n" +
                "Client id: %s \n" +
                "Client name: %s \n" +
                "Client age: %s \n" +
                "Client phone number: %s \n" +
                "Client has credit card: %s \n", id, name, age, phoneNumber, isClientHasCard);
    }
}
