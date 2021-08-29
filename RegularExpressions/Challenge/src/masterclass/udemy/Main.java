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


        String challenge8 = "abcd.135uvqz.7tzik.999";
        Pattern pattern8 = Pattern.compile("[A-Za-z]+\\.(\\d+)");
        Matcher matcher8 = pattern8.matcher(challenge8);
        while (matcher8.find()) {
            System.out.println(matcher8.group(1));

        }

        System.out.println("-----------------------------");

        String challenge9 = "abcd.135\tuvqz.7\ttzik.999\n";
        Pattern pattern9 = Pattern.compile("[A-Za-z]+\\.(\\d+)\\s");
        Matcher matcher9 = pattern9.matcher(challenge9);
        while (matcher9.find()) {
            System.out.println(matcher9.group(1));

        }
        String challenge10 = "abcd.135\tuvqz.7\ttzik.999\n";
        Pattern pattern10 = Pattern.compile("[A-Za-z]+\\.(\\d+)\\s");
        Matcher matcher10 = pattern10.matcher(challenge10);
        while (matcher10.find()) {
            System.out.println("start = " + matcher10.start(1) + " end = " + (matcher10.end(1)));

        }

        String challenge11 = "{0, 2}, {0, 5}, {1,3}, {2,4}";
        Pattern pattern11 = Pattern.compile("\\{(.+?)\\}");
        Matcher matcher11 = pattern11.matcher(challenge11);
        while(matcher11.find()) {
            System.out.println("Occurence: " + matcher11.group(1));
        }

        String challenge12 = "11111";
        System.out.println(challenge12.matches("^[0-9]{5}$"));

        String challenge13 = "11111-1111";
        System.out.println(challenge13.matches("^\\d{5}-\\d{4}$"));


        System.out.println("++++++++++++++++++++++++++++++++++");
        System.out.println(challenge12.matches("^\\d{5}(-\\d{4})?$"));
        System.out.println(challenge13.matches("^\\d{5}(-\\d{4})?$"));




    }
}
