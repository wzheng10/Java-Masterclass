package masterclass.udemy;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static int sumFirstAndLastDigit (int number) {
        if (number < 0) {
            return -1;
        }
        int firstNum = number % 10;
        while (number > 9 ) {
            number /= 10;
        }
        return firstNum + number;
    }
}
