package masterclass.udemy;

public class DwarfPlanet extends HeavenlyBody{
//     - A constructor that takes a String (name of the dwarf planet) and
//    a double (its orbital period) and calls its parent class with its arguments.


    public DwarfPlanet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.DWARF_PLANET);
    }
}
