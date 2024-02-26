package strings;


import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class String1 {

    public static void main(String[] args) {

        /**
         * String bu - Final klass - bu degani undan extends olib bo'lmaydi.
         */

        String text = "salom";

//        System.out.println(text);
//
//        text = "qwert";
//
//        System.out.println(text);
//
//        String s1 = "salom";
//        String s2 = "salom";
//        String s3 = new String("salom");
//
//        System.out.println(s1 == s2);
//        System.out.println(s1.hashCode());
//        System.out.println(s2.hashCode());
//
//        System.out.println(s2 == s3);
//        System.out.println(s3.hashCode());
//        System.out.println(s3);

        // Stringni bo'shmasligini tekshirish, string qiymati bo'sh bo'lsa TRUE
        boolean isEmpty = text.isEmpty();
        System.out.println("text.isEmpty(): " + isEmpty);

        // stringni uzunligini qaytaradi
        int length = text.length();
        System.out.println("text.length(): " + length);

        // stringni boshqa bir object bilan taqqoslash, teng bo'lsa TRUE
        boolean equals = text.equals("salom");
        System.out.println("text.equals(\"salom\"): " + equals);

        //
        boolean equalsIgnoreCase = text.equalsIgnoreCase("SALOM");
        System.out.println("text.equalsIgnoreCase(\"SALOM\"): " + equalsIgnoreCase);

        byte[] bytes = text.getBytes(StandardCharsets.UTF_8);
        System.out.println("text.getBytes(StandardCharsets.UTF_8): " + bytes);

        text = text.toLowerCase();
        System.out.println("text.toLowerCase(): " + text);

        text = text.toUpperCase();
        System.out.println("text.toUpperCase(): " + text);

        text = text.concat(" DUNYO");
        System.out.println("text.concat(\"DUNYO\"): " + text);

        text = text.substring(2);
        System.out.println("text.substring(2): " + text);

        text = text.substring(5, 7);
        System.out.println("text.substring(5,7): " + text);

        text = "Hello world, welcome to our world-0";

        // text ni boshidan qidiradi
        int index = text.indexOf("world");
        System.out.println("text.indexOf(\"world\"): " + index);

        // text ni oxiridan qidiradi
        index = text.lastIndexOf("world");
        System.out.println("text.lastIndexOf(\"world\"): " + index);

        boolean check = text.startsWith("Hello");
        System.out.println("text.startsWith(\"Hello\"): " + check);

        check = text.endsWith("Hello");
        System.out.println("text.endsWith(\"Hello\"): " + check);

        boolean exists = text.contains("our");
        System.out.println("text.contains(\"our\"): " + exists);

        text = text.repeat(3);
        System.out.println("text.repeat(3): " + text);

        text = text.replace("world", "kids");
        System.out.println("text.replace(\"world\", \"kids\"): " + text);

        text = text.replaceAll(" ", "");
        System.out.println("text.replaceAll(\"\\r\\n\", \"\"): " + text);

        String[] array = text.split(",");
        System.out.println("text.split(\",\"): " + Arrays.toString(array));

        char[] symbols = text.toCharArray();
        System.out.println("text.toCharArray(): " + Arrays.toString(symbols));

        char c = text.charAt(1);
        System.out.println("text.charAt(1): " + c);


    }
}
