package tutorial;

public class BreakAndContinueExample {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);

            if (i == 47) {
                System.out.println("break");
                break;
            }
        }

        for (int i = 0; i < 100; i++) {
            if (i == 47) {
                System.out.println("break");
                continue;
            }

            System.out.println(i);
        }
    }
}
