package files;

import java.io.File;
import java.io.IOException;

public class CreateFileExample {
    public static void main(String[] args) {
        //fayl yaratish
        File file = new File("information.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File created!");
            } else {
                System.out.println("File already exists");
            }

            System.out.println(file.getName());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.length());

            if (file.delete()) {
                System.out.println("File deleted!");
            }

        } catch (IOException e) {
            System.out.println("Exception: ");
            e.printStackTrace();
        }
    }
}
