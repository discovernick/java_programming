package dev.nikolay.array;

import java.util.Arrays;
import java.util.Random;

public class ArrayChallenge {

    public static void main(String[] args) {
        // Create a random array of integers
        int[] newArray = new int[25];
        Random random = new Random();
        for(int i = 0; i < newArray.length ; i++) {
            newArray[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(newArray));
        Arrays.sort(newArray);
        System.out.println(Arrays.toString(newArray));
        int[] reversedArray = new int[25];
        for(int i = 0; i < newArray.length ; i++) {
            reversedArray[i] = newArray[newArray.length - 1 - i];
        }
        System.out.println(Arrays.toString(reversedArray));

    }


}
