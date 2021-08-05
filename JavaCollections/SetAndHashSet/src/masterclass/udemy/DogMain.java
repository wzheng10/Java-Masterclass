package masterclass.udemy;

public class DogMain {
    public static void main(String[] args) {
        Labrador rover = new Labrador("Rover");
        Dog rover2 = new Dog("Rover");

        System.out.println(rover2.equals(rover));
        System.out.println(rover.equals(rover2));
        // return false since Dog class is not an instance of Labrador class
        // removing the override method in Labrador will return true
    }
}
