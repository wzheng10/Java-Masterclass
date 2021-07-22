package masterclass.udemy;

import java.util.Random;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }
    public String plot(){
        return "No plot here";
    }
    public String getName() {
        return this.name;
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }
    public String plot() {
        return "A shark eats lots of people.";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth.";
    }

    public IndependenceDay(String name) {
        super(name);
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze.";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial Forces try to take over the universe" ;
    }
}

class Forgettable extends Movie {
    public Forgettable() {
        super("Forgettable");
    }
    //No plot method
}

public class Main {

    public static void main(String[] args) {
	    for(int i=1; i<11; i++) {
	        Movie movie = randomMovie();
            System.out.println("Movie #" + i + ": " +
                            movie.getName() + "\n" +
                    "Plot: " + movie.plot() + "\n");
        }
    }
    //the for loop in main returns the below
//    Random number generated was: 2
//    Movie #1: Independence Day
//    Plot: Aliens attempt to take over planet earth.
//
//    Random number generated was: 3
//    Movie #2: Maze Runner
//    Plot: Kids try and escape a maze.
//
//    Random number generated was: 4
//    Movie #3: Star Wars
//    Plot: Imperial Forces try to take over the universe
//
//    Random number generated was: 1
//    Movie #4: Jaws
//    Plot: A shark eats lots of people.
//
//    Random number generated was: 2
//    Movie #5: Independence Day
//    Plot: Aliens attempt to take over planet earth.
//
//    Random number generated was: 2
//    Movie #6: Independence Day
//    Plot: Aliens attempt to take over planet earth.
//
//    Random number generated was: 1
//    Movie #7: Jaws
//    Plot: A shark eats lots of people.
//
//    Random number generated was: 5
//    Movie #8: Forgettable
//    Plot: No plot here
//
//    Random number generated was: 4
//    Movie #9: Star Wars
//    Plot: Imperial Forces try to take over the universe
//
//    Random number generated was: 2
//    Movie #10: Independence Day
//    Plot: Aliens attempt to take over planet earth.



    //Purpose is to return a random movie
    public static Movie randomMovie() {
        int randomNumber = (int)(Math.random() * 5) + 1;
        System.out.println("Random number generated was: " + randomNumber);
        switch(randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgettable();
//            default:
//                return null;
        }
        return null;
    }
}
