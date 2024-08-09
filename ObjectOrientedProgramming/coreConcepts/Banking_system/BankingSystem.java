// BankingSystem.java (Main Class)
public class BankingSystem {
    public static void main(String[] args) {
        // Create bank instance
        Bank bank = Bank.getInstance();

        // Create customers and accounts
        Customer customer1 = new Customer("John Doe", "C001");
        SavingsAccount savingsAccount1 = new SavingsAccount("S001", 5000.0, customer1, 0.03);
        CheckingAccount checkingAccount1 = new CheckingAccount("C001", 2000.0, customer1, 500.0);
        customer1.addAccount(savingsAccount1);
        customer1.addAccount(checkingAccount1);

        Customer customer2 = new Customer("Jane Smith", "C002");
        SavingsAccount savingsAccount2 = new SavingsAccount("S002", 8000.0, customer2, 0.04);
        CheckingAccount checkingAccount2 = new CheckingAccount("C002", 3000.0, customer2, 300.0);
        customer2.addAccount(savingsAccount2);
        customer2.addAccount(checkingAccount2);

        // Add customers and accounts to the bank
        bank.addCustomer(customer1);
        bank.addCustomer(customer2);
        bank.addAccount(savingsAccount1);
        bank.addAccount(checkingAccount1);
        bank.addAccount(savingsAccount2);
        bank.addAccount(checkingAccount2);

        // Display customer accounts
        bank.displayCustomers();

        // Perform transactions
        savingsAccount1.deposit(1000.0);
        savingsAccount1.calculateInterest();
        checkingAccount1.withdraw(500.0);
        checkingAccount1.enableOverdraft();
        checkingAccount1.withdraw(1000.0);
    }
}
