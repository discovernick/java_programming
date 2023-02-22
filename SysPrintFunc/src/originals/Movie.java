package originals;

public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie() {
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film");
    }
    //public static originals.Movie getMovie(String type, String title)
//        return switch (type.toUpperCase().charAt(0)) {
//            case 'A' -> new Adventure(title);
//            case 'C' -> new Adventure(title);
//            case 'S' -> new Adventure(title);
//            default -> new originals.Movie(title);
//       }
//   }


class Adventure extends Movie {

    // Constructor
    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n..%s%n..%s%n", "Pleasant Scene", "Scary Music", "Something Bad Happens");
    }
}

class Comedy extends Movie {

    // Constructor
    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n..%s%n..%s%n", "Something funny happens", "even funnier", "The end");
    }

//
}

class ScienceFiction extends Movie {

    // Constructor
    public ScienceFiction(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n..%s%n..%s%n", "Aliens", "Fun", "The end");
    }
}

}