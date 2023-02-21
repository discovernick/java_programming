public class BankAccount {

    private String acctNumber;
    private double balance = 0.00;
    private String customerName;
    private String email;
    private String phone;

    // Constructor
    public BankAccount() {
        this("Default", 0, "Default", "Default","Default");
        // The this statement with parameters need to be the first line called in the no-args constructor.
        System.out.println("Empty Constructor Called");
    }

    public BankAccount(String acctNumber, double balance, String customerName, String email, String phone) {
        this.acctNumber = acctNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phone = phone;
        System.out.println("Successfully created new Bank Account");
    }

    // Special Methods
    public double depositFunds(double funds) {
        this.balance += funds;
        System.out.println("Funds Successfully Deposited: $" + funds + " New Balance: $" + balance);
        return balance;
    }

    public double withdrawFunds(double funds) {
        if (funds > this.balance) {
            System.out.println("Insufficient Funds");
            return -1;
        } else {
            this.balance -= funds;
            System.out.println("Funds Successfully Withdrawn: $" + funds + " New Balance: $" + balance);
        }
        return balance;
    };

    // Getters
    public String getAcctNumber() {
        return acctNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    // Setters

    public void setAcctNumber(String acctNumber) {
        this.acctNumber = acctNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
