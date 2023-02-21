public class Car {

    private String make = "Tesla";
    private String model = "Model X";
    private String colour = "Grey";
    private int doors = 5;
    private boolean convertible = false;

    // Setter Functions
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    // Getter Fuctions
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void describeCar() {
        System.out.println(doors + "-Door" + colour + " " + make + " " + model + " " + (convertible ? "Convertible" : ""));
    }
}
