// Singleton pattern
class Library {
    private static Library instance;
    private List<LibraryItem> items;
    private List<Patron> patrons;

    private Library() {
        items = new ArrayList<>();
        patrons = new ArrayList<>();
    }

    public static Library getInstance() {
        if (instance == null) {
            instance = new Library();
        }
        return instance;
    }

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public void registerPatron(Patron patron) {
        patrons.add(patron);
    }

    public void displayAllItems() {
        System.out.println("Library Inventory:");
        for (LibraryItem item : items) {
            item.displayInfo();
        }
    }
