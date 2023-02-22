package originals;

public class Customer {
    private String name;
    private double limit;
    private String email;

    // Constructors
    public  Customer() {
        this("Name Not Defined","Email Not Defined");
    }
    public Customer(String name, double limit, String email) {
        this.name = name;
        this.limit = limit;
        this.email = email;
    }

    public Customer(String name, String email) {
        this(name, 0, email);
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getLimit() {
        return limit;
    }

    public String getEmail() {
        return email;
    }
}
