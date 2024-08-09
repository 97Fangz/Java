// SavingsAccount.java (Subclass of BankAccount)
public class SavingsAccount extends BankAccount implements Interestable {
    private double interestRate;

    public SavingsAccount(String accountNumber, double initialBalance, Customer owner, double interestRate) {
        super(accountNumber, initialBalance, owner);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + " from account " + accountNumber);
        } else {
            System.out.println("Insufficient funds in account " + accountNumber);
        }
    }

    @Override
    public void calculateInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest of $" + interest + " credited to account " + accountNumber);
    }
}
