package masterclass.udemy;

public class Main {

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer && (temperature > 24 && temperature < 46)) {
            return true;
        } else if (!summer && (temperature > 24 && temperature < 36)) {
            return true;
        } else {
            return false;
        }
    }
}
