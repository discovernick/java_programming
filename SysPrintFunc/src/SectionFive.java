import sun.awt.windows.WPrinterJob;

public class SectionFive {
    public static void main(String[] args) {


        int g = calcScoreForMe(900, true, 5, 100);
        System.out.println("Your final score was " + g);
///*        score = 10000;
//        levelCompleted = 8;
//        bonus = 200;
//        finalScore = score;
//
//        if (gameOver == true) {
//            finalScore += (levelCompleted + bonus);
//            System.out.println("Your final score was " + finalScore);
//        }*/
        double inches = imperialToMetric(5);
        double feetAndInch = imperialToMetric(6,6);
    }

    public static int calcScoreForMe(int score, boolean gameOver, int levelCompleted, int bonus) {
        int finalScore = score;
        if (gameOver == true) {
            finalScore += (levelCompleted + bonus);
            System.out.println("Your final score was " + finalScore);
        }
        return finalScore;
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player: " + playerName + " scored" + score);
        return score*1000;
    }

    public static double imperialToMetric(double inches) {
        System.out.println(inches*2.54);
        return inches*2.54;
    }

    public static double imperialToMetric(double feet, double inches) {
        System.out.println((feet*12+inches)*2.54);
        return (feet*12+inches)*2.54;
    }


}
