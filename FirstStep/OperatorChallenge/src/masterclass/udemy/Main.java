package masterclass.udemy;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args) {

        double num1 = 20.00d;
        double num2 = 80.00d;
        double totalnum = (num1 + num2) * 100.00;   //10000.00
        double remainder = totalnum % 40.00;        //0
        System.out.println("My total is : " + totalnum);
        System.out.println("My remainder is " + remainder);

        boolean zeroRemainder = (remainder == 0) ? true : false;
        if (remainder != 0) {
            System.out.println("Got some remainder");
        } else {
            System.out.println("Nope, got no remainders for you ");
        }
    }
}
