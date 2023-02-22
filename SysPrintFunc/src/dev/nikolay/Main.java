package dev.nikolay;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] myIntArray = getRandomArray(10);
        System.out.println(Arrays.toString(myIntArray));
        Arrays.sort(myIntArray);
        System.out.println(Arrays.toString(myIntArray));
        int[] mySecondArray = new int[10];
        Arrays.fill(mySecondArray, 10);
        System.out.println(Arrays.toString(mySecondArray));
        int[] anotherOne = new int[10];
        int[] jason = Arrays.copyOf(anotherOne, 5);
        System.out.println(Arrays.toString(jason));

        String[] sArray = {"able", "jane", "mark", "ralph", "david"};
        Arrays.sort(sArray);
        if (Arrays.binarySearch(sArray, "mark") >= 0) {
            System.out.println("Found Mark in the list");
        }
    }



    private static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i < len ; i++) {
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }
}
