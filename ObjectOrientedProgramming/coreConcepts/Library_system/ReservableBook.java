// Implementing interface
class ReservableBook extends Book implements Reservable {
    private String reservedFor;

    public ReservableBook(String title, String itemID, String author, int pages) {
        super(title, itemID, author, pages);
    }

    @Override
    public void reserve(String patronID) {
        if (!isReserved() && isAvailable()) {
            reservedFor = patronID;
            System.out.println("Book reserved for patron: " + patronID);
        } else {
            System.out.println("Book is not available for reservation.");
        }
    }

    @Override
    public void cancelReservation() {
        reservedFor = null;
        System.out.println("Reservation cancelled.");
    }

    @Override
    public boolean isReserved() {
        return reservedFor != null;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Reserved: " + (isReserved() ? "Yes, for " + reservedFor : "No"));
    }
}
