package Threads;

public class CarMain {
    public static void main(String[] args) {
        CarThread car1 = new CarThread("Matiz", 40);
        CarThread car2 = new CarThread("Mers", 42);
        CarThread car3 = new CarThread("BMW", 50);
        CarThread car4 = new CarThread("Nissan", 53);
        CarThread car5 = new CarThread("Tayota", 59);

        car1.start();
        car2.start();
        car3.start();
        car4.start();
        car5.start();
    }
}
