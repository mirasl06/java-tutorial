package methods;

public class Drug {
    static void tabletka(String name) {
        System.out.println(name);
    }

    static void tabletka(String name, int price) {
        System.out.println(name + " is " + price);
    }

    static int price(String name) {
        return name.length() * 100;
    }

    static boolean check(String name) {
        if (name.length() % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
