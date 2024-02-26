package collection;

import java.util.HashMap;

public class HWHashmap {
    public static void main(String[] args) {
        HashMap<String, String> daysMap = new HashMap<>();

        daysMap.put("1", "Monday");
        daysMap.put("2", "Tuesday");
        daysMap.put("3", "Wednesday");
        daysMap.put("4", "Thursday");
        daysMap.put("5", "Friday");
        daysMap.put("6", "Saturday");
        daysMap.put("7", "Sunday");

        System.out.println(daysMap);
        System.out.println(daysMap.size());


    }
}
