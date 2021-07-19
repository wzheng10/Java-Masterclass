package masterclass.udemy;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();
        holden.setModel("Commodore");
        porsche.setModel("911");
        System.out.println("Model is " + porsche.getModel());
        System.out.println("Model is " + holden.getModel());

    }
}
