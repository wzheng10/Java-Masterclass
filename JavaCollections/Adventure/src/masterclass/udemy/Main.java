package masterclass.udemy;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        locations.put(0, new Location(0, "You are sitting in front of a computer studying Java"));
        locations.put(1, new Location(1, "You are standing at the and of the road before a small brick building"));
        locations.put(2, new Location(2, "You are at the top of the hill "));
        locations.put(3, new Location(3, "You are inside of the building, a well house for a small spring"));
        locations.put(4, new Location(4, "You are in a Valley beside of a stream"));
        locations.put(5, new Location(5, "You are in the forest"));

        locations.get(1).addExit("W", 2);
        locations.get(1).addExit("E", 3);
        locations.get(1).addExit("S", 4);
        locations.get(1).addExit("N", 5);
//        locations.get(1).addExit("Q", 0);

        locations.get(2).addExit("N", 5);
//        locations.get(2).addExit("Q", 0);

        locations.get(3).addExit("w", 1);
//        locations.get(3).addExit("Q", 0);

        locations.get(4).addExit("N", 1);
        locations.get(4).addExit("W", 2);
//        locations.get(4).addExit("Q", 0);

        locations.get(5).addExit("S", 1);
        locations.get(5).addExit("W", 2);
//        locations.get(5).addExit("Q", 0);

        int loc = 1;
        while (true) {
            System.out.println(locations.get(loc).getDescription());
            if (loc == 0) {
                break;
            }
            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available Exits are ");
            for (String exit : exits.keySet()) {
                System.out.print(exit + ", ");
            }
            System.out.println();

            String direction = scanner.nextLine().toUpperCase();
            if (direction.length() > 1) {

                String[] allDirections = direction.split(" ");
                for (String i : allDirections) {
                    if (i.equalsIgnoreCase("north")) {
                        direction = "N";
                    } else if (i.equalsIgnoreCase("south")) {
                        direction = "S";
                    } else if (i.equalsIgnoreCase("west")) {
                        direction = "W";
                    } else if (i.equalsIgnoreCase("east")) {
                        direction = "E";
                    } else if (i.equalsIgnoreCase("quit")) {
                        direction = "Q";
                    }
                }
            }
            if (exits.containsKey(direction)) {
                loc = exits.get(direction);
            } else {
                System.out.println("You cannot go in that direction");
            }
        }
//        String[] road = "You are standing at the end of a road before a small brick building".split(" ");
//        for(String i: road) {
//            System.out.println(i);
//        }
//        System.out.println("=======================================");
//
//        String[] building = "You are inside a building, a well house for a small spring".split(",");
//        for (String i: building) {
//            System.out.println(i);
//        }
    }
}
