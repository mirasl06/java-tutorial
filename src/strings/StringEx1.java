package strings;

public class StringEx1 {

    public static void main(String[] args) {

        System.out.println(reversWord("JAVOD"));
        System.out.println(reversWord("KIYIK"));
        System.out.println(reversWord("SOAT"));
        System.out.println(reversWord("ONAM"));
        System.out.println(reversWord("TUT"));

        System.out.println(reversWordV2("TOHIR"));
        System.out.println(reversWordV2("PALOV"));
        System.out.println(reversWordV2("AZIZA"));

        System.out.println(reversWordV3("PALOV"));
        System.out.println(reversWordV3("AZIZA"));
    }

    public static String reversWord(String word) {
        String reversWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversWord = reversWord.concat(String.valueOf(word.charAt(i)));
        }
        return reversWord;
    }

    public static String reversWordV2(String word) {
        String reversWord = "";
        char[] massiv = word.toCharArray();
        for (int i = word.length() - 1; i >= 0; i--) {
            reversWord = reversWord.concat(String.valueOf(massiv[i]));
        }
        return reversWord;
    }

    public static String reversWordV3(String word) {
        return new StringBuilder(word).reverse().toString();
    }


}
