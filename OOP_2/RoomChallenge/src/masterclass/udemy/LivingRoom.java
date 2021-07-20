package masterclass.udemy;

public class LivingRoom {
    private Sofa sofa;
    private Table table;
    private Television television;
    private Chair chair;
    private Lamp lamp;

    public LivingRoom(Sofa sofa, Table table, Television television, Chair chair, Lamp lamp) {
        this.sofa = sofa;
        this.table = table;
        this.television = television;
        this.chair = chair;
        this.lamp = lamp;
    }
    public void enter () {
        System.out.println("You have walked into your living room");
    }

    public Sofa getSofa() {
        return sofa;
    }

    public Table getTable() {
        return table;
    }

    public Television getTelevision() {
        return television;
    }

    public Chair getChair() {
        return chair;
    }

    public Lamp getLamp() {
        return lamp;
    }


}
