package collection.drug;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class DrugServiceImpl implements DrugService {

    private List<Drug> drugList;

    private final FileService fileService;

    public DrugServiceImpl() {
        this.fileService = new FileServiceImpl();
        this.drugList = new ArrayList<>();

    }

    @Override
    public void create() {
        System.out.println("\nYangi dori qo'shish");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Dori nomini kiriting: ");
        String name = scanner.nextLine();

        System.out.print("Dori narxini kiriting: ");
        long price = scanner.nextLong();

        Drug drug = new Drug(name, price);

        drugList.add(drug);

        fileService.write(drug);

        System.out.println("Yangi dori qo'shildi !!!");
    }

    @Override
    public void deleteAll() {
        System.out.println("\nDorilarni hammasini o`chirish");
        drugList.clear();
        fileService.write(drugList);
        System.out.println("\nDorilarni hammasini o`chirildi");

    }

    @Override
    public void delete() {
        System.out.println("\nDorini o`chirish");
        Scanner scanner = new Scanner(System.in);
        String deletedDrugName = scanner.nextLine();


        boolean isDeleted = false;

        Iterator<Drug> iterator = drugList.iterator();
        while (iterator.hasNext()) {

            Drug drug = iterator.next();
            if (drug.getName().equalsIgnoreCase(deletedDrugName)) {
                iterator.remove();
                isDeleted = true;
                break;
            }
        }
        if (isDeleted) {
            System.out.println("Dori o`chirildi");
            fileService.write(drugList);
        } else {
            System.out.println("Bunday dori mavjud emas");
        }
    }

    @Override
    public void update() {
        System.out.println("\nYangilanayotgan dorini kiriting: ");

        Scanner scanner = new Scanner(System.in);
        String updatingDrugName = scanner.nextLine();
        System.out.println("Yangi narxini kiriting: ");
        long updatingDrugPrice = scanner.nextLong();
        boolean isUpdated = false;


        for (int i = 0; i < drugList.size(); i++) {
            if (drugList.get(i).getName().equalsIgnoreCase(updatingDrugName)) {
                Drug drug = drugList.get(i);
                drug.setPrice(updatingDrugPrice);

                drugList.set(i, drug);
                isUpdated = true;
                break;
            }
        }

        if (isUpdated) {
            System.out.println("Dori yangilandi");
            fileService.write(drugList);
        } else {
            System.out.println("Bunday dori mavjud emas");
        }
    }

    @Override
    public void search() {
        System.out.println("\nDori qidirish");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Qidirilayotgan dori nomini kiriting: ");
        String searchedDrug = scanner.nextLine();

        boolean isDrugExists = false;

        fileService.read();

        for (Drug drug : drugList) {
            if (drug.getName().equalsIgnoreCase(searchedDrug)) {
                isDrugExists = true;

                System.out.println(drug);
                break;
            }
        }

        if (!isDrugExists) {
            System.out.println("Bunday dori bizda yo'q !");
        }
    }

    @Override
    public void getAll() {
        this.drugList = fileService.read();
        if (drugList.isEmpty()) {
            System.out.println("\nHali dorilar mavjud emas!");
        } else {
            System.out.println("\nDorilar ro'yhati");
        }

        for (Drug drug : drugList) {
            System.out.println(drug.toString());
        }
    }
}
