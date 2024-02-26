public class StringExample {
    public static void main(String[] args) {
        String text = "My name is John Doe. I am 41 years old.";

        // value ni uzunligini olish
        System.out.println("Length:" + text.length());

        // value ni to'liq kichik harflarga o'zgartirish
        System.out.println("LowerCase:" + text.toLowerCase());

        // value ni to'liq katta harflarga o'zgartirish
        System.out.println("UpperCase:" + text.toUpperCase());

        /**
         * indexOf(searched_text) agar value ni ichida searched_text topilmasa, -1
         * topilsa topilgan text ni index(joylashgan o'rni) si chiqadi
         */
        System.out.println(text.indexOf("Rld"));
        System.out.println(text.indexOf("O"));

        if (text.indexOf("Javod") > -1) {
            System.out.println("Bor");
        } else {
            System.out.println("Yo'q");
        }

//        text = text.toUpperCase();
//        System.out.println(text);

        String addressInfo = "Tashkent, Kara-kamish 1/3";

        String allInfo = text.concat(addressInfo);
        System.out.println(allInfo);

        String firstName = "John ";
        String lastName = "Doe";
        System.out.println(firstName.concat(lastName));

        String txt = "We are the so-called \"Vikings\" from the north.";
        System.out.println(txt);

        String counrty = "I'm from London";
        System.out.println(counrty);

        System.out.println("\nI am from Tashkent");
        System.out.println("\tI am from Tashkent");
        System.out.println("\rI am from Tashkent");
        System.out.println("I\bam from\bTashkent");
        System.out.println("I am\f\ffrom\fTashkent");

    }
}
