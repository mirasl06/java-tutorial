package Collection.dictionary;

import java.util.Scanner;

public class DictionaryInputs {
    private final DictionaryService dictionaryService;

    public DictionaryInputs() {
        this.dictionaryService = new DictionaryServiceImpl();
    }

    public void dictionaryProject() {
        boolean continueProject = false;

        System.out.println("\n Tanlang\n" +
                "\n1.So`z qo`shish\n" +
                "\n2.So`z qidirish\n" +
                "\n3.So`zlar ro`yxati\n" +
                "\n4.Bitta so`zni o`chirish\n" +
                "\n5.So`zlarni yangilash\n" +
                "\n6.Dasturdan chiqiqsh\n");

        System.out.print("Kiriting: ");

        Scanner scanner = new Scanner(System.in);
        int menu = scanner.nextInt();

        switch (menu) {
            case 1:
                dictionaryService.create();
                continueProject = true;
                break;
            case 2:
                dictionaryService.search();
                continueProject = true;
                break;
            case 3:
                dictionaryService.getAll();
                continueProject = true;
                break;
            case 4:
                dictionaryService.delete();
                continueProject = true;
                break;
            case 5:
                dictionaryService.update();
                continueProject = true;
                break;
            case 6:
                System.out.println("Dasturdan chiqish");
                break;
            default:
                System.out.println("Xato raqam!");
                continueProject = true;
                break;
        }

        if (continueProject) {
            dictionaryProject();
        } else {
            System.exit(0);
        }
    }
}
