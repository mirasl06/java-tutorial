package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        String text = "Hello, My name is John Doe. I'm 21 years old. He has a cat. It name is Molly";

        checkPattern(text, "[wrt]");
        checkPattern(text, "[98-99]");
        checkPattern("aaaaaaaa", "[^a]");
        checkPattern(text, "cat|dog|name");
        checkPattern(text, ".name");
        checkPattern(text, "^Hello");
        checkPattern(text, "old$");
        checkPattern(text, "\\bHello");
        checkPattern(text, "\\b");
        checkPattern(text, "\\u1234");
        checkPattern(text, "12+");
        checkPattern(text, "7*");
        checkPattern(text, "9?");
        checkPattern("1223456789", "2{3}");
        checkPattern("88", "8{1,2}");
        checkPattern(text, "3{2,}");


//        String pattern = "ab{2,4}c";
//        String[] testStrings = {"abbc", "abbbc", "abbbbbc", "abbbb"};
//
//        for (String testString : testStrings) {
//            boolean isMatch = testString.matches(pattern);
//            System.out.println(testString + " - " + isMatch);
//        }

//        String pattern = "ab{2,}c";
//        String[] testStrings = {"abbc", "abbbc", "abbbbc"};
//
//        for (String testString : testStrings) {
//            boolean isMatch = testString.matches(pattern);
//            System.out.println(testString + " - " + isMatch);
//        }

//        String pattern = "ab{2}c";
//        String[] testStrings = {"abc", "abbc", "abbbc"};
//
//        for (String testString : testStrings) {
//            boolean isMatch = testString.matches(pattern);
//            System.out.println(testString + " - " + isMatch);
//        }

//        String pattern = "abf?c";
//        String[] testStrings = {"ac", "abc"};
//
//        for (String testString : testStrings) {
//            boolean isMatch = testString.matches(pattern);
//            System.out.println(testString + " - " + isMatch);
//        }

//        String pattern = "ab+c";
//        String[] testStrings = {"abc", "abbc", "abbbc"};
//
//        for (String testString : testStrings) {
//            boolean isMatch = testString.matches(pattern);
//            System.out.println(testString + " - " + isMatch);
//        }

        String pattern = "ab*c";
        String[] testStrings = {"abbbbbbc", "abbbbb", "bbbbbc", "abbbcc", "aabbbbc"};

        for (String testString : testStrings) {
            boolean isMatch = testString.matches(pattern);
            System.out.println(testString + " - " + isMatch);
        }


    }

    private static void checkPattern(String text, String expression) {
        Pattern pattern = Pattern.compile(expression);
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            System.out.println(expression + ": FIND");
        } else {
            System.out.println(expression + ": NOT FOUND");
        }
    }
}
