public class Drugs {

    /**
     * int num: Bu bitta pochkadagi dorilar soni
     * String name: Bu dorining nomi
     * boolean isDrugTypePill: Bu dorining turi tabletka ekani
     *
     * @param args
     */
    public static void main(String[] args) {
        int num;
        String name;
        boolean isDrugTypePill;

        num = 90;
        name = "indapamid";
        isDrugTypePill = true;

        System.out.printf("num: %s \n" +
                        "name: %s \n" +
                        "tabletka: %s",
                num, name, isDrugTypePill);
    }
}
