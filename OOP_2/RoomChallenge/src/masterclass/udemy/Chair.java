package masterclass.udemy;

public class Chair {
    private int legs;
    private Dimensions dimensions;
    private String color;

    public Chair(int legs, Dimensions dimensions, String color) {
        this.legs = legs;
        this.dimensions = dimensions;
        this.color = color;
    }

    public int getLegs() {
        return legs;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getColor() {
        return color;
    }
}
