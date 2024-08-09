// Inheritance
class Book extends LibraryItem {
    private String author;
    private int pages;

    public Book(String title, String itemID, String author, int pages) {
        super(title, itemID);
        this.author = author;
        this.pages = pages;
    }

    @Override
    public void displayInfo() {
        System.out.println("Book: " + title + " by " + author + ", Pages: " + pages + ", ID: " + itemID + ", Available: " + isAvailable());
    }
}
