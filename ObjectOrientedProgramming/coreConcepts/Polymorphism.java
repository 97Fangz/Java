public class ElectricCar extends Car {
    private int batteryCapacity;

    public ElectricCar(String make, String model, int year, int numDoors, int batteryCapacity) {
        super(make, model, year, numDoors);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Battery capacity: " + batteryCapacity + " kWh");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car("Toyota", "Corolla", 2022, 4);
        Vehicle vehicle2 = new ElectricCar("Tesla", "Model 3", 2023, 4, 75);

        vehicle1.displayInfo();
        vehicle2.displayInfo();
    }
}
