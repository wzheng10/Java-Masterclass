package masterclass.udemy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        String challenge1 = "I want a bike.";
        System.out.println(challenge1.matches("I want a bike\\."));

        String challenge2 = "I want a ball.";
        String regExp = "I want a \\w+.";   //\\w means any word
        System.out.println(challenge1.matches(regExp));
        System.out.println(challenge2.matches(regExp));


        Pattern challenge3Pattern = Pattern.compile("I want a (ball|bike).");
        Matcher challenge3Matcher = challenge3Pattern.matcher(challenge1);
        System.out.println(challenge3Matcher.matches());

        challenge3Matcher = challenge3Pattern.matcher(challenge2);
        System.out.println(challenge3Matcher.matches());

        String challenge4 = "Replace all blanks with underscores";
        System.out.println(challenge4.replaceAll(" ", "_"));
        System.out.println(challenge4.replaceAll("\\s", "_"));
        //        System.out.println(challenge5.matches("[abcdefg]+"));


        String challenge5 = "aaabccccccccdddefffg";
        System.out.println(challenge5.matches("^a{3}bc{8}d{3}ef{3}g$"));
        //^ Finds a match as the beginning of a string and $ Finds a match at the end of the string

        String challenge7 = "abcd.135"; //match
        String challenge7a = "kjisl.22"; //match
        String challenge7b = "f5.12a"; //not match
        System.out.println(challenge7.matches("[a-z]+\\.[0-9]+"));
        System.out.println(challenge7.matches("^[A-Z][a-z]+\\.\\d+$"));
//        System.out.println(challenge7b.matches("[a-z]+\\.[0-9]+"));

    }


}
