// CheckingAccount.java (Subclass of BankAccount)
public class CheckingAccount extends BankAccount implements Overdraftable {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, double initialBalance, Customer owner, double overdraftLimit) {
        super(accountNumber, initialBalance, owner);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + " from account " + accountNumber);
        } else {
            System.out.println("Insufficient funds in account " + accountNumber);
        }
    }

    @Override
    public void enableOverdraft() {
        System.out.println("Overdraft enabled for account " + accountNumber);
    }

    @Override
    public void disableOverdraft() {
        System.out.println("Overdraft disabled for account " + accountNumber);
    }
}
