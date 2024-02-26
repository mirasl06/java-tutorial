import java.util.Arrays;

public class MultidimensionalArraysExample {
    public static void main(String[] args) {
//        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}, {8, 9}};
////        System.out.println(myNumbers[1][2]); // Outputs 7
////        System.out.println(myNumbers[0][1]); // Outputs 2
//
//        for (int i = 0; i < myNumbers.length; i++) {
//            for (int j = 0; j < myNumbers[i].length; j++) {
//                System.out.print(myNumbers[i][j] + " ");
//            }
//            System.out.println();
//        }

//        String[][] symbols = {{" ", " ", "*"}, {" ", "*", "*"}, {"*", "*", "*"}};
//        for (int i = 0; i < symbols.length; i++) {
//            for (int j = 0; j < symbols[i].length; j++) {
//                System.out.print(symbols[i][j] + " ");
//            }
//            System.out.println();
//        }

        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println(myNumbers[1][2]);
        myNumbers[1][2] = 9;
        System.out.println(myNumbers[1][2]); // Outputs 9 instead of 7

        System.out.println(myNumbers[0][3]);
        myNumbers[0][3] = 66;
        System.out.println(myNumbers[0][3]);

        for (int i = 0; i < myNumbers.length; i++) {
            for (int j = 0; j < myNumbers[i].length; j++) {
                System.out.print(myNumbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
