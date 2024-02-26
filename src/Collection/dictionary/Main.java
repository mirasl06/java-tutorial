package Collection.dictionary;


import java.util.*;

public class Main {
    public static void main(String[] args) {

        // yengi hashmap ochish
        HashMap<String, Dictionary> dictionaryHashMap = new HashMap<>();

        // elementlar qo'shish
        dictionaryHashMap.put("red", new Dictionary("red", "qizil", "krasniy"));
        dictionaryHashMap.put("white", new Dictionary("white", "oq", "beliy"));
        dictionaryHashMap.put("yellow", new Dictionary("yellow", "sariq", "jeltiy"));

        // konsolga chiqarish
        System.out.println(dictionaryHashMap);

        // o'lchami yoki elemetlari soni
        System.out.println(dictionaryHashMap.size());


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter key: ");
        String key = scanner.nextLine();



        // hashmapdan key bo'yicha value ni olish
        Dictionary dictionary = dictionaryHashMap.get(key);
        if (dictionary != null) {
            System.out.println(dictionary);
        }



        HashMap<String, String> daysMap = new HashMap<>();

        daysMap.put("1", "Monday");
        daysMap.put("2", "Tuesday");
        daysMap.put("3", "Wednesday");
        daysMap.put("4", "Thursday");
        daysMap.put("5", "Friday");
        daysMap.put("6", "Saturday");
        daysMap.put("7", "Sunday");

        // hashmap ni ichida value bor bo'lsa true, yoq bo'lsa false
        if (daysMap.containsValue("Monday")) {
            System.out.println("bunday value bor");
        } else {
            System.out.println("bunday value yo'q");
        }

        // hashmap ni ichida key bor bo'lsa true, yoq bo'lsa false
        if (daysMap.containsKey("3")) {
            System.out.println("bunday key bor");
        } else {
            System.out.println("bunday key yo'q");
        }

        // hashmap dan faqat value larini ro'yhatini olish
        for (Dictionary value : dictionaryHashMap.values()) {
            if (value.getUz().equalsIgnoreCase("sariq")) {
                System.out.println(value);
            }
        }

       /* // hashmap dan faqat key larini ro'yhatini olish
        for (String key : dictionaryHashMap.keySet()) {
            if (key.equalsIgnoreCase("red")) {
                // System.out.println(dictionaryHashMap.get(key));
                System.out.println("Bunday key mavjud");
                break;
            }
        }*/

        dictionaryHashMap.remove("red");

        // hashmap dan key va value larni ro'yhatini olish
        for (Map.Entry<String, Dictionary> map : dictionaryHashMap.entrySet()) {
            System.out.println("Key: " + map.getKey());
            System.out.println("Value: " + map.getValue());
        }

        dictionaryHashMap.clear();

        System.out.println(dictionaryHashMap);


        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        System.out.println(list.size());


    }
}
