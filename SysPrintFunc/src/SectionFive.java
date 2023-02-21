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
    }

    public static int calcScoreForMe(int score, boolean gameOver, int levelCompleted, int bonus) {
        int finalScore = score;
        if (gameOver == true) {
            finalScore += (levelCompleted + bonus);
            System.out.println("Your final score was " + finalScore);
        }
        return finalScore;
    }

    ;

}
