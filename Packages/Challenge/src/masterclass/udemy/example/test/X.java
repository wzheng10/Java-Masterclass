package masterclass.udemy.example.test;

import java.util.Scanner;

public class X {

    private int x;

    public X() {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a number: ");
        this.x = x.nextInt();
        x();
    }

    public void x() {
        for(int x = 0; x <=12; x++) {
            System.out.println(x + " * " + this.x + " = " + this.x * x);
        }
    }
}
