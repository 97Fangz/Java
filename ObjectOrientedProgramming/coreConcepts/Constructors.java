public class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public Car(String make, String model) {
        this(make, model, 2023); // Default year
    }

    // Getters, setters, and displayInfo() method...
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla", 2022);
        Car car2 = new Car("Honda", "Civic");
        
        car1.displayInfo();
        car2.displayInfo();
    }
}
