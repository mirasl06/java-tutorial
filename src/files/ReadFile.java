package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("sonlar.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()){
            String text = scanner.nextLine();
        }
        scanner.close();

        if (file.exists()) {
            System.out.println("File name: " + file.getName());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("Writeable: " + file.canWrite());
            System.out.println("Readable " + file.canRead());
            System.out.println("File size in bytes " + file.length());
        } else {
            System.out.println("The file does not exist.");
        }
    }
}
