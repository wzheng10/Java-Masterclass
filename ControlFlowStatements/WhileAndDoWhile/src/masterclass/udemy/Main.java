package masterclass.udemy;

public class Main {

    public static void main(String[] args) {
        int count = 1;
//        while (count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//        for(count = 1; count != 6; count++){
//            System.out.println("Count value is " + count);
//        }


        count = 1;
        do {
            System.out.println("Count value is was "+ count);
            count++;
        } while(count != 6);
//        count = 1;
//        while(true) {
//            if(count == 6) {
//                break;
//            }
//            System.out.println("Count value is " + count);
//            count++;
//        }

        int num = 4;
        int finishNumber = 20;
        int evensFound = 0;

        while(num <= finishNumber) {
            num++;
            if(!isEvenNumber(num)) {
                continue;
            }
            System.out.println("Even number " + num);

            evensFound++;
            if (evensFound == 5) {
                break;
            }
        }
        System.out.println("There are " + evensFound + " even numbers found!");
    }

    public static boolean isEvenNumber(int num){
        if ((num % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
