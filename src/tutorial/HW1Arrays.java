import java.util.Arrays;

public class HW1Arrays {
    public static void main(String[] args) {
        String[] players = {"Ronaldo", "messi", "suarez", "Salah", "bale", "O`zil", "Iniesta", "Benzema"};
        System.out.println(Arrays.toString(players));

        for (String player : players) {
            int salary = 100 * player.length();

            if (salary > 500) {
                System.out.println(player);
            }
        }
    }
}
