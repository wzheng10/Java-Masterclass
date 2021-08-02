package masterclass.udemy;

public class Main {

    public static int multiplier = 7;

    public static void main(String[] args) {
//        StaticTest firstInstance = new StaticTest("First Instance");
//        System.out.println(firstInstance.getName() + " is instance number " + StaticTest.getNumInstances());
//
//        StaticTest secondInstance = new StaticTest("Second Instance");
//        System.out.println(secondInstance.getName() + " is instance number " + StaticTest.getNumInstances());
//
//        StaticTest thirdInstance = new StaticTest("Third Instance");
//        System.out.println(thirdInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        int answer = multiply(6);
        System.out.println("The answer is " + answer);
        System.out.println("Multiplier is " + multiplier);
    }

    public static int  multiply(int number) {
        return number * multiplier;
    }
}


//static methods and field belong to the class and not to instances of the class
//We can call static methods from non-static ones with no problems.
//There is nothing to prevent a static method from accessing non-static fields and methods in another class because it creates an instance of a class in order to do so.
//The restriction is purely on a static method accessing non-static methods and fields in its own class.

