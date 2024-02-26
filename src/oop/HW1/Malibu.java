package oop.HW1;

public class Malibu extends Car {
    private String carPetrol;

    public Malibu(String name, int price, String colour, String possession, String carPetrol) {
        super(name, price, colour, possession);
        this.carPetrol = carPetrol;
    }

    public String getCarPetrol() {
        return carPetrol;
    }

    public void setCarPetrol(String carPetrol) {
        this.carPetrol = carPetrol;
    }

    @Override
    public void printinfo() {
        super.printinfo();
    }
}
