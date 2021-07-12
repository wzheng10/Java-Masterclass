package masterclass.udemy;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else if ( barking && (hourOfDay < 8 || hourOfDay > 22)) {
            return true;
        } else {
            return false;
        }
    }
}

////Alternative////
public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if(!barking || hourOfDay < 0 || hourOfDay > 23 || (hourOfDay > 7 && hourOfDay < 23)){
            return false;
        }
        return true;
    }
}