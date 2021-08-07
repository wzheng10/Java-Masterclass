package masterclass.udemy;

public class Moon extends HeavenlyBody{
//     - A constructor that takes a String (name of the dwarf planet) and
//    a double (its orbital period) and calls its parent class with its arguments.


    public Moon(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.MOON);
    }
}
