public class OperatorsExample {
    public static void main(String[] args) {

        /**
         * Arifmetik operatorlar
         *
         * +

         int piyoz = 2;
         int kartoshka = piyoz * 3;
         System.out.println(piyoz + kartoshka);


         int ali = 12;
         int akasi = ali * 2;
         int opasi = ali + akasi + 10;
         System.out.println(opasi);


         int nowSalary = 500;
         int afterOneYear = nowSalary * 2;
         int afterTwoYear = afterOneYear * 2;
         int afterThreeYear = afterTwoYear * 2;
         int afterFouryear = afterThreeYear * 2;
         int afterFiveYear = afterFouryear * 2;

         System.out.println(afterFiveYear);*/

        int pamidor = 4000;
        int bodiring = pamidor + 2000;
        int piyoz = (pamidor + bodiring) / 2;
        System.out.println("Piyoz: " + piyoz);
        System.out.println("Jami: " + (pamidor + bodiring + piyoz));
    }
}
