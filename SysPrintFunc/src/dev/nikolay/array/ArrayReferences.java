package dev.nikolay.array;

public class ArrayReferences {

    public static void main(String... args) {
        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray; // This variable is simply pointing to myIntArray in Memory
        String[] splitStrings = "Three Separate Words".split(" ");
        System.out.println(splitStrings);
    }

}
