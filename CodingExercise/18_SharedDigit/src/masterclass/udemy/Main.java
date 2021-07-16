package masterclass.udemy;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if (num1 >= 10 && num1 <= 99 && num2 >= 10 && num2 <= 99) {

            int num1Digit1 = num1 / 10;
            int num1Digit2 = num1 % 10;
            int num2Digit1 = num2 / 10;
            int num2Digit2 = num2 % 10;

            if (num1 >= 10 && num1 <= 99 && num2 >= 10 && num2 <= 99) {
                if (num1Digit1 == num2Digit1 || num1Digit1 == num2Digit2 || num1Digit2 == num2Digit1 || num1Digit2 == num2Digit2) {
                    return true;
                }
            }
        }
        return false;
    }
}
