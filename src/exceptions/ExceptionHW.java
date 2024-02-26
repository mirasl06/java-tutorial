package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Tel nomer kiriting: ");
            long phoneNumber = scanner.nextLong();

            if (String.valueOf(phoneNumber).length() != 12) {
                throw new RuntimeException("Xato nomer kiritildi!");
            }

            String code = String.valueOf(phoneNumber).substring(3, 5);
            System.out.println(code);

            if (code.equals("90")) {
                System.out.println("Beline");
            } else if (code.equals("91")) {
                System.out.println("Beline");
            } else if (code.equals("93")) {
                System.out.println("Usell");
            } else if (code.equals("94")) {
                System.out.println("Usell");
            } else if (code.equals("95")) {
                System.out.println("Uzmobile");
            } else if (code.equals("97")) {
                System.out.println("Mobi");
            } else if (code.equals("99")) {
                System.out.println("Uzmobile");
            } else if (code.equals("33")) {
                System.out.println("Humans");
            } else if (code.equals("88")) {
                System.out.println("Humans");
            } else {
                System.out.println("Xato");
            }

        } catch (InputMismatchException e) {
            throw new RuntimeException("Nomer faqat raqamlardan iborat bo'lishi kerak!");
        }
    }
}
