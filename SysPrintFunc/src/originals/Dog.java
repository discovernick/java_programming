package originals;

public class Dog extends Animal {
    private String earShape;
    private String tailShape;

    // Constructors
    public Dog() {
        super("Mutt", "Big",50);
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    public Dog(String type, double weight) {
        this(type, weight, "Perky", "Curled");
    }

    // Methods
    private void bark() {
        System.out.println("bark");
    }

    private void run() {
        System.out.println("run");
    }

    private void walk() {
        System.out.println("walk");
    }

    private void wagTail() {
        System.out.println("wag");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        // System.out.println("Dogs walk, run and wag their tail");
        if (speed == "slow") {
            walk();
            wagTail();
        } else if (speed == "fast") {
            run();
            bark();

        }
    }

    public void makeNoise() {
        if (type == "Wolf") {
            System.out.println("Wolf");
        }
        bark();
        System.out.println("woof! ");
    }

    @Override
    public String toString() {
        return "originals.Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }
}
