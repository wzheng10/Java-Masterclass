package masterclass.udemy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//	// write your code here
//    }
//
//    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        double count = 0;

        while(true){
//            System.out.println("Enter number:");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt) {
                int number = scanner.nextInt();
                count++;
                sum += number;
            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("SUM = " + sum + " AVG = " + Math.round((double)sum/count));
        scanner.close();
    }
}
