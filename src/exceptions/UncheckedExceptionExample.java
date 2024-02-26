package exceptions;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        System.out.print("x = ");
        int x = scanner.nextInt();
        System.out.print("y = ");
        int y = scanner.nextInt();

        if (y == 0) {
            throw new RuntimeException("Nolga bo'lish mumkin emas!");
        }

        System.out.println("qator ishlidimi ?");
        int c = x / y;
        System.out.println("c = " + c);

         */

        try {
            System.out.print("Tel nomer kiriting: ");
            long phoneNumber = scanner.nextLong();

            if (String.valueOf(phoneNumber).length() != 12) {
                throw new RuntimeException("Xato nomer kiritildi!");
            }

            String code = String.valueOf(phoneNumber).substring(3, 5);
            System.out.println(code);

            HashMap<Integer, String> phoneCodes = new HashMap<>();

            phoneCodes.put(90, "Belline");
            phoneCodes.put(91, "Belline");
            phoneCodes.put(93, "Usell");
            phoneCodes.put(94, "Usell");
            phoneCodes.put(95, "Uzmobile");
            phoneCodes.put(97, "Mobi");
            phoneCodes.put(99, "Uzmobile");
            phoneCodes.put(33, "Humans");
            phoneCodes.put(88, "Humans");

            System.out.println(phoneCodes.get(Integer.parseInt(code)));


        } catch (InputMismatchException e) {
            throw new RuntimeException("Nomer faqat raqamlardan iborat bo'lishi kerak!");
        }
    }
}
