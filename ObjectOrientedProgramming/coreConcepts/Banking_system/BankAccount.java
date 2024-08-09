// BankAccount.java (Abstract Class)
public abstract class BankAccount {
    protected String accountNumber;
    protected double balance;
    protected Customer owner;

    public BankAccount(String accountNumber, double initialBalance, Customer owner) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.owner = owner;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + " into account " + accountNumber);
    }

    public abstract void withdraw(double amount);

    public void displayBalance() {
        System.out.println("Account " + accountNumber + ": $" + balance);
    }
}
