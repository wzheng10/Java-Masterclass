import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        try {
            int result = divide();
            System.out.println(result);
        } catch (ArithmeticException| NoSuchElementException e) { // way to check for multiple exceptions
            System.out.println(e.toString());
            System.out.println("Unable to perform division, autopilot shutting down");
        }
    }

    private static int divide() {
        int x, y;
//        try {
            x = getInt();
            y = getInt();
            System.out.println("x is " + x + ", y is " + y);
            return x / y;
//        } catch (NoSuchElementException e) {     //catches all non-integers
//            throw new NoSuchElementException("No suitable input");
//        } catch (ArithmeticException e) {       //catches all 0
//            throw new ArithmeticException("attempt to divide by 0");
//        }
    }

    private static int getInt() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer ");
        while (true) {
            try {
                return s.nextInt();
            } catch (InputMismatchException e) {
                //go around again. Read past the end of line in the input first
                s.nextLine();
                System.out.println("Enter a number: ");
            }
        }
    }
}
