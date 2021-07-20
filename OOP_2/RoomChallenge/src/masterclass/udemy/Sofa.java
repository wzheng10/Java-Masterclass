package masterclass.udemy;

public class Sofa {
    private String comfiness;
    private String color;

    public Sofa(String comfiness, String color) {
        this.comfiness = comfiness;
        this.color = color;
    }
    public void sitting() {
        System.out.println("You are sitting on the sofa!");
    }

    public String getComfiness() {
        return comfiness;
    }

    public String getColor() {
        return color;
    }
}
