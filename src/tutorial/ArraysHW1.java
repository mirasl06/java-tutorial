package tutorial;

import java.util.Arrays;

public class ArraysHW1 {
    public static void main(String[] args) {
        String[] drugs = {"Parasitamo`l", "Mukaltin", "Sitramon", "Nimesil", "Askarbinka"};
        System.out.println(Arrays.toString(drugs));

        boolean exit = false;
        String searchDrug = "parasitamo`l";
        for (String drug : drugs) {
            if (searchDrug.equalsIgnoreCase(drug)) {
                exit = true;
            }
        }
        if (exit) {
            System.out.println("there is drug");
        } else {
            System.out.println("there is no drug");
        }
    }
}
