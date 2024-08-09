public void returnItem(LibraryItem item) {
        if (checkedOutItems.remove(item)) {
            item.returnItem();
            System.out.println(name + " returned: " + item.title);
        } else {
            System.out.println("This item was not checked out by this patron.");
        }
    }

    public void displayCheckedOutItems() {
        System.out.println(name + "'s checked out items:");
        for (LibraryItem item : checkedOutItems) {
            item.displayInfo();
        }
    }
}
