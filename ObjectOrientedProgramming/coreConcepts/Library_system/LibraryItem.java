import java.util.*;

// Abstract class
abstract class LibraryItem {
    protected String title;
    protected String itemID;
    protected boolean isCheckedOut;

    public LibraryItem(String title, String itemID) {
        this.title = title;
        this.itemID = itemID;
        this.isCheckedOut = false;
    }

    public abstract void displayInfo();

    public boolean isAvailable() {
        return !isCheckedOut;
    }

    public void checkOut() {
        isCheckedOut = true;
    }

    public void returnItem() {
        isCheckedOut = false;
    }
}
