public class Car extends Vehicle implements Drivable {
    private static int totalCars = 0;

    public Car(String make, String model, int year) {
        super(make, model, year);
        totalCars++;
    }

    public static int getTotalCars() {
        return totalCars;
    }

    // ... other Car code ...
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla", 2022);
        Car car2 = new Car("Honda", "Civic", 2023);

        System.out.println("Total cars created: " + Car.getTotalCars());
    }
}
