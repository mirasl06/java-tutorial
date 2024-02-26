package strings;

public class StringCoodingBad3 {

    public static int countYZ(String str) {
        int count = 0;
        String[] word = str.split(" ");
        for (String s : word) {
            if (s.endsWith("y") || s.endsWith("z")) {
                count++;
            }
        }

        return count;
    }
}
