package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        System.out.println(list.size());

        /*
            Huddi List bilan bir xil, faqat unikal elementlarni saqlaydi
         */
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(1);
        set.add(1);
        set.add(1);
        set.add(1);
        System.out.println(set.size());

        Set<String> cars = new HashSet<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mers");
        System.out.println("cars size: " + cars.size());

        // set da element bor yoki yo'qligi tekshirish
        if (cars.contains("Mers")) {
            System.out.println("Bor");
        } else {
            System.out.println("Yo'q");
        }

        cars.remove("BMW");
        System.out.println("cars size: " + cars.size());

        // cars.clear();
        // System.out.println("cars size: " + cars.size());

        for (String car : cars) {
            if (car.equalsIgnoreCase("Mers")) {
                cars.add("AMG");
            }
        }

        System.out.println(cars);
    }
}