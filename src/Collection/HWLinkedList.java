package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class HWLinkedList {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<>();
        cars.add("Malibu");
        cars.add("Spark");
        cars.add("Lacetti");
        cars.add("Jentra");
        cars.add("Captiva");
        cars.add("Equnox");
        cars.add("Nexia");
        System.out.println(Arrays.asList(cars.toArray()));
        cars.addFirst("Monza");
        cars.addLast("Epica");
        System.out.println(Arrays.asList(cars.toArray()));
        cars.removeLast();
        cars.removeFirst();
        System.out.println(Arrays.asList(cars.toArray()));
    }
}
