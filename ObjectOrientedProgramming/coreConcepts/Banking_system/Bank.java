// Bank.java (Singleton)
public class Bank {
    private static Bank instance;
    private List<Customer> customers;
    private List<BankAccount> accounts;

    private Bank() {
        this.customers = new ArrayList<>();
        this.accounts = new ArrayList<>();
    }

    public static Bank getInstance() {
        if (instance == null) {
            instance = new Bank();
        }
        return instance;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public void displayCustomers() {
        for (Customer customer : customers) {
            customer.displayAccounts();
        }
    }

    // Methods for handling account creation, closure, and transactions
}
