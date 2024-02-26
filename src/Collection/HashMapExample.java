package Collection;

import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {


        // yengi hashmap ochish
        HashMap<String, String> colorsMap = new HashMap<>();

        colorsMap.put("red", "qizil");
        colorsMap.put("green", "yashil");
        colorsMap.put("white", "oq");

        // elementlar soni, mapni o'lchami
        System.out.println(colorsMap.size());

        // key bo'yicha value ni olish
        System.out.println(colorsMap.get("red"));

        System.out.println(colorsMap);

        HashMap<Integer, String> monthsMap = new HashMap<>();
        monthsMap.put(1, "January");
        monthsMap.put(2, "February");
        monthsMap.put(3, "March");
        monthsMap.put(4, "April");
        monthsMap.put(5, "May");
        monthsMap.put(6, "June");
        monthsMap.put(7, "July");
        monthsMap.put(8, "August");
        monthsMap.put(9, "September");
        monthsMap.put(10, "October");
        monthsMap.put(11, "November");
        monthsMap.put(12, "December");

        System.out.println(monthsMap);
    }
}
