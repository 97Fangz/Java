public class Car {
    String make;
    String model;
    int year;

    public void displayInfo() {
        System.out.println("Car: " + year + " " + make + " " + model);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.make = "Toyota";
        car1.model = "Corolla";
        car1.year = 2022;
        car1.displayInfo();

        Car car2 = new Car();
        car2.make = "Honda";
        car2.model = "Civic";
        car2.year = 2023;
        car2.displayInfo();
    }
}
