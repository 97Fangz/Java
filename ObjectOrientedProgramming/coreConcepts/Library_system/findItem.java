    public LibraryItem findItem(String itemID) {
        for (LibraryItem item : items) {
            if (item.itemID.equals(itemID)) {
                return item;
            }
        }
        return null;
    }

    public Patron findPatron(String patronID) {
        for (Patron patron : patrons) {
            if (patron.getPatronID().equals(patronID)) {
                return patron;
            }
        }
        return null;
    }
}
