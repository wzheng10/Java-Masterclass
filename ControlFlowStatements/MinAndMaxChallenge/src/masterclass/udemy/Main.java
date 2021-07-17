package masterclass.udemy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int min = 0;
//        int max = 0;
        //second approach is to set min to the highest int value and max to the lowest int value
        int min = 2147483647; // Integer.MAX_VALUE;
        int max = -2147483648; //Integer.MIN_VALUE;
//        boolean first = true;           //setting flag to true only once

        while (true) {
            System.out.println("Enter number:");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                ////flag approach///
//                if(first){
//                    first = false;
//                    min = number;
//                    max = number;
//                }
                if(number > max){
                    max = number;
                }
                if(number < min){
                    min = number;
                }

            } else {
                break;
            }
            scanner.nextLine(); //handles input
        }
        System.out.println("min = " + min + ", max= " + max);
        scanner.close();
    }
}
