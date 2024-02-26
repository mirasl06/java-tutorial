package Threads;

public class ReguralExpression2 {

    public static void main(String[] args) {
        int x = -121;
        boolean result = isPalindrome(x);
        System.out.println(result);
    }
    public static boolean isPalindrome(int x) {
        String num = Integer.toString(x);
        StringBuilder builder = new StringBuilder(num);
        return builder.reverse().toString().equals(num);
    }
}
