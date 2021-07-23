package masterclass.udemy;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        anotherIntValue++;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

//        int[] myIntArray = {1,2,3,4,5};
        int[] myIntArray = new int[5];
        int[] anotherArray =  myIntArray;

        System.out.println("myInt Arrays = " + Arrays.toString(myIntArray));
        System.out.println("anotherArrays = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;

        System.out.println("after change myInt Arrays = " + Arrays.toString(myIntArray));
        System.out.println("after change anotherArrays = " + Arrays.toString(anotherArray));

        anotherArray = new int[] {4, 5, 6, 7, 8};
        modifyArray(myIntArray);

        System.out.println("after modifier myInt Arrays = " + Arrays.toString(myIntArray));
        System.out.println("after modifier change anotherArrays = " + Arrays.toString(anotherArray));
    }

    private static void modifyArray(int[] array) {

        array[0] = 2;
        array = new int[] {1, 2, 3, 4, 5};
    }
}
