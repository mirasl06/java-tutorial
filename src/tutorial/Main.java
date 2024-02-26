import methods.MethodsExample1;

public class Main {
    public static void main(String[] args) {
//        int max = MethodsExample1.max(12, 32, 121);
//        System.out.println(max);
//        String weekDay = MethodsExample1.weekDay(10);
//        System.out.println(weekDay);

//        double sum = MethodsExample1.usdToUzs(100);
//        System.out.println(sum);
//
//        double dollar = MethodsExample1.uzsToUsd(1235000);
//        System.out.println(dollar);

//        double sum = MethodsExample1.converter("USD_TO_UZS", 100);
//        System.out.println("Sum: " + sum);
//
//        double dollar = MethodsExample1.converter("UZS_TO_USD", 1235000);
//        System.out.println("Dollar: " + dollar);
//
//        double euro = MethodsExample1.converter("UZS_TO_EURO", 1235000);
//        System.out.println("Euro: " + euro);

        int[] massiv = {17, 32, 352, -45, 34, 3, 4, 342, 2, -6, 9, 13, 44, 25, 84, 73};

        int min = MethodsExample1.minimum(massiv);
        System.out.println(min);

        int max = MethodsExample1.maximum(massiv);
        System.out.println(max);

        MethodsExample1.possession(massiv);

        int sum = MethodsExample1.total(massiv);
        System.out.println("Sum: " + sum);

        MethodsExample1.toq(massiv);

        MethodsExample1.num(massiv);

        MethodsExample1.help(0);
    }
}
