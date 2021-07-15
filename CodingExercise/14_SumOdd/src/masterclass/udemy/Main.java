package masterclass.udemy;

public class Main {
    public static void main(String[] args) {
        System.out.println(sumOdd(1, 100));
    }

    public static boolean isOdd(int number){
        if (number <= 0) {
            return false;
        } else if (number % 2 == 0) {
            return false;
        }
        return true;
    }

    public static int sumOdd(int start, int end){
        if (end < start || end < 0 || start < 0) {
            return -1;
        }
        int sum = 0;
        for (int i = start; i <= end; i++){
            if(isOdd(i)){
                sum += i;
            }
        }
        return sum;
    }
}
