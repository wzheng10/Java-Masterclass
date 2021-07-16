package masterclass.udemy;

public class Main {
    public static void main(String[] args){
        System.out.println(isPalindrome(11));
    }
    public static boolean isPalindrome(int number) {

        if (number < 0) {
            number *= -1;
        }
        int reverse = 0;
        int stored = number;
        while (stored != 0) {
            reverse +=stored % 10;
            stored /= 10;
            reverse *= 10;
            if (stored < 10) {
                reverse += stored % 10;
                break;
            }
        }
        System.out.println(number);
        System.out.println(reverse);
        if (number == reverse) {

            return true;
        } else {
            return false;
        }
    }
}
