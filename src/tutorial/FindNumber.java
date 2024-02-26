package tutorial;

public class FindNumber {
    public static void main(String[] args) {
//        System.out.println(num(123456));
        //  a(20);
        //divide(100);
//        int result = divideToTen(253330);
//    }
//
//    public static int divideToTen(int n) {
//
//        if (n <= 10) {
//            return n;
//        }
//
//        n = n / 10;
//        System.out.println(n);
//
//        return divideToTen(n);
//    }


//    public static int num(int num1) {
//        while (num1 > 1) {
//            num1 = num1 / 10;
//            if (num1<10){
//                break;
//            }
//            System.out.println(num1);
//        }
//        return num1;
//    }

//    public static int a(int number) {
//        if (number % 3 == 0 && number % 5 == 0) {
//            System.out.println(number);
//        }else {
//            System.out.println("Xato son");
//        }
//        return number;
//    }

//    public static int divide(int enterNum) {
//        int n = 1;
//        for (int i = 1; i < enterNum; i++) {
//            if (i % 3 == 0 && i % 10 == 0 && i % 15 == 0) {
//                n = n * i;
//            }
//        }
//        System.out.println(n);
//        return n;
//    }
//        String[] name = {"Sardor", "Abbos", "Abror", "Axror", "Yusuf"};
//        for (int a = 0; a < name.length; a++) {
//            System.out.println(name[a]);
//        }
//
//        for (String i:name) {
//            System.out.println(i);
//        }
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) {
                if (i == 16){
                    break;
                }
                System.out.println(i);
            }
        }

    }
}
