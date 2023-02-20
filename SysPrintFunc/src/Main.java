public class Main {
    public static void main(String[] args) {
        // Integer Data Type
        int variable_dec = 34;
        // Getting top and bottom ranges of different Wrapper Classes
        // Integer - 32 bits
        int min = Integer.MIN_VALUE; // Using the Integer Wrapper Class
        int max = Integer.MAX_VALUE; // We will underflow and overflow the barriers - will process without error
        System.out.println("Range of Integer between" + min + " and " + max + "takes up " + Integer.SIZE + " bits");
        // Byte - 8 bits
        System.out.println("Range of Byte between" + Byte.MIN_VALUE + " and " + Byte.MAX_VALUE + "takes up " + Byte.SIZE + " bits");
        // Short - 16 bits
        System.out.println("Range of Short between" + Short.MIN_VALUE + " and " + Short.MAX_VALUE + "takes up " + Short.SIZE + " bits");
        // Long - 64 bits
        System.out.println("Range of Long between" + Long.MIN_VALUE + " and " + Long.MAX_VALUE + "takes up " + Long.SIZE + " bits");
        // Can also define a Long value with a suffix
        long LongValue = 100L; // Have to use this for values which are not ints - Java will be default treat this as an int.
        long LongerValue = 2_147_483_647_234L;
        System.out.println(LongerValue);
    }
}