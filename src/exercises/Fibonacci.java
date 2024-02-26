package exercises;

import java.util.Scanner;

public class Fibonacci {
    public static void main(Exercise[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qancha Fibonachchi sonini ko'rsatmoqchisiz? ");
        int n = scanner.nextInt();
        int a = 1;
        int b = 1;
        for (int i = 0; i < n; i++) {
            int c = a + b;
            a = b;
            b = c;
          //  System.out.println("a=" + a);
            //System.out.println("b=" + b);
            System.out.println("c=" + c);
        }
    }

}
