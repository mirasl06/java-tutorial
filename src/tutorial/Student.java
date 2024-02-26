public class Student {
    public static void main(String[] args) {
        int birthYear, currentYear, age;
        float commission, salary;
        final char sex = 'M';

        currentYear = 2023;
        String firstName = "John";
        age = 25;
        salary = 3421.3f;
        char salaryCurrencySymbol = '$';
        boolean isMarried = false;

        birthYear = currentYear - age;
        commission = salary * 5 / 100;
        salary = salary * 2;

        System.out.printf("First-name: %s\n" +
                        "Age: %s\n" +
                        "Birth Year: %s\n" +
                        "Salary: %s\n" +
                        "Salary currency: %s\n" +
                        "Is Married: %s\n" +
                        "Commission: %s\n",
                firstName, age, birthYear, salary, salaryCurrencySymbol, isMarried, commission);

        // this is comment
        // System.out.println("this is comment");

        int n = 999999999;
        int a = 1999999999;
        long identificationNumber;

        // string larni ulash uchun + dan foydalanamiz
        System.out.println(firstName + " Doe");


        String number = "9";
        int x = 5;
        int y = 6;
        System.out.println(number + x + y);
        System.out.println(number + (x + y));

    }
}