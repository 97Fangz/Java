public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = Library.getInstance();

        // Adding items to the library
        library.addItem(new Book("The Great Gatsby", "B001", "F. Scott Fitzgerald", 180));
        library.addItem(new DVD("Inception", "D001", 148));
        library.addItem(new ReservableBook("To Kill a Mockingbird", "B002", "Harper Lee", 281));

        // Registering patrons
        Patron patron1 = new Patron("Alice", "P001");
        Patron patron2 = new Patron("Bob", "P002");
        library.registerPatron(patron1);
        library.registerPatron(patron2);

        // Display all items
        library.displayAllItems();

        // Checkout and return operations
        LibraryItem book1 = library.findItem("B001");
        patron1.checkOutItem(book1);
        patron1.displayCheckedOutItems();

        LibraryItem dvd1 = library.findItem("D001");
        patron2.checkOutItem(dvd1);
        patron2.displayCheckedOutItems();

        patron1.returnItem(book1);

        // Reservation demo
        ReservableBook reservableBook = (ReservableBook) library.findItem("B002");
        reservableBook.reserve("P001");
        reservableBook.displayInfo();
        reservableBook.cancelReservation();
        reservableBook.displayInfo();

        // Final inventory check
        library.displayAllItems();
    }
}
