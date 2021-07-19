package masterclass.udemy;

public class Car {
    //fields
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;
    //methods
    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera")|| validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }

    }

    public String getModel() {
        return this.model;
    }
}
