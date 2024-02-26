package collection.Home.Task;

import java.util.*;

public class RaqamdanRimga {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Raqamni kiriting: ");
//        int Raqam = scanner.nextInt();
//
//        if (Raqam < 1 || Raqam > 15) {
//            System.out.println("Noto'g'ri kirish. Raqam 1 dan 15 gacha bo'lishi kerak.");
//        } else {
//            String rimRaqam = convertNumberToRoman(Raqam);
//            System.out.println("Rim raqami: " + rimRaqam);
//        }

        System.out.println(romanToInteger("VI"));
        System.out.println(romanToInteger("XVI"));
        System.out.println(romanToInteger("IV"));
        System.out.println(romanToInteger("XIV"));
        System.out.println(romanToInteger("IX"));
    }

    public static String convertNumberToRoman(int raqam) {
        Map<Integer, String> rimRaqamlar = new HashMap<>();
        rimRaqamlar.put(1, "I");
        rimRaqamlar.put(5, "V");
        rimRaqamlar.put(10, "X");
        rimRaqamlar.put(50, "L");
        rimRaqamlar.put(100, "C");
        rimRaqamlar.put(500, "D");
        rimRaqamlar.put(1000, "M");

        return rimRaqamlar.get(raqam);
    }

    public static int romanToInteger(String roman) {
        Map<Character, Integer> romansMap = new HashMap<>();
        romansMap.put('I', 1);
        romansMap.put('V', 5);
        romansMap.put('X', 10);
        romansMap.put('L', 50);
        romansMap.put('C', 100);
        romansMap.put('D', 500);
        romansMap.put('M', 1000);

        char[] symbols = roman.toCharArray();
        int number = 0;

        for (int i = 0; i < symbols.length; i++) {

            if (i != symbols.length - 1) {

                int currentNumber = romansMap.get(symbols[i]);
                int nextNumber = romansMap.get(symbols[i + 1]);

                if (currentNumber < nextNumber) {
                    number += -currentNumber;
                } else {
                    number += currentNumber;
                }

            } else {
                number += romansMap.get(symbols[i]);
            }
        }

        return number;
    }

    public static void lambda() {
        List<String> list = new ArrayList<>();
        list.add("Messi");
        list.add("Ronaldo");
        list.forEach(e -> {
            if (e.equals("Messi")) {
                System.out.println(e);
            }
        });
    }
}
