package masterclass.udemy;

public class Main {

    public static void main(String[] args) {
	SomeClass one = new SomeClass("one");
	SomeClass two = new SomeClass("two");
	SomeClass three = new SomeClass("three");

		System.out.println(one.getInstanceNumber());
		System.out.println(two.getInstanceNumber());
		System.out.println(three.getInstanceNumber());

//		one.instanceNumber = 4;
		System.out.println(Math.PI);
//		Math m = new Math();
		int pw = 123459096;
		Password password = new ExtendedPassword(pw);
		password.storePassword();

		password.letMeIn(1);
		password.letMeIn(123);
		password.letMeIn(-1);
		password.letMeIn(123459096);
		password.letMeIn(123456);

	}


}
