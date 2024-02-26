package oop.HW1;

public class Cars {
    public static void main(String[] args) {
        Car car1 = new Car("Malibu 2", 33000, "Black", "4");

        System.out.println(car1.getName());
        System.out.println(car1.getPrice());

        car1.setPrice(21300);
        System.out.println(car1.getPrice());

        Malibu malibu1 = new Malibu("Malibu", 28000, "White", "2", "petrol");
        Malibu malibu2 = new Malibu("Malibu", 23000, "Green", "3", "petrol");

        malibu1.printinfo();
        malibu2.printinfo();

        PetrolPrice petrolPrice1 = new PetrolPrice();
        System.out.println(petrolPrice1.calculate());
        petrolPrice1.printGasPrice();
    }
}
