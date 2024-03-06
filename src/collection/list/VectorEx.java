package collection.list;

import java.util.Arrays;
import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {

        Vector<Integer> integerVector = new Vector<>();
        integerVector.add(1);
        integerVector.add(12);
        integerVector.add(11);
        integerVector.add(13);

        System.out.println(Arrays.toString(integerVector.toArray()));

    }
}
