package exercises;

import java.util.Scanner;

public class TeskariSon {
    public static void main(Exercise[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Salom! Teskari sonni chiqazib beruvchi dasturga xush kelibsiz!");

        System.out.print("Biror son kiriting: ");
        int son = scanner.nextInt();
        int teskari = reverseNumber(son);

        System.out.println(son + " ning teskarisi: " + teskari);

        scanner.close();
    }

    // Metod sonni teskarisini chiqazadi
    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
}
