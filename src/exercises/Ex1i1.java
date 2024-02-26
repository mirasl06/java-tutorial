package exercises;

public class Ex1i1 {
    public static void main(String[] args) {
        String str = "hi there, hi how are you? hi";
        int count = countOccurrences(str, "hi");
        System.out.println("Number of occurrences of 'hi': " + count);
    }

    public static int countOccurrences(String str, String subStr) {
        int count = 0;
        int lastIndex = 0;

        while (lastIndex != -1) {
            lastIndex = str.indexOf(subStr, lastIndex);
            if (lastIndex != -1) {
                count++;
                lastIndex += subStr.length();
            }
        }
        return count;
    }
}
