package tutorial;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        String[] cars = {"Tiko", "Matiz", "Damas", "Spark", "Nexia", "Kobolt"};

        // massivni uzunligi yoki elementlari soni
        //System.out.println(cars.length);

        // massivni nolinchi indeksda turgan elementni topish
        //System.out.println(cars[0]);

        // massivni oxirgi elementini topish
        //System.out.println(cars[cars.length - 1]);

//        for (int i = 0; i < cars.length; i++) {
//            System.out.println(cars[i]);
//        }

//        for (String car : cars) {
//            System.out.println(car);
//        }

//        boolean carIsExist = false;
//        String clientSearchedCar = "spark";
//        for (String car : cars) {
//            if (clientSearchedCar.equalsIgnoreCase(car)) {
//                carIsExist = true;
//            }
//        }

        // if(carIsExist == true) bilan bir xil
//        if (carIsExist) {
//            System.out.println("Salonda siz tanlagan mashina mavjud!");
//        } else {
//            System.out.println("Salonda siz tanlagan mashina mavjud emas, afsus!");
//        }


        System.out.println(cars[0]);

        cars[0] = "Malibu";

        System.out.println(cars[0]);

//        for (String car : cars) {
//            System.out.println(car);
//        }

        System.out.println(Arrays.toString(cars));
    }
}
