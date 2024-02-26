import java.util.Arrays;

public class HW2Arrays {
    public static void main(String[] args) {
        String[] players = {"Ronaldo", "messi", "suarez", "Salah", "bale", "O`zil", "Iniesta", "Benzema", "Odil Ahmedov"};
        System.out.println(Arrays.toString(players));

        int maxSalary = 0;
        for (String player : players) {
            int salary = 100 * player.length();

            if (salary > maxSalary) {
                maxSalary = salary;
            }
        }

        System.out.println("max salary: " + maxSalary);
        for (String player : players) {
            int salary = 100 * player.length();

            if (salary == maxSalary) {
                System.out.println(player);
            }
        }
    }
}
