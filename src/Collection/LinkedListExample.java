package Collection;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("Messi");
        list.add("Ronaldo");
        list.add("Zidane");
        list.add("Pirlo");

        System.out.println(Arrays.asList(list.toArray()));

        list.addFirst("Odil Ahmedov");

        System.out.println(Arrays.asList(list.toArray()));

        list.addLast("Iniesta");

        System.out.println(Arrays.asList(list.toArray()));

        list.removeFirst();

        System.out.println(Arrays.asList(list.toArray()));

        list.removeLast();

        System.out.println(Arrays.asList(list.toArray()));

        System.out.println(list.getFirst());
        System.out.println(list.getLast());

//        for (String element : list) {
//            System.out.println(element);
//        }
    }
}
