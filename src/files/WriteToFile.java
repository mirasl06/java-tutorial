package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter person name: ");
        String name = scanner.nextLine();
        System.out.print("Enter person age: ");
        int age = scanner.nextInt();

        FileWriter myWriter = new FileWriter("information.txt", true);
        myWriter.write("\n");
        myWriter.write(String.format("name=%s;age=%s", name, age));
        myWriter.close();
        System.out.println("Successfully wrote to the file.");

        File file = new File("information.txt");
        System.out.println(file.length());
    }
}
