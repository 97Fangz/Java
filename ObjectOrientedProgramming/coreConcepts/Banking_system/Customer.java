// Customer.java (Composition)
public class Customer {
    private String name;
    private String id;
    private List<BankAccount> accounts;

    public Customer(String name, String id) {
        this.name = name;
        this.id = id;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public void displayAccounts() {
        System.out.println("Customer: " + name + ", ID: " + id);
        for (BankAccount account : accounts) {
            account.displayBalance();
        }
    }

    // Getters and other methods related to customer management
}
