package masterclass.udemy;

public class Main {

    public static void main(String[] args) {
        System.out.println(reverse(5));
        System.out.println(getDigitCount(0));
        numberToWords(100);
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int count = getDigitCount(number);
        number = reverse(number);
        for (int i = 0; i < count; i++) {
            int digit = number % 10;
            switch (digit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    break;
            }
            number /= 10;
        }
    }

    public static int reverse(int num) {
        int reversed = 0;
        while (num != 0) {
            reversed = (reversed * 10) + (num % 10);
            num /= 10;
        }
        return reversed;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int count = 0;
        do {
            number /= 10;
            count++;
        } while (number > 0);
            return count;
    }
}