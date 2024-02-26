package tutorial;

public class AssignmentOperators {
    public static void main(String[] args) {
        int x = 14;
        x += 5;
        x = x + 5;
        System.out.println(x);
        x -= 5;
        x = x - 5;
        System.out.println(x);
        x *= 5;
        x = x * 5;
        System.out.println(x);
        x /= 5;
        x = x / 5;
        System.out.println(x);
        x %= 5;
        x = x % 5;
        System.out.println(x);

//        x &= 5;
//        System.out.println(x);
//        x |= 5;
//        System.out.println(x);
//        x ^= 5;
//        System.out.println(x);
//        x <<= 11;
//        System.out.println(x);
//        x >>= 11;
//        System.out.println(x);
//
        System.out.println(Integer.toBinaryString(4));
//        System.out.println(Integer.toBinaryString(11));

        System.out.println(3 % 10);


    }
}
