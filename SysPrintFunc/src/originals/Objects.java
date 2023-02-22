package originals;

import java.util.Scanner;
public class Objects {

    public static void main(String[] args) {
        // We can instantiate a new string in the following formats - both produce the same result
        int currentYear = 2023;
        //String usersDateOfBirth = new String("1999");
        // System.out.println("Age = " + (Integer.parseInt(currentYear) - Integer.parseInt(usersDateOfBirth)));
        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }

    }

    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Requesting Name Input: ");
        String yob = System.console().readLine("Requesting Year of Birth Input: ");
        int age = 2023 - Integer.parseInt(yob);
        return ("" + name + "'s age is " + age);
    }

    public static String getInputFromScanner(int currentYear) {
        // Built In Classes to read User Input - Supports Input through IDE's
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name? ");
        String name = scanner.nextLine();

        boolean validDOB = false;
        int age = 0;

        do {
            try{
                System.out.println("Year of Birth? ");
                final String yob = scanner.nextLine();
                if (checkData(2023, yob) != -1) {
                    validDOB = true;
                    age = 2023 - Integer.parseInt(yob);
                }
            } catch(NumberFormatException badUserData) {
                System.out.println("Chars not accepted!");
            }

        }
        while ( validDOB == false);

        return ("" + name + "'s age is " + age);
    }

    public static int checkData(int currentYear, String dateOfBirth) {
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        if ((dob < minimumYear) || (dob > currentYear) ) {
            return -1;
        }

        return (currentYear - dob);

    }
}
