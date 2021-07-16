package masterclass.udemy;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(100));
    }

//    public static int getLargestPrime(int number) {
//        if (number < 2) {
//            return -1;
//        }
//        int largestPrime = 0;
//        for (int divisor = 2; divisor < number/2; divisor++){
//            if((number % divisor == 0) && isPrime(divisor)) {
//                largestPrime = divisor;
//            }
//        }
//        return largestPrime;
//    }
//
//    public static boolean isPrime(int number){
//        if (number < 2){
//            return false;
//        }
//        for (int divisor = 2; divisor < number / 2; divisor++){
//            if(number % divisor == 0){
//                return false;
//            }
//        }
//        return true;
//    }

    /////////Super Simple Alternative/////////////
    public static int getLargestPrime(int number) {
       if (number < 2) {
           return -1;
       }
       for(int i = 2; i < number; i++){
           if((number % i) == 0) {
               number /= i;
               i--;
           }
       }
       return number;
    }
}
