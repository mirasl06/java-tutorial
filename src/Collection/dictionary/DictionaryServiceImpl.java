package Collection.dictionary;

import java.util.*;

public class DictionaryServiceImpl implements DictionaryService {

    private final HashMap<String, Dictionary> dictionaryHashMap;

    public DictionaryServiceImpl() {
        this.dictionaryHashMap = new HashMap<>();
    }

    @Override
    public void create() {
        System.out.println("\nYangi soz qo'shish");

        Scanner scanner = new Scanner(System.in);

        System.out.print("o`zbekcha so`zni kiriting: ");
        String uz = scanner.nextLine();

        System.out.print("inglizcha so`zni kiriting: ");
        String en = scanner.nextLine();

        System.out.print("ruscha so`zni kiriting: ");
        String ru = scanner.nextLine();

        dictionaryHashMap.put(en, new Dictionary(en, uz, ru));
        System.out.println("Yangi so`z qo'shildi!");
    }

    @Override
    public void update() {
        System.out.println("\nYangilanayotgan so`z");

        Scanner scanner = new Scanner(System.in);

        System.out.print("inglizcha so`zni kiriting: ");
        String en = scanner.nextLine();

        System.out.print("o`zbekcha so`zni kiriting: ");
        String uz = scanner.nextLine();

        System.out.print("ruscha so`zni kiriting: ");
        String ru = scanner.nextLine();

        if (dictionaryHashMap.containsKey(en)) {
            Dictionary dictionary = dictionaryHashMap.get(en);
            dictionary.setRu(ru);
            dictionary.setEn(en);
            dictionary.setUz(uz);

            dictionaryHashMap.put(en, dictionary);

            System.out.println("so`z yangilandi");
        } else {
            System.out.println("Bunday so`z mavjud emas");
        }
    }

    @Override
    public void delete() {
        System.out.println("\nso`zni o`chirish");
        Scanner scanner = new Scanner(System.in);

        System.out.print("inglizcha so`zni kiriting: ");
        String en = scanner.nextLine();

        if (dictionaryHashMap.containsKey(en)) {
            dictionaryHashMap.remove(en);

            System.out.println("so`z o`chirildi");
        } else {
            System.out.println("Bunday so`z mavjud emas");
        }
    }

    @Override
    public void search() {
        System.out.println("so`zni qidirish\n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qidirilayotgan so`zni kiriting:");
        String searchedWord = scanner.nextLine();

        boolean isSearched = false;
        for (Dictionary value : dictionaryHashMap.values()) {
            if (value.getUz().equalsIgnoreCase(searchedWord)
                    || value.getEn().equalsIgnoreCase(searchedWord)
                    || value.getRu().equalsIgnoreCase(searchedWord)) {
                System.out.println(value);
                isSearched = true;
                break;
            }
        }

        if (!isSearched) {
            System.out.println("Bunday so`z mavjud emas!");
        }
    }

    @Override
    public void getAll() {

        if (dictionaryHashMap.isEmpty()) {
            System.out.println("\nso`zlar mavjud emas!");
        } else {
            System.out.println("\nso`zlar ro`yhati");
        }

        for (Map.Entry<String, Dictionary> entry : dictionaryHashMap.entrySet()) {
            System.out.printf("key: %s, value: %s \n", entry.getKey(), entry.getValue().toString());
        }
    }
}
