package masterclass.udemy;

public class Main {

    public static void main(String[] args) {
	String numberAsSting = "2018.125";
        System.out.println("numberAsString = " + numberAsSting);

        double number = Double.parseDouble(numberAsSting);
        System.out.println("number = " + number);

        numberAsSting += 1;
        number += 1;
        System.out.println("numberAsString = " + numberAsSting);
        System.out.println("number = " + number);
    }
}
