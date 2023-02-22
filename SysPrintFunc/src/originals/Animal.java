package originals;

public class Animal {
    protected String type;
    private String size;
    private double weight;

    // Constructor
    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }
    // No args constructor
    public Animal() {

    }

    // To String Method
    @Override
    public String toString() {
        return "originals.Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void move(String speed) {
        System.out.println(type + " moves " + speed);
    }

    public void makeNoise() {
        System.out.println(type + " make some kind of noise");
    }
}


