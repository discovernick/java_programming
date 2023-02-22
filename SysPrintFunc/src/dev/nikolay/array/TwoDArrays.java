package dev.nikolay.array;

import java.util.Arrays;

public class TwoDArrays {

    public static void main(String[] args) {
        int[][] array2 = new int[4][4];
        System.out.println(Arrays.toString(array2)); // This one prints out the hashcode references to each array
        System.out.println("array2.length = " + array2.length);

        // Here were defining the element is the actual array element at each index
        for (int[] outer: array2) {
            System.out.println(Arrays.toString(outer));
        }
        // Prints out the individal items in the array
        for (int i = 0; i < array2.length ; i++) {
            int[] innerArray = array2[i];
            for (int j = 0; j < innerArray.length ; j++) {
                System.out.print(array2[i][j] + " ");
            }
        }

        // Lets define a multi-dimensional arrays
        Object[] arrayThree = new Object[3];
        arrayThree[0] = new String[] {"aq","bf","fc"};
        arrayThree[1] = new int[3][3];
        arrayThree[2] = new String[][]{
                {"1", "2"},{"3","4"}
        };

        // Now lets loop and print this
        for (Object elementOuter : arrayThree) {
                System.out.println("----------------------------");
                System.out.println("Element Type:" + elementOuter.getClass().getSimpleName());
                System.out.println("ToString:" + elementOuter);
                System.out.println(Arrays.deepToString((Object[]) elementOuter));
        }
    }
}
