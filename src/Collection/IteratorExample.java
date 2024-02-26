package Collection;

import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("Mers");
        cars.add("BMW");
        cars.add("Lexus");

        Iterator<String> iterator = cars.iterator();
        while (iterator.hasNext()) {
            String car = iterator.next();
            System.out.println(car);
        }


        // Set<Integer> - Integer bu wrapper class (int primitiv tip uchun)
        Set<Integer> homeNumbers = new HashSet<>();
        homeNumbers.add(10);
        homeNumbers.add(101);
        homeNumbers.add(1010);
        homeNumbers.add(1011);

        Iterator<Integer> integerIterator = homeNumbers.iterator();
        while (integerIterator.hasNext()) {
            System.out.println(integerIterator.next());
        }

        List<Long> numbers = new LinkedList<>();
        numbers.add(11111L);
        numbers.add(22222L);
        numbers.add(33333L);
        numbers.add(44444L);
        numbers.add(55555L);
        Iterator<Long> longIterator = numbers.iterator();
        while (longIterator.hasNext()) {
            System.out.println(longIterator.next());
        }


        /**
         * Kolleksiyalar bilan har doim WRAPPER CLASS larni ishlatamiza!
         * https://www.w3schools.com/java/java_wrapper_classes.asp
         */

    }
}
