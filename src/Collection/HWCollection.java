package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HWCollection {
    public static void main(String[] args) {

        List<String> drugs = new ArrayList<>();

        drugs.add("Sitramon");
        drugs.add("Menovazin");
        drugs.add("Nimesil");
        drugs.add("Parasitamol");
        drugs.add("Gripgo");
        drugs.add("Naftizin");
        drugs.add("Sink");

        System.out.println(Arrays.toString(drugs.toArray()));

        System.out.println(drugs.size());

        System.out.println(drugs.get(0));

        System.out.println(drugs.get(drugs.size() - 1));

        System.out.println(drugs.get(3));

        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Dorilar Ro`yxati: %s\n", Arrays.toString(drugs.toArray()));

        System.out.print("Qidirilayotgan Dori: ");

        String searchedDrug = scanner.nextLine();
        boolean drugsIsExists = false;

        for (String drug : drugs) {
            if (drug.equalsIgnoreCase(searchedDrug)) {
                drugsIsExists = true;
                break;
            }
        }

        if (drugsIsExists) {
            System.out.println("Bu dori mavjud!");
        } else {
            System.out.println("Bu dori mavjud emas!");
        }
    }
}
