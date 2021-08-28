package masterclass.udemy;

public class Main {

    public static void main(String[] args) {
        String string = "I am a string. Yes, I am.";
        System.out.println(string);
        String yourString = string.replaceAll("I", "You");
        System.out.println(yourString);

        String alphanumeric = "abcDeeeF12Ghhiiiijkl99z";
        System.out.println(alphanumeric.replaceAll(".","Y"));

        System.out.println(alphanumeric.replaceAll("^abcDeee", "YYY"));

        String secondString= "abcDeeeF12GhhabcDeeeiiiijkl99z";
        System.out.println(secondString.replaceAll("^abcDeee", "YYY")); //^ means to match only the start

        System.out.println(alphanumeric.matches("^hello")); //false
        System.out.println(alphanumeric.matches("^abcDeee")); //false
        System.out.println(alphanumeric.matches("abcDeeeF12Ghhiiiijkl99z")); // true

        System.out.println(alphanumeric.replaceAll("ijkl99z$", "THE END") );
        System.out.println(alphanumeric.replaceAll("[aei]", "X") );
        System.out.println(alphanumeric.replaceAll("[aei]", "I replaced a letter here"));
        System.out.println(alphanumeric.replaceAll("[aei][Fj]", "X"));

        System.out.println("harry".replaceAll("[hh]arry", "Harry"));

        System.out.println(alphanumeric.replaceAll("[^ej]", "X"));
        System.out.println(alphanumeric.replaceAll("[abcdef345678]", "X"));
        System.out.println(alphanumeric.replaceAll("[a-fA-F3-8]", "X"));
        System.out.println(alphanumeric.replaceAll("(?i)[a-f3-8]", "X"));

        //replacing digits
        System.out.println(alphanumeric.replaceAll("[0-9]", "X"));  //abcDeeeFXXGhhiiiijklXXz
        System.out.println(alphanumeric.replaceAll("\\d", "X"));    //abcDeeeFXXGhhiiiijklXXz
        //replace all non-digits
        System.out.println(alphanumeric.replaceAll("\\D", "X"));       //XXXXXXXX12XXXXXXXXXX99X

        String hasWhitespace = "I have blanks and \ta tab, and also a newline\n";
        System.out.println(hasWhitespace);
        //removing white space
        System.out.println(hasWhitespace.replaceAll("\\s", ""));
        System.out.println(hasWhitespace.replaceAll("\t", "X"));
        //removes all non-white space characters
        System.out.println(hasWhitespace.replaceAll("\\S", ""));
        //replaces all characters and leaves the white spaces
        System.out.println(alphanumeric.replaceAll("\\w", "X"));
        System.out.println(hasWhitespace.replaceAll("\\w", "X"));
        //Surrounds each word with the " "
        System.out.println(hasWhitespace.replaceAll("\\b", "X"));


    }
}
