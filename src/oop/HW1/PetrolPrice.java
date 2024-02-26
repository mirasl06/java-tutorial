package oop.HW1;

public class PetrolPrice extends Gas {
    @Override
    public int calculate() {
        return 10;
    }

    @Override
    public void printGasPrice() {
        System.out.println("Petrol Price");
    }


}
