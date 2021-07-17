package masterclass.udemy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int total = 0;
        while (true) {
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                counter++;
                total += number;
                if (counter == 10) {
                    break;
                }
            } else {
                System.out.println("Invalid number");
            }

            scanner.nextLine(); //handle end of line (enter key)
        }

//        boolean hasNextInt = scanner.hasNextInt();
//        if (hasNextInt) {
//            while (counter < 10){
//
//                int number = scanner.nextInt();
//                counter++;
//                total += number;
//
//            }
//            System.out.println("The total sum is" + total);
//        } else {
//            System.out.println("Unable to parse number");
//        }
        System.out.println("Total Sum = " + total);
        scanner.close();
    }
}
