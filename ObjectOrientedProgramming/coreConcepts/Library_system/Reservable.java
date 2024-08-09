// Interface
interface Reservable {
    void reserve(String patronID);
    void cancelReservation();
    boolean isReserved();
}

