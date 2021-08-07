package masterclass.udemy;

public class Planet extends HeavenlyBody{
    //    A constructor that takes a String (name of the planet) and a double (its orbital period)
//    and calls its parent class with its arguments.
    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.PLANET);
    }

    //    addSatellite(), override method. Add the satellite if its body type is a moon.
    @Override
    public boolean addSatellite(HeavenlyBody moon) {
        if (moon.getKey().getBodyType() == BodyTypes.MOON) {
            return super.addSatellite(moon);
        } else {
            return false;
        }
    }


}
