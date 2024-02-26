package exercises;

public class CodingBat {


    public static void main(String[] args) {
        System.out.println(countHi("abc"));
        System.out.println(countHi("abc hi ho"));
        System.out.println(countHi("hiABChi hi"));
        System.out.println(countHi("hihi"));

        System.out.println(catDog("dog"));
        System.out.println(catDog("catcat"));
        System.out.println(catDog("1cat1cadodog"));

        System.out.println(countCode("aaacodebbb"));
        System.out.println(countCode("codexxcodeconemkcopekcole"));
        System.out.println(countCode("cozexxcope"));

        System.out.println(endOther("abc","hiAbc"));
        System.out.println(endOther("nmAbC","abC"));
    }

    public static int countHi(String str) {
        String searched = "hi";
        int count = 0;

        int index = str.indexOf(searched);

        while (index > -1) {
            count++;

            str = str.substring(index + searched.length());
            index = str.indexOf(searched);
        }

        return count;
    }


    public static boolean catDog(String str) {
        String cat = "cat";
        String dog = "dog";
        int countCat = 0;
        int countDog = 0;
        String strCat = str;
        String strDog = str;

        int index = strCat.indexOf(cat);
        while (index > -1) {
            countCat++;
            strCat = strCat.substring(index + cat.length());
            index = strCat.indexOf(cat);
        }

        index = strDog.indexOf(dog);
        while (index > -1) {
            countDog++;
            strDog = strDog.substring(index + dog.length());
            index = strDog.indexOf(dog);
        }

        return countCat == countDog;
    }

    public static int countCode(String str) {
        String search = "co";
        int count = 0;

        int index = str.indexOf(search);

        while (index > -1) {
            if (index + 4 <= str.length()
                    && str.substring(index + 3, index + 4).equalsIgnoreCase("e"))
                count++;
            str = str.substring(index + search.length());
            index = str.indexOf(search);
        }
        return count;
    }

    public static boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        if (a.endsWith(b) || b.endsWith(a)){
            return true;
        }
        return false;
    }

    public static boolean xyzThere(String str) {



        return false;
    }

    public static boolean endsLy(String str) {

        return false;
    }



}
