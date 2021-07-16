package masterclass.udemy;

public class Main {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int commonDivisor = 0;
        for (int divisor = 1; divisor <= first; divisor++){
            if(first % divisor == 0 && second % divisor == 0){
                commonDivisor = divisor;
            }
        }
        return commonDivisor;
    }
}
