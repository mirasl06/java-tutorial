package collection.drug;

import java.util.Scanner;

public class DrugInputs {
    private final DrugService drugService;

    public DrugInputs() {
        this.drugService = new DrugServiceImpl();
    }


    public void startDrugProject() {

        boolean continueProject = false;

        System.out.println("\nTanlang:\n" +
                "1. Yangi dori qo'shish\n" +
                "2. Dori qidirish\n" +
                "3. Dorilar ro'yhati\n" +
                "4. Dorilarni hammasini o`chirish\n" +
                "5. Bitta dorini o`chirish\n" +
                "6. Dorilarni yangilash\n" +
                "7. Tizimdan chiqish\n");

        System.out.print("Kiriting: ");

        Scanner scanner = new Scanner(System.in);
        int menu;
        menu = scanner.nextInt();

        switch (menu) {
            case 1:
                drugService.create();

                continueProject = true;
                break;
            case 2:
                drugService.search();

                continueProject = true;
                break;
            case 3:
                drugService.getAll();

                continueProject = true;
                break;
            case 4:
                drugService.deleteAll();

                continueProject = true;
                break;
            case 5:
                drugService.delete();

                continueProject = true;
                break;
            case 6:
                drugService.update();

                continueProject = true;
                break;
            case 7:
                System.out.println("Tizimdan chiqish");
                break;
            default:
                System.out.println("Xato raqam kiritildi!");
                continueProject = true;
                break;
        }

        if (continueProject) {
            startDrugProject();
        } else {
            System.exit(0);
        }
    }

}
