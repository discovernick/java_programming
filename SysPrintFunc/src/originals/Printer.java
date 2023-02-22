package originals;

public class Printer {

    public static void main(String[] args) {
        String g = "25/11/2022";
        System.out.printf("Your name is %s%n", g);

        // Length
        System.out.println(g.length());

        // Basic String Access
        System.out.println(g.charAt(0));

        // Starting Index
        System.out.println(g.startsWith("2"));

        // Extract the Starting Index
        int startingIndex = g.indexOf("2022");

        // Sys Out just the birth year
        System.out.println("Birth Year: " + g.substring(startingIndex));

        // Generate new date with join
        String newDate = String.join("/","25","12","2045");
        System.out.println(newDate);

        // Builder Example
        String trial = "Some Trial Text";
        StringBuilder trialBuilder = new StringBuilder("Some " + "Trial " + "Text");

        printInformation(trial);
        printInformation(trialBuilder);


    }

    public static void printInformation(String string) {
        System.out.println("String = " + string);
        System.out.println("Length = " + string.length());
    }
    public static void printInformation(StringBuilder builder) {
        System.out.println("StringBuilder = " + builder);
        System.out.println("Length = " + builder.length());
        System.out.println(builder.capacity());
    }

}
