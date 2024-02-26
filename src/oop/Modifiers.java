package oop;

public class Modifiers {
    public String name;
    public int number;
    public  int age;

    public Modifiers(String name, int number, int age) {
        this.name = name;
        this.number = number;
        this.age = age;
    }
    public void printPersonsImfo(){
        System.out.printf("\n"+
             "Person Name: %s \n "+
              "Person Number: %s \n"+
                "Person Age: %s \n",name,number,age );

    }
}
