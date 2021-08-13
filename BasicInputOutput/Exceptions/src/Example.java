import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        int result = divide();
        System.out.println(result);
    }

    private static int divide() {
        int x, y;
        try {
            x = getInt();
            y = getInt();
        } catch(NoSuchElementException e) {     //catches all non-integers
            throw new ArithmeticException("No suitable input");
        }
        System.out.println("x is " + x + ", y is " + y);
        try {
            return x / y;
        } catch(ArithmeticException e) {    //catches the 0 attempt when dividing
            throw new ArithmeticException("attempt to divide by 0");
        }
    }

    private static int getInt() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer ");
        while(true) {
            try {
                return s.nextInt();
            } catch(InputMismatchException e) {
                //go around again. Read past the end of line in the input first
                s.nextLine();
                System.out.println("Enter a number: ");
            }
        }
    }
}
