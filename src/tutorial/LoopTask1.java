package tutorial;

public class LoopTask1 {

    public static void main(String[] args) {
        int[] array = {-1, 24, -3, 5, 2, 7, 0, -9};

        System.out.println("Min = " + findMin(array));
        System.out.println("Max = " + findMax(array));
        System.out.println("countOnlyMinusNumbers = " + countOnlyMinusNumbers(array));
        System.out.println("countNumbers = " + countNumbers(array));
        System.out.println("countOddNumbers = " + countOddNumbers(array));
        System.out.println("sumOfElement = " + sumOfElement(array));
        System.out.println("findNumberFromArray = " + findNumberFromArray(array,7));
    }

    private static int findMin(int[] array) {
        int min = array[0];

        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }

        return min;
    }

    private static int findMax(int[] array) {
        int max = array[0];

        for (int j : array) {
            if (j > max) {
                max = j;
            }
        }

        return max;
    }

    private static int countOnlyMinusNumbers(int[] array) {
        int count = 0;
        for (int i : array) {
            if (i < 0) {
                count++;
            }
        }
        return count;
    }

    private static int countNumbers(int[] array) {
        int count = 0;
        for (int i : array) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    private static int countOddNumbers(int[] array) {
        int count = 0;
        for (int i : array) {
            if (i % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    private static int sumOfElement(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    private static boolean findNumberFromArray(int[] array, int n) {
        for (int i : array) {
            if (i == n) {
                return true;
            }
        }

        return false;
    }

}
