package originals;

public class FurtherExercises {
    public static void main(String[] args) {
        boolean isTrue = true;
        if (isTrue == true) {
            System.out.println("equality");
        }
        // Ternary Operator
        int result = 8;
        int results = result > 10 ? 90 : 10;

        // Challenge
        double twenty = 20.00d;
        double eighty = 80.00d;
        double sumOf = (twenty + eighty) * 100.00d;
        double rem = sumOf % 40.00d;
        boolean check = (rem == 0.00) ? true : false;
        System.out.println(check);
        if (!check) {
            System.out.println("Some remainder exists");
        }

    }
}
