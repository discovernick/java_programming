package originals;

import java.util.Scanner;

public class MovieEditor {
    public static void main(String[] args) {
        //originals.Movie theMovie = new ScienceFiction("Star Wars");
        //theMovie.watchMovie();
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Type:");
            String type = s.nextLine();
            if ("Qq".contains(type)) {
                break;
            }
        }

    }
}

