public class TypeCastingExample {
    public static void main(String[] args) {
        int x = 23;
        long y = x;
        double z = y;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);


        float s = (float) z;
        System.out.println(s);
        short m = (short) s;
        System.out.println(m);
    }
}
