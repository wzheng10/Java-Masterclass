package masterclass.udemy;

public class Main {

    public static void main(String[] args) {
        byte byteNum = 10;
        short shortNum = 20;
        int intNum = 50;
        long longNum = 50000L+ 10L * (byteNum + shortNum + intNum);
        System.out.println("My total is " + longNum);
    }
}
