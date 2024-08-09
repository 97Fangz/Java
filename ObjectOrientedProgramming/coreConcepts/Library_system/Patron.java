class Patron {
    private String name;
    private String patronID;
    private List<LibraryItem> checkedOutItems;

    public Patron(String name, String patronID) {
        this.name = name;
        this.patronID = patronID;
        this.checkedOutItems = new ArrayList<>();
    }

    public void checkOutItem(LibraryItem item) {
        if (item.isAvailable()) {
            item.checkOut();
            checkedOutItems.add(item);
            System.out.println(name + " checked out: " + item.title);
        } else {
            System.out.println("Item is not available for checkout.");
        }
    }

