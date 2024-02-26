package Collection.car;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CarServiceInpl implements CarsService {
    private List<Cars> carsList;
    private final FileService fileService;

    public CarServiceInpl() {
        this.fileService = new FileServiceImpl();
        this.carsList = fileService.read();
    }

    @Override
    public void create() {
        System.out.println("\nYangi mashina qo'shish");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Mashinani nomini kiriting: ");
        String name = scanner.nextLine();

        System.out.print("Mashinani narxini kiriting: ");
        int price = scanner.nextInt();

        System.out.print("Mashinani rangini kiriting: ");
        String colour = scanner.next();

        Cars cars = new Cars(name, price, colour);

//        carsList.add(cars);
        fileService.write(cars);

        System.out.println("Yangi mashina qo'shildi!");
    }

    @Override
    public void delete() {
        System.out.println("\nMashinani o`chirish");

        Scanner scanner = new Scanner(System.in);
        System.out.println("O`chirilayotgan mashinani nomini kiriting");
        String deletedCarName = scanner.nextLine();

        boolean isDeleted = false;

        // Kolleksiyadan ma'lumotni o'chirish uchun iteratordan foydalanish kerak!
        // for loop bilan o'chirish xato!
//        for (Cars cars : carsList) {
//            if (cars.getName().equalsIgnoreCase(deletedCarName)) {
//                carsList.remove(cars);
//                isDeleted = true;
//                break;
//            }
//        }

        // Iteratorni ishlatish
        Iterator<Cars> iterator = carsList.iterator();

        // Bu keyingi element borligini tekshirish bor(TRUE) yoki yo'q(FALSE)
        while (iterator.hasNext()) {

            // Kolleksiyadan keyingi elementni olish
            Cars cars = iterator.next();
            if (cars.getName().equalsIgnoreCase(deletedCarName)) {
                // Kolleksiyadan elementni o'chirish
                iterator.remove();
                isDeleted = true;
                break;
            }
        }


        if (isDeleted) {
            System.out.println("Mashina o`chirildi");

            fileService.write(carsList);
        } else {
            System.out.println("Bunday mashina mavjud emas");
        }
    }

    @Override
    public void update() {
        System.out.println("\nYangilanayotgan mashina");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Mashinani nomini kiriting: ");
        String updatingCarName = scanner.nextLine();

        System.out.print("Mashinani narxini kiriting: ");
        int updatingCarPrice = scanner.nextInt();

        System.out.print("Mashinani rangini kiriting: ");
        String updatingCarColour = scanner.next();

        boolean isUpdated = false;
        for (int i = 0; i < carsList.size(); i++) {
            if (carsList.get(i).getName().equalsIgnoreCase(updatingCarName)) {
                Cars cars = carsList.get(i);
                cars.setPrice(updatingCarPrice);
                cars.setColor(updatingCarColour);

                carsList.set(i, cars);
                isUpdated = true;
                break;
            }
        }

        if (isUpdated) {
            System.out.println("Mashina yangilandi");

            fileService.write(carsList);
        } else {
            System.out.println("Bunday mashina mavjud emas");
        }
    }

    @Override
    public void search() {
        System.out.println("Mashinani qidirish\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qidirilayotgan mashinani kiriting:");
        String searchedCar = scanner.nextLine();
        boolean isSearched = false;

        carsList = fileService.read();

        for (Cars cars : carsList) {
            if (cars.getName().equalsIgnoreCase(searchedCar)) {
                isSearched = true;
                System.out.println(cars);
                break;
            }
        }
        if (!isSearched) {
            System.out.println("Bunday mashina mavjud emas!");
        }
    }

    @Override
    public void getAll() {
        this.carsList = fileService.read();

        if (carsList.isEmpty()) {
            System.out.println("\nMashinalar mavjud emas!");
        } else {
            System.out.println("\nMashinalar ro`yhati");
        }
        for (Cars cars : carsList) {
            System.out.println(cars.toString());
        }
    }

    @Override
    public void deleteAll() {
        System.out.println("Mashinalarni hammasini o`chirish");
        carsList.clear();
        fileService.write(carsList);
        System.out.println("Mashinalarni hammasi o`chirildi");
    }
}
