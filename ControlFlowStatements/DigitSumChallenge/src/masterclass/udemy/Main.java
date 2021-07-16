package masterclass.udemy;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(654));
    }

    public static int sumDigits(int number) {

        if(number < 10) {
            return -1;
        }
        int sum = 0;
        while( number > 0) {
//            System.out.println(sum);
            sum += number % 10;
//            System.out.println(number);
            number = number / 10;
        }
        return sum;
    }
}
