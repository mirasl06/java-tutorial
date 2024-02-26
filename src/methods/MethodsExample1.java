package methods;

public class MethodsExample1 {
    public static int max(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }

    public static String weekDay(int index) {
        String weekDay = null;
        switch (index) {
            case 1:
                weekDay = "Monday";
                break;
            case 2:
                weekDay = "Thuesday";
                break;
            case 3:
                weekDay = "Wednesday";
                break;
            case 4:
                weekDay = "Thursday";
                break;
            case 5:
                weekDay = "Friday";
                break;
            case 6:
                weekDay = "Saturday";
                break;
            case 7:
                weekDay = "Sunday";
                break;
            default:
                break;
        }
        return weekDay;
    }

    public static double usdToUzs(int dollar) {
        double course = 12350;
        return dollar * course;
    }

    public static double uzsToUsd(int sum) {
        double course = 12350;
        return sum / course;
    }

    public static double converter(String convertType, int amount) {
        if (convertType.equals("USD_TO_UZS")) {
            return usdToUzs(amount);
        } else if (convertType.equals("UZS_TO_USD")) {
            return uzsToUsd(amount);
        }
        throw new RuntimeException("Incorrect converter type");
    }

    public static int minimum(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int maximum(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void possession(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    public static int total(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static void toq(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    public static void num(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 50 && array[i] > 10) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    public static int help(int i) {
        if (i == 10) {
            System.out.println("Help");
            return 0;
        }
        return help(++i);
    }
}
