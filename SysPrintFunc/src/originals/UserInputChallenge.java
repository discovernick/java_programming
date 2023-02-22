package originals;

import java.util.Scanner;

public class UserInputChallenge {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Scanner scanner = new Scanner(System.in);
        // Get Input
        while ( i<5 ) {
            try {
                System.out.println("Enter Number #" + (i+1) + ":");
                String currentInput = scanner.nextLine();
                int currentInt = Integer.parseInt(currentInput);
                sum += currentInt;
                if (currentInt > max ) {
                    max = currentInt;
                } if (currentInt < min ) {
                    min = currentInt;
                }
                i++;
            } catch (NumberFormatException badUserData) {
                System.out.println("Min: " + min + " Max: " + max);
                return;
            }

        }
        System.out.println("Sum is:" + sum);
    }

}
