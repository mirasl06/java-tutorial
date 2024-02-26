package methods;

public class MethodsEx {
    public static void main(String[] args) {
        Drug.tabletka("Sitramon");
        Drug.tabletka("Nimesil", 200);
        Drug.tabletka("Parasitamol", 500);
        int price = Drug.price("Insti");
        System.out.println(price);
        boolean chack = Drug.check("Bolnol");
        System.out.println(chack);
    }

}
