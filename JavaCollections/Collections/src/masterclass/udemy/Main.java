package masterclass.udemy;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    Theatre theatre = new Theatre("Olympian", 8, 12);
	    List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
	    printList(seatCopy);

	    seatCopy.get(1).reserve();
	    if(theatre.reserveSeat("A02")) {
            System.out.println("Please pay for A02");
        } else {
            System.out.println("Seat already reserved");
        }
//	    theatre.getSeats();
//	    if(theatre.reserveSeat("D12")) {
//            System.out.println("Please Pay");
//        } else {
//            System.out.println("Sorry, but the seat is taken");
//        }
//        if(theatre.reserveSeat("H11")) {
//            System.out.println("Please Pay");
//        } else {
//            System.out.println("Sorry, but the seat is taken");
//        }
    }

    public static void printList(List<Theatre.Seat> list)  {
        for(Theatre.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("=====================================================================");
    }
}
