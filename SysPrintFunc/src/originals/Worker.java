package originals;

public class Worker {

    private String name;

    private String birthDate;
    protected String endDate;

    public int getAge() {
        return ( 2023 - Integer.parseInt(birthDate) );
    }

    public double collectPay() {
        return 0.0;
    }

    public void terminate(String endDate) {
        this.endDate = "2023";
    }

    // Constructor

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public static void main(String[] args) {
        HourlyEmployee emp = new HourlyEmployee("Jason","1992","2010",150.00);
        System.out.println(emp.getAge());
        System.out.println(emp.collectPay());
        emp.getDoublePay();
        System.out.println(emp.collectPay());
        System.out.println(emp.toString());
    }

    @Override
    public String toString() {
        return "originals.Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}

class Employee extends Worker {
    private long employeeid;
    private String hireDate;

    private static  int employeeNo = 1;

    // Constructor
    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.employeeid = Employee.employeeNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "originals.Employee{" +
                "employeeid=" + employeeid +
                ", hireDate='" + hireDate + '\'' +
                ", endDate='" + endDate + '\'' +
                "} " + super.toString();
    }
}

class HourlyEmployee extends Employee {
    private double hourlyPayRate;

    // Constructor
    public HourlyEmployee(String name, String birthDate, String hireDate, double hourlyPayRate) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public void getDoublePay() {
        this.hourlyPayRate *= 2;
    }

    @Override
    public double collectPay() {
        return (int) hourlyPayRate;
    }

    @Override
    public String toString() {
        return "originals.HourlyEmployee{" +
                "hourlyPayRate=" + hourlyPayRate +
                ", endDate='" + endDate + '\'' +
                "} " + super.toString();
    }
}
