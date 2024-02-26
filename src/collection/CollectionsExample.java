package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CollectionsExample {

    public static void main(String[] args) {

        /**
         * java.util
         *
         * Collections - to'plamlar
         *
         * 1. List - Ro'yhat
         *
         *    - ArrayList - dinamik massivlar
         *    - LinkedList
         *
         */

//
//        int[] massiv = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(massiv));
//
//        massiv[6] = 16;
//        System.out.println(Arrays.toString(massiv));

        /*

        // ArrayList yaratish
        List<Integer> list = new ArrayList<>();

        // ArrayList ga element qo'shish
        list.add(1);
        list.add(12);
        list.add(13);
        list.add(25);
        list.add(38);
        list.add(88);
        list.add(56);
        list.add(2);

        System.out.println(Arrays.toString(list.toArray()));

        // ArrayList ning oxirgi elementini o'chirish
        list.remove(list.size() - 1);

        System.out.println(Arrays.toString(list.toArray()));

        // ArrayList ni tozalash, ya'ni hamma elementlarini o'chirib yuborish
        list.clear();

        System.out.println(Arrays.toString(list.toArray()));

         */


        // ArrayList yaratish
        List<String> cars = new ArrayList<>();

        // ArrayList ga element qo'shish
        cars.add("BMW");
        cars.add("Mers");
        cars.add("Tayota");
        cars.add("Taho");
        cars.add("Cherry");
        cars.add("Honda");
        cars.add("Lexus");
        cars.add("Mazda");

        System.out.println(Arrays.toString(cars.toArray()));

        // ArrayList ni size, elementlari soni
        System.out.println(cars.size());

        // ArrayList ni birinchi elementini topish (indeksi 0 dan boshlanadi)
        System.out.println(cars.get(0));

        // ArrayList ni oxirgi elementini topish (size - 1)
        System.out.println(cars.get(cars.size() - 1));

        // ArrayList dan 3-joy(index)da turgan elementni o'zgartirish
        System.out.println(cars.get(3));
        cars.set(3, "Malibu");

        System.out.println();

        /**
         * Avtosalonda haridor qidirgan mashina bor yoki yo'q ekanini aniqlash.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Avtosalonda mavjud mashinalar: %s\n", Arrays.toString(cars.toArray()));
        System.out.print("Qidirilayotgan mashina modelini kiriting: ");

        String searchedCar = scanner.nextLine();
        boolean carIsExists = false;

        for (String car : cars) {
            if (car.equalsIgnoreCase(searchedCar)) {
                carIsExists = true;
                break;
            }
        }

        if (carIsExists) {
            System.out.println("Bu mashina salonda mavjud!");
        } else {
            System.out.println("Bu mashina salonda mavjud emas!");
        }
    }
}
