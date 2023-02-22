package originals;

public class MainCar {

    public static void main(String[] args) {
        MainCar Tesla = MainCar.createCar("electric","Tesla");
        MainCar Ferrari = new GasPoweredCar("Ferrari");
        MainCar Prius = new HybridCar("Prius");
        MainCar.test(Tesla);
        MainCar.test(Ferrari);
        MainCar.test(Prius);

    }

    // Fields
    private String description;

    private boolean on = false;

    // Constructor
    public MainCar(String description) {
        this.description = description;
    }

    //  Methods

    public static void test(MainCar car) {
        System.out.println(car.toString());
        car.drive();
        car.startEngine();
        car.drive();
        car.type();
    }
    public void startEngine() {
        System.out.println("Engine has started");
        on = true;
    }

    public void drive() {
        if (!on) {
            System.out.println("Start originals.Car First!!!");
        } else {
            runEngine();
        }

    }

    protected void runEngine() {
        System.out.println("Vroom!!!");
    }

    public void type() {
        System.out.println("You're driving a " + getClass().getSimpleName());
    }
    // Factory Function
    public static MainCar createCar(String type, String title) {
        if (type == "hybrid") {
            return new HybridCar(title);
        } else if (type == "electric") {
            return new ElectricCar(title);
        } else {
            return new GasPoweredCar(title);
        }
    }


    @Override
    public String toString() {
        return "originals.MainCar{" +
                "description='" + description + '\'' +
                ", on=" + on +
                '}';
    }
}

class GasPoweredCar extends MainCar {
    // Fields
    private Double avgKmPerLitre;
    private int cylinders;
    // Constructors
    public GasPoweredCar(String description) {
        super(description);
    }

    // Methods
    @Override
    public void startEngine() {
        System.out.println("Gas Flowing to engine bay ...");
        super.startEngine();
    }
}

class ElectricCar extends MainCar {
    // Fields
    private Double avgKmPerCharge;
    private int batterySize;
    // Constructors
    public ElectricCar(String description) {
        super(description);
    }
    // Methods

    @Override
    public void startEngine() {
        System.out.println("Electricity Flowing to motors...");
        super.startEngine();
    }

    @Override
    public String toString() {
        return "originals.ElectricCar{" +
                "avgKmPerCharge=" + avgKmPerCharge +
                ", batterySize=" + batterySize +
                "} " + super.toString();
    }
}

class HybridCar extends MainCar {
    // Fields
    private Double avgKmPerLitre;
    private int batterySize;
    private int cylinders;
    // Constructors
    public HybridCar(String description) {
        super(description);
    }
    // Methods

    @Override
    public void startEngine() {
        System.out.println("Electricity Flowing to motors...");
        System.out.println("Gas Flowing to engine bay ...");
        super.startEngine();
    }
}


