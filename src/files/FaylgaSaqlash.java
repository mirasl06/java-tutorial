package files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FaylgaSaqlash {
    public static void main(String[] args) {
        // Fayl nomi va joylashuvi
        String faylNomi = "sonlar.txt";

        try {
            // Faylni yaratish va ochish
            BufferedWriter faylYozuv = new BufferedWriter(new FileWriter(faylNomi));

            Scanner scanner = new Scanner(System.in);
            System.out.println("Iltimos, konsoldan kiritilgan sonlarni saqlash uchun 'stop' ni bosing.");

            // Konsoldan sonlarni olish va faylga yozish
            while (true) {
                System.out.print("Sonni kiriting: ");
                String kiritilganQator = scanner.nextLine();

                if (kiritilganQator.equalsIgnoreCase("stop")) {
                    break;
                }

                try {
                    int son = Integer.parseInt(kiritilganQator);
                    faylYozuv.write(Integer.toString(son));
                    faylYozuv.newLine();
                } catch (NumberFormatException e) {
                    System.out.println("Noto'g'ri format! Iltimos, sonni qaytadan kiriting.");
                }
            }

            // Faylni yopish
            faylYozuv.close();
            scanner.close();
            System.out.println("Sonlar faylga saqlandi.");

        } catch (IOException e) {
            System.out.println("Xato yuz berdi: " + e.getMessage());
        }
    }
}

