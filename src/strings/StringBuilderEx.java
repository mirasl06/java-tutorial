package strings;

public class StringBuilderEx {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append(" Java");
        stringBuilder.reverse();

        System.out.println(stringBuilder);
    }
}
