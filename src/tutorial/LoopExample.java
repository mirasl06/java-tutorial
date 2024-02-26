package tutorial;

public class LoopExample {
    public static void main(String[] args) {

//        int i = 1;
//        while (i < 10) {
//            System.out.println(i);
//            i++;
//        }

//        int i = 1;
//        while (i < 100) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//            i++;
//        }

//        int i = 1;
//        while (i < 100) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println(i);
//            }
//            i++;
//        }

//        int a = 50;
//        while (a < 100) {
//            if (a % 4 == 0) {
//                System.out.println(a);
//            }
//            a++;
//        }

//        int year = 2023;
//        while (year < 2033) {
//            System.out.println(year);
//            year++;
//        }

//        int age = 25;
//        do {
//            System.out.println(age);
//            age += 2;
//        } while (age > 30);
//
//        System.out.println(age);
//
//        while (age > 30) {
//            System.out.println(age);
//            age += 2;
//        }

//        for (int i = 2; i < 100; i += 2) {
//            System.out.println(i);
//        }

//        for (int i = 1; i < 100; i++) {
//            if (i % 4 == 0 || i % 7 == 0) {
//                System.out.println(i);
//            }
//        }

        // 2, 3, 5, 7, 11, 13, ...
//        for (int a = 2; a < 100; a++) {
//            int count = 0;
//            for (int b = 1; b <= a; b++) {
//                if (a % b == 0) {
//                    count++;
//                }
//            }
//
//            if (count == 2) {
//                System.out.println(a);
//            }
//        }

//        for (int i = 0; i < 5; i++) {
//            System.out.print("XY");
//        }

//        for (int i = 0; i < 5; i++) {
//            if (i % 2 == 0) {
//                System.out.print("0");
//            } else {
//                System.out.print("1");
//            }
//        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
