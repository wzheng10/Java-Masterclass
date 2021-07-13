package masterclass.udemy;

public class Main {
    ///int return///
//    public static void main(String[] args) {
//        getDuration(65, 20);
//        getDuration(180);
//    }
//
//    public static void getDuration( int minutes, int seconds) {
//        if (minutes < 0 || seconds < 0 || seconds > 59) {
//            System.out.println("Invalid Value");
//        }
//        int hours = (minutes + (seconds /60)) / 60;
//        int remainingMinutes = (minutes + (seconds / 60)) % 60;
//        int remainingSeconds = seconds % 60;
//        System.out.println( hours + "h " + remainingMinutes + "m " + remainingSeconds + "s");
//
//    }
//
//    public static void getDuration( int seconds) {
//        if (seconds < 0) {
//            System.out.println("Invalid Value");
//        } else {
//            int minutes = seconds / 60;
//            int remainingSeconds = seconds % 60;
//            System.out.println(minutes + "m " + remainingSeconds + "s ");
//            getDurationString(minutes, remainingSeconds);
//        }
//    }

    ///String return///
    public static void main(String[] args) {
        System.out.println(getDurationString(3600L));
        System.out.println(getDurationString(100600L));
    }

    private static String getDurationString(long minutes, long seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
           return "Invalid String";
        }
        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;
        return (hours + "h " + remainingMinutes + "m " + seconds + "s");
    }

    private static String getDurationString (long seconds) {
        if (seconds < 0) {
            return "Invalid Value";
        }

        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);
    }
}
