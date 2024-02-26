import java.util.Arrays;

public class EX2aErrays {
    public static void main(String[] args) {

        String[] players = {"Ronaldo", "messi", "suarez", "Salah", "bale", "O`zil", "Iniesta", "Benzema"};
        System.out.println(Arrays.toString(players));

        for (String player : players) {
            int age = 3 * player.length();

            if (age > 18) {
                System.out.println(player);
            }
        }

        /**
         * int salary = 100 * player.length();
         *
         * 1. Oyligi 500 dan katta bo'gan futbolchilar
         * 2. Eng ko'p oylik oladigan futbolchilar
         * 3. Eng kam oylik oladigan futbolchilar
         * 4. Eng yoshi katta futbolchi
         * 5. Eng yoshi kichik futbolchi
         *
         */
    }
}