package tutorial;

import java.util.Scanner;

public class LoopHW1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int a;
        for (int i = 0; i <= t; i++) {
            if (i % 10==0) {
                System.out.println(i);
            }
        }


//   int i=1;
//   while (i<=100){
//       if (i%4==0 || i%5==0){                   //true
//           System.out.println(i);
//       }
//       i++;
//   }


    }

}
