package oop.HW1;//package oop.HW1;
//
//import java.util.Scanner;
//
//public class Example {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int t = scanner.nextInt();
//        int sum = 1;
//        int a;
//        for (int i = 10; i < t; i++) {
//
//            if (t % 10 == 0) {
//                System.out.println(t);
//            }
//        }
//        System.out.println(sum);
////       String a="name";
////       String b="age";
////       System.out.println(a.concat(b));
//    }
//}

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 1; i++) {
            System.out.print("Son kiriting: ");

            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();

                if (number > 10) {
                    int shortenedNumber = number % 10;
                    System.out.println("10 ga qisqartilgan qiymat: " + shortenedNumber);
                } else {
                    System.out.println("Son 10 dan kichik yoki teng. Qiymat: " + number);
                }
            } else {
                System.out.println("Butun son kiriting.");
                scanner.next(); // Bufferni tozalash uchun
                i--; // Qayta urinib ko'rish uchun
            }
        }

        scanner.close();
    }
}

