public class ClassesChallenge {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("12345",1000,"Jason", "Jason@derulo.com", "0412121212");
        bankAccount.depositFunds(1000);
        bankAccount.withdrawFunds(1001);
    }
}
