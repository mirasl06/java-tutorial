package exercises;

import java.util.Scanner;

public class Calculator {
    public static void main(Exercise[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kalkulator dasturi!");
        System.out.print("Birinchi sonni kiriting: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ikkinchi sonni kiriting: ");
        double num2 = scanner.nextDouble();

        System.out.println("Amaliyotlar: ");
        System.out.println("1. Qo`shish (+)");
        System.out.println("2. Ayirish (-)");
        System.out.println("3. Ko`paytirish (*)");
        System.out.println("4. Bo`lish (/)");
        System.out.print("Tanlang: ");
        int choice = scanner.nextInt();

        double result = 0;
        switch (choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Bo`layotganda 0(No`l) kiritib bo`lmaydi!");
                    return;
                }
                break;
            default:
                System.out.println("Xato!");
                return;
        }

        System.out.println("Natija: " + result);
        scanner.close();
    }
}
