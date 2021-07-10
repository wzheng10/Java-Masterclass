package masterclass.udemy;

public class Main {

    public static void main(String[] args) {

	double kilogramConverter = 0.45359237d;
	int poundsOne = 2;
	int poundsTwo = 15;
	float poundsThree = 12.5f;
	float poundsFour = 2.1f;
        System.out.println(poundsOne * kilogramConverter);
        System.out.println(poundsTwo * kilogramConverter);
        System.out.println(poundsThree * kilogramConverter);
        System.out.println(poundsFour * kilogramConverter);


    double numberOfPounds = 200d;
    double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println("Converted Kilograms= "+ convertedKilograms);

    double pi = 3.1415927d;
    double anotherNumber = 3_000_000.3_312_123_000d;
        System.out.println(pi);
        System.out.println(anotherNumber);

    }
}
