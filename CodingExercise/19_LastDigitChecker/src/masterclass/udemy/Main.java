package masterclass.udemy;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(31, 22, 71));
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
//        if (num1 < 10 || num1 > 1000 || num2 < 10 || num2 > 1000 || num3 < 10 || num3 > 1000) {
//            return false;
        int lastNum1 = num1 % 10;
        int lastNum2 = num2 % 10;
        int lastNum3 = num3 % 10;
        if (isValid(num1) && isValid(num2) && isValid(num3)) {

            if ((lastNum1 == lastNum2) || (lastNum1 == lastNum3) || (lastNum2 == lastNum3)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean isValid(int num) {
        if (num >= 10 && num <= 1000) {
            return true;
        }
        return false;
    }
}

