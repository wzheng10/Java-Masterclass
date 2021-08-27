package masterclass.udemy;

import java.util.function.Function;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        //    Runnable runnable = new Runnable() {
//        @Override
//        public void run() {
//            String myString = "Let's split this up into an array";
//            String[] parts = myString.split(" ");
//            for (String part : parts) {
//                System.out.println(part);
//            }
//        }
//    };
        //Anonymous Version
        Runnable runnable1 = () -> {
            String myString = "Let's split this up into an array";
            String[] parts = myString.split(" ");
            for (String part : parts) {
                System.out.println(part);
            }
        };

//        StringBuilder returnVal = new StringBuilder();
//        for (int i = 0; i < s.length(); i++) {
//            if (i % 2 == 1) {
//                returnVal.append(s.charAt(i));
//            }
//        }
//
//        return returnVal.toString();
//    }
        Function<String, String> lambdaFunction = s -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(s.charAt(i));
                }
            }

            return returnVal.toString();

        };

//        System.out.println(lambdaFunction.apply("1234567890"));
        String result = everySecondCharacter(lambdaFunction, "1234567890");
        System.out.println(result);

//        Supplier<String> iLoveJava = () -> { return "I love Java!"; };
//        String supplierResult = iLoveJava.get();
//        System.out.println(iLoveJava);

        Supplier<String> iloveJava = () -> {return "I love Java!"; };
        System.out.println(iloveJava.get());


    }

    public static String everySecondCharacter(Function<String, String> func,String source) {
        return func.apply(source);
    }
}
