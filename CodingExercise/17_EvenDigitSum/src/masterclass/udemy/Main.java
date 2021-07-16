package masterclass.udemy;

public class Main {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int evenSum = 0;
        int remainder = 0;
        while (number > 0) {
            remainder = number % 10;
            if (number % 2 == 0) {
                evenSum += remainder;
            }
            number /= 10;
        }

        return evenSum;
    }
}
