package masterclass.udemy;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 300;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score < 5000 && score > 1000) {
//            System.out.println("Your score was less than 5000 but greater than 1000");
//        } else if(score < 1000){
//            System.out.println("Your score was less than 1000");
//        } else {
//            System.out.println("This was executed");
//        }
        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
        //cannot access finalScore variable outside of codeblock
        // int savedFinalScore = finalScore;
        int secondScore = 10000;
        int secondLevelCompleted = 8;
        int secondBonus = 200;

        if (gameOver) {
            int finalScore = secondScore + (secondLevelCompleted * secondBonus);
            System.out.println("Your second final score was " + finalScore);
        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}