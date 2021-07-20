package masterclass.udemy;

public class Table {
    private String material;
    private Dimensions dimensions;

    public Table(String material, Dimensions dimensions) {
        this.material = material;
        this.dimensions = dimensions;
    }
    public void pullout(String pullingout) {
        System.out.println("You are" + pullingout + " the chair");
    }

    public String getMaterial() {
        return material;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
