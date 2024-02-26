import java.util.Arrays;

public class HW3Arrays {
    public static void main(String[] args) {
        String[] players = {"Ronaldo", "messi", "suarez", "Salah", "bale", "O`zil", "Iniesta", "Benzema", "Odil Ahmedov"};
        System.out.println(Arrays.toString(players));

        int maxAge = 0;
        for (String player : players) {
            int age = 3 * player.length();

            if (age > maxAge) {
                maxAge = age;
            }
        }

        System.out.println("max age: " + maxAge);

        for (String player : players) {
            int age = 3 * player.length();

            if (age == maxAge) {
                System.out.println(player);
            }
        }
    }
}