package exercises;

import java.util.Scanner;

public class StringHW0 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("1 chi textni yozing:");
        String text1 = scanner.nextLine();
        System.out.println("2 chi textni kiriting:");
        String text2 = scanner.nextLine();

        if (text1.length() < text2.length()) {
            System.out.println(text2);
        } else System.out.println(text1);


    }
}
