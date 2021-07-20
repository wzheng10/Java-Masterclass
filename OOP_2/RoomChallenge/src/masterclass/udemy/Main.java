package masterclass.udemy;

public class Main {

    public static void main(String[] args) {
        Sofa theSofa = new Sofa("Very Comfy", "Grey");
        Table theTable = new Table("Oak Wood", new Dimensions(10, 10, 10));
        Television theTelevision = new Television(100, 20, new Dimensions(10,1, 10));
        Chair theChair = new Chair(4, new Dimensions(5, 5, 5), "Brown");
        Lamp theLamp = new Lamp(new Dimensions(8, 8, 40), "is Very Bright");

	    LivingRoom theLivingRoom = new LivingRoom(theSofa, theTable, theTelevision, theChair, theLamp);
	    theLivingRoom.enter();
	    theLamp.flipSwitch();
	    theSofa.sitting();

    }
}
