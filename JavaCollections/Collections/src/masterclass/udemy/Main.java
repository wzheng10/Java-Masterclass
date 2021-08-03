package masterclass.udemy;

public class Main {

    public static void main(String[] args) {
	    Theatre theatre = new Theatre("Olympian", 8, 12);
//	    theatre.getSeats();
	    if(theatre.reserveSeat("D12")) {
            System.out.println("Please Pay");
        } else {
            System.out.println("Sorry, but the seat is taken");
        }
//        if(theatre.reserveSeat("H11")) {
//            System.out.println("Please Pay");
//        } else {
//            System.out.println("Sorry, but the seat is taken");
//        }
    }
}
