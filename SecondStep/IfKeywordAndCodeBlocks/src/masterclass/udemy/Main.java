package masterclass.udemy;

import javax.swing.text.Position;

public class Main {

    public static void main(String[] args) {
        //dont need to create the variables now after creating the method calculateScore
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
//        calculateScore(true, 500, 5, 100);
        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);


        //cannot access finalScore variable outside of codeblock
        // int savedFinalScore = finalScore;

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
//        calculateScore(true, 10000, 8, 200);
        calculateScore(gameOver, score, levelCompleted, bonus);


//        score = 10000;
//        levelCompleted = 8;
//        bonus = 200;
//
//        if (gameOver == true) {
//            int finalScore = score + (levelCompleted * bonus);
//            System.out.println("Your final score was " + finalScore);
//        }
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Wei", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Ru", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Ken", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Kyu", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Strat", highScorePosition);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
//            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {
//        if (score >= 1000) {
//            return 1;
//        } else if (score >= 500) {
//            return 2;
//        } else if (score >= 100) {
//            return 3;
//        } else {
//            return 4;
//        }

        int position = 4;

        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }

        return position;
    }

}
