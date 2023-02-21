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

        // Type Casting Exercise
        // Unless we are declaring literals, Java at compile time will struggle to evaluate the expression
        // Java type casts values to Integers by default - Unless we have a compelling reason, we should always use Int's
        byte minByte = Byte.MIN_VALUE;
        // byte myNewByteValue = (minByte / 2); // This throws an error because the byte expression is treated as an integer
        byte myNewByteValue = (byte) (minByte / 2); // By adding the byte,

        // Summation across Types exercise
        byte byteVal = 90;
        short shortVal = 2000;
        int intVal = 500000;
        long longVal = 50000 + intVal + shortVal + byteVal;

        // double is the default for floating point number - more precise as its larger
        // Can also use suffixes of f/F or d/D for type declaration
        int myIntValue = 5;
        float myFloatValue = 5.0f;
        double myDoubleValue = 5.0;

        // Divison
        System.out.println(5 / 2); // Returns 2 - Truncates any fractional value
        System.out.println(5f / 2f); // Returns 2.5
        System.out.println(5d / 2d ); // Returns 2.5
        System.out.println(5f / 3f); // Returns 1.6666666 (More decimal places in memory)
        System.out.println(5d / 3d ); // Returns 1.6666666666666667 (More decimal places in memory)
        System.out.println(5.00 / 3 ); // Returns Double
        //System.out.println(5.00 / 3f ); // Returns Error

        // Convert Pounds to Kg
        System.out.println(70d * 0.45359237d );

        // When precise calculations are necessary - we can use the Big Decimal type

        // Chars and Strings
        char singleChar = 'y'; // Have to use single quotes for char, String uses double quotes
        // Can pull in the UNICODE value
        // char unicodePull = '⧵u0061'; Does work on JDK 17
        char myDecimalCode = 68; // Can assign integer value too
        System.out.println(myDecimalCode);

        // Challenge
        char mySimpleChar = '?';
        char myUnicodeChar = "?".charAt(0);
        char myDecimalChar = 63;
        System.out.println(mySimpleChar + " & " + myUnicodeChar + " & " + myDecimalChar);

        // Defining Boolean Values
        boolean trueOrNot = false;

        // String is a special class
        String myString = "This is a simple String!";
        String specialChar = "Sum of ⧵u0061 is 6"; // In newer versions of Java this works.
        System.out.println(specialChar);

        // Concatenation
        // + operator, if string is concat, and numbers are addition. String plus anything else is a string
        String someString = "10";
        someString = 90 + someString;
        System.out.println(someString);

        // With chars things get different
        char firstChar = 'a';
        char secondChar = 'b';
        System.out.println(firstChar + secondChar); // Returns 195 - sum of ASCII code values
        System.out.println("" + firstChar + secondChar); // Returns ab due to the first value being a string

        // Reassigning strings multiple times can be super inefficient, so we can use StringBuilder
        // StringBuilder is mutable but doesn't have the same power


    }
}