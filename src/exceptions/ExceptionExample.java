package exceptions;

import java.io.File;
import java.io.IOException;

public class ExceptionExample {
    public static void main(String[] args) {

        /*

        // Unchecked exception
        int a = 10;
        int b = 0;
        int c = a / b;
        System.out.println(c);
        System.out.println("Bu qator ishlidimi ?");

         */

        // Checked exception
        File file = new File("e://test.txt");
        try {
            file.createNewFile();
            System.out.println("Yangi fayl yaratildi!");
        } catch (IOException e) {
            System.out.println("Catch bloki ishladi!");
            throw new RuntimeException(e);
        }
    }
}
