package masterclass.udemy;

public class Main {

    public static void main(String[] args) {
    // a mile is equal to 1.609344 kilometres
        double kilometres = (100 * 1.609344);   //valid expression, but double is a keyword
        int highScore = 50;

        if(highScore == 50);
        System.out.println("This is an expression");

        //Which parts of the code are expressions?
        int score = 100; //score = 100 is the expression    int is a keyword
        if (score > 99) {   //score > 99 (the part in parentheses)  if is a keyword
            System.out.println("You got the high score!");  // the "" inside the () is an expression
            score= 0;   //also valid expression

        //true , false and null are also part of the list of exclusive keywords
        }
    }
}
