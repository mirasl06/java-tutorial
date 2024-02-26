package Collection.car;

import java.util.Scanner;

public class CarsInputs {
    private final CarsService carsService;

    public CarsInputs() {
        this.carsService = new CarServiceInpl();
    }

    public void carProject() {
        boolean cantinueProject = false;
        System.out.println("""

                Tanlang:
                1.Mashina qo`shish
                2.Mashina qidirish
                3.Mashinalar ro`yxati
                4.Mashinalarni o`chirish
                5.Bitta mashinani o`chirish
                6.Mashinalarni yangilash
                7.Dasturdan chiqiqsh
                """);

        System.out.print("Kiriting: ");

        Scanner scanner = new Scanner(System.in);
        int menu = scanner.nextInt();

        switch (menu) {
            case 1:
                carsService.create();
                cantinueProject = true;
                break;
            case 2:
                carsService.search();
                cantinueProject = true;
                break;
            case 3:
                carsService.getAll();
                cantinueProject = true;
                break;
            case 4:
                carsService.deleteAll();
                cantinueProject = true;
                break;
            case 5:
                carsService.delete();
                cantinueProject = true;
                break;
            case 6:
                carsService.update();
                cantinueProject = true;
                break;

            case 7:
                System.out.println("Dasturdan chiqish");
                break;
            default:
                System.out.println("Xato raqam kiritildi!");
                cantinueProject = true;
                break;
        }
        if (cantinueProject) {
            carProject();
        } else {
            System.exit(0);
        }
    }
}
