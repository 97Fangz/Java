class DVD extends LibraryItem {
    private int duration;

    public DVD(String title, String itemID, int duration) {
        super(title, itemID);
        this.duration = duration;
    }

    @Override
    public void displayInfo() {
        System.out.println("DVD: " + title + ", Duration: " + duration + " minutes, ID: " + itemID + ", Available: " + isAvailable());
    }
}
