package masterclass.udemy;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int sum = 0;
        for (int divisor = 1; divisor < number; divisor++ )
            if(number % divisor == 0){
                sum += divisor;
            }
        if (sum == number){
            return true;
        }
        return false;
    }
}
