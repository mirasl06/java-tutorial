package collection.tutorial;

import java.util.ArrayList;

public class ArrayListExample2 {
    public static void main(String[] args) {
        ArrayList<String> text = new ArrayList<>();
        text.add("Sardor");
        text.add("Abbos");
        text.add("Diyor");
        System.out.println(text);

        text.set(0,"Doniyor");
        System.out.println(text);

        text.remove(2);
        System.out.println(text);

        text.get(1);
        System.out.println(text);

        text.ensureCapacity(1);
        System.out.println(text);

        text.size();
        System.out.println(text);

    }

}
