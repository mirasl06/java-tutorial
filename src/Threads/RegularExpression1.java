package Threads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression1 {
    public static void main(String[] args) {
        String regex = "Java";

        String text = "Java is powerfull";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(text);

        if (matcher.find()){
            System.out.println("pattern found");
        }else {
            System.out.println("not found");
        }
    }
}
