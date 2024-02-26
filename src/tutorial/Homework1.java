public class Homework1 {
    public static void main(String[] args) {
        int nowSalary = 300;
        int afterOneYears = nowSalary / 100 * 25 + nowSalary;
        int afterTwoYears = afterOneYears / 100 * 25 + afterOneYears;
        int afterThreYears = afterTwoYears / 100 * 25 + afterTwoYears;
        int afterFourYears = afterThreYears / 100 * 25 + afterThreYears;
        int afterFiveYears = afterFourYears / 100 * 25 + afterFourYears;

        System.out.println("After Five Years Salary:" + afterFiveYears + "$");
    }
}
