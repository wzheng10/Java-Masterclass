package masterclass.udemy;

public class Lamp {
    private Dimensions dimensions;
    private String isBright;

    public Lamp(Dimensions dimensions, String isBright) {
        this.dimensions = dimensions;
        this.isBright = isBright;
    }
    public void flipSwitch () {
        System.out.println("You have flipSwitch and turned on the lamp.");
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getIsBright() {
        return isBright;
    }
}
