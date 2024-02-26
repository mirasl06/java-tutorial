public class JavaStringHW1 {
    public static void main(String[] args) {
        int x = 432;
        int y = 432;
        int z = 432;

        if (x > y && x > z) {
            System.out.println("x eng kattasi");
        } else if (y > x && y > z) {
            System.out.println("y eng kattasi");
        } else if (z > x && z > y) {
            System.out.println("z eng kattasi");
        } else {
            System.out.println("12345");
        }
    }
}