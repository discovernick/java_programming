package dev.nikolay.array;

import java.util.Objects;
import java.util.Scanner;

public class ReadIntegers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();

        while (true) {
            System.out.println("Enter a Number:");
            String temp = scanner.nextLine();
            // System.out.println(temp);
            // Exit Condition when q or Q is entered
            if ((Objects.equals(temp, "Q")) || (Objects.equals(temp, "q")) ) {
                System.out.println("Broken");
                break;
            } else {
                builder.append(temp);
                builder.append(",");
            }

        }

        // Convert Builder to String Array
        String[] stringArray = builder.toString().split(",");
        int[] intArray = new int[stringArray.length];

        // Convert to Int Array
        // Capture and return min while im at it.
        int min = Integer.MAX_VALUE;
        for ( int i = 0 ; i < intArray.length ; i++ ) {
            intArray[i] = Integer.parseInt(stringArray[i]);
            if (intArray[i] < min) {
                min = intArray[i];
            }
        }
        System.out.println("Minimum = " + min);



    }


}
