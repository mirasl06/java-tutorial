public class EX1 {
    public static void main(String[] args) {
//        int year = 43;
//
//        if (year < 12) {
//            System.out.println("bola");
//        } else if (12 < year && year < 18) {
//            System.out.println("o`smir");
//        } else if (30 < year && year < 60) {
//            System.out.println("Yigit");
//        } else if (year > 60) {
//            System.out.println("qariya");
//        }

//        int time = 20;
//        String result = (time < 18) ? "Good day." : "Good evening.";
//        System.out.println(result);

        int year = 2026;
        if (year % 2 == 0) {
            System.out.println("JUFT");
        } else {
            System.out.println("TOQ");
        }


        String result = (year % 2 == 0) ? "JUFT" : "TOQ";
        System.out.println(result);

        int ball = 88;
        int baho = (ball > 85) ? 5 : (ball > 56 && ball < 86) ? 4 : 3;
        System.out.println("Baho: " + baho);
    }
}
