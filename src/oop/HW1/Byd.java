package oop.HW1;

public class Byd extends Car {

    private String elector;

    public Byd(String name, int price, String colour, String possession) {
        super(name, price, colour, possession);
    }

    public String getElector() {
        return elector;
    }

    public void setElector(String elector) {
        this.elector = elector;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public void printinfo() {
        super.printinfo();
    }
}
