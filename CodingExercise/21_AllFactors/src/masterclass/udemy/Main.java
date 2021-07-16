package masterclass.udemy;

public class Main {

    public static void main(String[] args) {
        printFactors(6);
        printFactors(17);
    }

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }
        for (int divisor = 1; divisor >= number; divisor++) {
            if (number % divisor == 0) {
                System.out.println(divisor);
            }
        }
    }
}
